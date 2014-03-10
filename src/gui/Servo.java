/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import control.ServoControl;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.ServoModel;

/**
 *
 * @author drew
 */
public class Servo extends javax.swing.JPanel {

    private ServoModel modelData[];
    /**
     * Creates new form Servo
     */
    public Servo() {
        initComponents();
    }
    boolean done = false;
    public void setServoModel(ServoModel[] model) {
        modelData = model;
        
        servoList.setModel(new DefaultComboBoxModel(model));
    }
    private int NUM_TICKS = 16;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        ServoSlider = new javax.swing.JSlider();
        labelServoVal = new javax.swing.JLabel();
        minCalibrated = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        minValField = new javax.swing.JLabel();
        maxValField = new javax.swing.JLabel();
        maxCalibrated = new javax.swing.JCheckBox();
        servoList = new javax.swing.JComboBox();
        hardnessSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        hardnessLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        ServoSlider.setMajorTickSpacing(5);
        ServoSlider.setMaximum(4);
        ServoSlider.setMinimum(-150);
        ServoSlider.setPaintTicks(true);
        ServoSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ServoSliderStateChanged(evt);
            }
        });

        labelServoVal.setText(String.valueOf(ServoSlider.getValue()));

        minCalibrated.setText("Calibrated");

        jLabel1.setText("min:");

        jLabel2.setText("max:");

        minValField.setText("jLabel3");

        maxValField.setText("jLabel4");

        maxCalibrated.setText("Calibrated");

        servoList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        servoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servoListActionPerformed(evt);
            }
        });

        hardnessSlider.setMaximum(NUM_TICKS);
        hardnessSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hardnessSliderStateChanged(evt);
            }
        });

        jLabel3.setText("Hardness:");

        hardnessLabel.setText(String.valueOf((double)(hardnessSlider.getValue()) / NUM_TICKS));

        jLabel5.setText("Servo Angle:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(servoList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ServoSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addComponent(labelServoVal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxValField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxCalibrated))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minValField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minCalibrated)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hardnessSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hardnessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(servoList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(labelServoVal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ServoSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(hardnessLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hardnessSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(minValField)
                                .addComponent(minCalibrated))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(maxValField)
                                .addComponent(maxCalibrated)))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ServoSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ServoSliderStateChanged
        // TODO add your handling code here:
        if (done == true){
            //labelServoVal.setText(String.valueOf(modelData.getCurrent()));
            //modelData.setCurrent(ServoSlider.getValue());
            //labelServoVal.setText(String.valueOf(ServoSlider.getValue()));
            int val = ServoSlider.getValue();
            ((ServoModel) servoList.getSelectedItem()).setCurrent(val);
            labelServoVal.setText(String.valueOf(val));
            System.out.println(((ServoModel) servoList.getSelectedItem()).getCurrent());
            
            ServoControl.getServoControl().setServo(((ServoModel) servoList.getSelectedItem()));
        }
    }//GEN-LAST:event_ServoSliderStateChanged

    private void servoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servoListActionPerformed
        // TODO add your handling code here:
        if (modelData != null) {
            ServoModel selected = (ServoModel) servoList.getSelectedItem();
            ServoSlider.setMinimum(selected.getMin());
            ServoSlider.setMaximum(selected.getMax());
            ServoSlider.setValue(selected.getCurrent());
            System.out.println("Current" + selected.getCurrent());
            labelServoVal.setText(String.valueOf(selected.getCurrent()));
            ServoSlider.setMajorTickSpacing(5);
            ServoSlider.updateUI();
            ServoSlider.repaint();
            
            hardnessSlider.setValue((int) (selected.getHardness() * NUM_TICKS));
            
            
            
            done = true;
        }
        
    }//GEN-LAST:event_servoListActionPerformed

    private void hardnessSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hardnessSliderStateChanged
        // TODO add your handling code here:
        if (done == true)
        {
            int val = hardnessSlider.getValue();
            ((ServoModel) servoList.getSelectedItem()).setHardness(((double)val)/((double)NUM_TICKS));
            hardnessLabel.setText(String.valueOf(((double)val)/((double)NUM_TICKS)));
            ServoControl.getServoControl().setServoHardness(((ServoModel) servoList.getSelectedItem()));
        }
        
        
    }//GEN-LAST:event_hardnessSliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider ServoSlider;
    private javax.swing.JLabel hardnessLabel;
    private javax.swing.JSlider hardnessSlider;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelServoVal;
    private javax.swing.JCheckBox maxCalibrated;
    private javax.swing.JLabel maxValField;
    private javax.swing.JCheckBox minCalibrated;
    private javax.swing.JLabel minValField;
    private javax.swing.JComboBox servoList;
    // End of variables declaration//GEN-END:variables
}
