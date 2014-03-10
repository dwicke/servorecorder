/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package darwinservos;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import model.ServoModel;

/**
 *
 * @author drew
 */
public class DarwinServos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        /*
        Socket sock = new Socket("10.0.0.51", 40009);
        PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
        pw.println("Hello World");
        sock.close();
        pw.close();
                */
        
        
        Gson gson = new Gson();
        
        ServoModel[] mods = gson.fromJson("[{name:\"HeadYaw\",\"current\":23}]", ServoModel[].class);
        System.out.println(mods[0].getName());
    }
    
}
