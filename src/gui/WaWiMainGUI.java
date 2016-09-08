/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

//test

import report.ReportMainGUI;
import stockmanagement.LagerverwaltungGUI;

/**
 *
 * @author Markus
 */
public class WaWiMainGUI extends javax.swing.JFrame {

    /**
     * Creates new form WaWiGUI
     */
    public WaWiMainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonLager = new javax.swing.JButton();
        buttonReport = new javax.swing.JButton();
        labelWaWi = new javax.swing.JLabel();
        buttonKundenverwaltung = new javax.swing.JButton();
        buttonBenutzerverwaltung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(725, 500));
        setSize(new java.awt.Dimension(800, 600));

        buttonLager.setText("Lagerverwaltung");
        buttonLager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLagerActionPerformed(evt);
            }
        });

        buttonReport.setText("Report");
        buttonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReportActionPerformed(evt);
            }
        });

        labelWaWi.setText("Warenwirtschaftssystem");

        buttonKundenverwaltung.setText("Kundenverwaltung");

        buttonBenutzerverwaltung.setText("Benutzerverwaltung");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(labelWaWi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(buttonLager, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBenutzerverwaltung)
                        .addGap(18, 18, 18)
                        .addComponent(buttonKundenverwaltung)
                        .addGap(18, 18, 18)
                        .addComponent(buttonReport)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelWaWi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLager)
                    .addComponent(buttonBenutzerverwaltung)
                    .addComponent(buttonKundenverwaltung)
                    .addComponent(buttonReport))
                .addContainerGap(395, Short.MAX_VALUE))
        );

        buttonLager.getAccessibleContext().setAccessibleName("buttonLager");
        buttonReport.getAccessibleContext().setAccessibleName("buttonReport");
        labelWaWi.getAccessibleContext().setAccessibleName("labelWaWi");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLagerActionPerformed
        setVisible(false);
        LagerverwaltungGUI lGUI = new LagerverwaltungGUI();
        lGUI.setVisible(true);
                
    }//GEN-LAST:event_buttonLagerActionPerformed

    private void buttonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReportActionPerformed
        setVisible(false);
        ReportMainGUI rGUI = new ReportMainGUI();
        rGUI.setVisible(true);
    }//GEN-LAST:event_buttonReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WaWiMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WaWiMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WaWiMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WaWiMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaWiMainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBenutzerverwaltung;
    private javax.swing.JButton buttonKundenverwaltung;
    private javax.swing.JButton buttonLager;
    private javax.swing.JButton buttonReport;
    private javax.swing.JLabel labelWaWi;
    // End of variables declaration//GEN-END:variables
}