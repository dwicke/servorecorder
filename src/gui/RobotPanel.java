/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import control.ServoControl;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicScrollBarUI;
import model.ServoModel;

/**
 *
 * @author drew
 */
public class RobotPanel extends javax.swing.JPanel {

    /**
     * Creates new form RobotPanel
     */
    public RobotPanel() {
        initComponents();
    }
    
    
    
    private JPanel servoViewPanel;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        connect1 = new gui.Connect();
        jButton1 = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(connect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(connect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (ServoControl.getServoControl().isConnected()) {
            try {
                ServoModel[] models = ServoControl.getServoControl().getServos();
                createServoViews(models);
            } catch (IOException ex) {
                Logger.getLogger(RobotPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton1MouseClicked


    private void createServoViews(ServoModel[] models) {
        if (servoViewPanel != null)
            servoViewPanel.removeAll();
        else
            servoViewPanel = new JPanel(new FlowLayout());
        for (int i = 0; i < 5/*models.length*/; i++) {
            Servo s = new Servo();
            models[i].setIndex(i+1);
            s.setServoModel(models[i]);
            servoViewPanel.add(s);
            s.setVisible(true);
            
        }
        servoViewPanel.setVisible(true);
        servoViewPanel.setSize(500, 500);
        servoViewPanel.updateUI();
        servoViewPanel.repaint();
        this.add(servoViewPanel);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.Connect connect1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}