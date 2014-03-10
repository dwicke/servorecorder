/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import javax.xml.stream.util.StreamReaderDelegate;
import model.ServoModel;

/**
 *
 * @author drew
 */
public class ServoControl {
    
    private static ServoControl me = null;
    private JsonReader jr;
    private JsonWriter jw;
    private Socket sock;
    private Reader reader;
    private PushbackReader pr;
    private PrintWriter pw;
    private Gson gson = new Gson();
    private boolean isConnected = false;
    private ServoModel data[];
    
    private ServoControl() {
        
    }
    
    
    public static ServoControl getServoControl() {
        if(me == null) {
            me = new ServoControl();
        }
        return me;
    }
    
    public boolean isConnected(){
        return isConnected && (sock != null) && sock.isConnected() && !sock.isClosed();
    }
    public void connect(String ip, int port) throws IOException {
        sock = new Socket();
        sock.connect(new InetSocketAddress(ip, port), 3000);
        pw = new PrintWriter(sock.getOutputStream(), true);
        jw = new JsonWriter(pw);
        reader = new InputStreamReader(sock.getInputStream());
        pr = new PushbackReader(reader);
        jr = new JsonReader(pr);
        isConnected = true;
    }
    
    public void disconnect() throws IOException {
        sock.close();
        isConnected = false;
    }
    
    class SetServos {
        String action = "setServos";
        ServoModel args;
    }
    class GetServos {
        String action = "getServos"; String args = "";

        public GetServos() {
        }
        
    }
    
    public void setServo(ServoModel model) {
        SetServos gs = new SetServos();
        gs.args = model;
        String out = gson.toJson(gs);
        System.out.println(out);
        pw.println(out);
        pw.flush();
        System.out.println("sent servo");
    }
    
    public ServoModel[] getServos() throws IOException {
        
        //jw.beginObject().name("action").value("getServos").name("args").value("").endObject().flush();
        String j = gson.toJson(new GetServos());
        System.out.println(j);
        System.out.flush();
        pw.println(j);
        pw.flush();
        System.out.println("Sent " + j);
        // really should be in a seprate thead with a callback but i'm lazy...
        pr.unread(pr.read());
        
        char buff[] = new char[100];
        StringBuilder sb = new StringBuilder();
        while(pr.ready()) {
            int read = pr.read(buff);
            sb.append(String.copyValueOf(buff, 0, read));
            buff = new char[100];
        }
        
        System.out.println(sb.toString());
        data = gson.fromJson(sb.toString(), ServoModel[].class);
        
        for (int i = 0; i < data.length; i++) {
            data[i].setIndex(i+1);
        }
        
        
        return data;
    }
    
}
