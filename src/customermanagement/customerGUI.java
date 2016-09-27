/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermanagement;

import gui.WaWiMainGUI;
import lists.KundList;

/**
 *
 * @author Markus
 */
public class customerGUI extends javax.swing.JFrame {

    KundList Kundenliste = new KundList();

    /**
     * Creates new form customerGUI
     */
    public customerGUI() {
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

        buttonBack = new javax.swing.JButton();
        labelCM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKunden = new javax.swing.JTable();
        buttonAktualisieren = new javax.swing.JButton();
        buttonAnlegen = new javax.swing.JButton();
        buttonBearbeiten = new javax.swing.JButton();
        buttonLoeschen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(811, 869));

        buttonBack.setText("Zurück");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        labelCM.setText("Kundenverwaltung");

        tableKunden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KNR", "Nachname", "Vorname", "Strasse", "HausNr", "PLZ", "Ort"
            }
        ));
        jScrollPane1.setViewportView(tableKunden);

        buttonAktualisieren.setText("Aktualisieren");
        buttonAktualisieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAktualisierenActionPerformed(evt);
            }
        });

        buttonAnlegen.setText("Kunden anlegen");

        buttonBearbeiten.setText("Kunden bearbeiten");

        buttonLoeschen.setText("Kunden löschen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonBack)
                        .addGap(105, 105, 105)
                        .addComponent(labelCM)
                        .addGap(26, 26, 26)
                        .addComponent(buttonAktualisieren)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAnlegen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBearbeiten)
                            .addComponent(buttonLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(labelCM)
                    .addComponent(buttonAktualisieren))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAnlegen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonBearbeiten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonLoeschen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        setVisible(false);
        WaWiMainGUI wawiGUI = new WaWiMainGUI();
        wawiGUI.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonAktualisierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAktualisierenActionPerformed
        tabelleaktualisieren();
    }//GEN-LAST:event_buttonAktualisierenActionPerformed

    public void tabelleausgeben() {
        Kundenliste.KundenInTabelleAusgeben(tableKunden);
    }

    private void tabelleaktualisieren() {
        tabelleHolen();
        tabelleausgeben();
    }

    private void tabelleHolen() {
        Kundenliste.TabelleHolen();
    }

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
            java.util.logging.Logger.getLogger(customerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAktualisieren;
    private javax.swing.JButton buttonAnlegen;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonBearbeiten;
    private javax.swing.JButton buttonLoeschen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCM;
    private javax.swing.JTable tableKunden;
    // End of variables declaration//GEN-END:variables

}
