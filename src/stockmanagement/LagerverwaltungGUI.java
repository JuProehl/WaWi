/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import gui.WaWiMainGUI;

/**
 *
 * @author Markus
 */
public class LagerverwaltungGUI extends javax.swing.JFrame {

    /**
     * Creates new form LagerGUI
     */
    public LagerverwaltungGUI() {
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

        jLabel2 = new javax.swing.JLabel();
        buttonPicklist = new javax.swing.JButton();
        buttonBestand = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        buttonLagerplatz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lagerverwaltung");

        buttonPicklist.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        buttonPicklist.setText("Neue Pickinglist");
        buttonPicklist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPicklist.setName(""); // NOI18N
        buttonPicklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPicklistActionPerformed(evt);
            }
        });

        buttonBestand.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        buttonBestand.setText("Artikel und Bestände");
        buttonBestand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBestand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBestandActionPerformed(evt);
            }
        });

        buttonBack.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        buttonBack.setText("Zurück");
        buttonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonLagerplatz.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        buttonLagerplatz.setText("Lagerplätze");
        buttonLagerplatz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLagerplatz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLagerplatzActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPicklist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLagerplatz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBestand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addComponent(buttonBestand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLagerplatz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPicklist)
                .addGap(128, 128, 128))
        );

        jLabel2.getAccessibleContext().setAccessibleName("labelLager");
        buttonPicklist.getAccessibleContext().setAccessibleName("buttonPicklist");
        buttonBestand.getAccessibleContext().setAccessibleName("buttonBestand");
        buttonBack.getAccessibleContext().setAccessibleName("buttonBack");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        //neue PickingList generieren und GUI öffnen
    private void buttonPicklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPicklistActionPerformed
        setVisible(false);
        PickinglistGUI pickshowGUI = new PickinglistGUI();
        pickshowGUI.setVisible(true);
        pickshowGUI.showTable();
        //pickshowGUI.buildPickingList();
    }//GEN-LAST:event_buttonPicklistActionPerformed
    //zurück zum Startfenster
    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        setVisible(false);
        WaWiMainGUI wawiGUI = new WaWiMainGUI();
        wawiGUI.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed
    //ArtikelbestandGUI öffnen
    private void buttonBestandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBestandActionPerformed
        setVisible(false);
        ArtikelbestandGUI bestandGUI = new ArtikelbestandGUI();
        bestandGUI.setVisible(true);
        bestandGUI.tabelleausgeben();
    }//GEN-LAST:event_buttonBestandActionPerformed
    //Lagerübersicht öffnen
    private void buttonLagerplatzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLagerplatzActionPerformed
        setVisible(false);
        LagerGUI lagerGUI = new LagerGUI();
        lagerGUI.setVisible(true);
        lagerGUI.Tabelleausgeben();
    }//GEN-LAST:event_buttonLagerplatzActionPerformed

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
            java.util.logging.Logger.getLogger(LagerverwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerverwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerverwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerverwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerverwaltungGUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonBestand;
    private javax.swing.JButton buttonLagerplatz;
    private javax.swing.JButton buttonPicklist;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
