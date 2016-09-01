/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lagerverwaltung;

/**
 *
 * @author Markus
 */
public class AnlegenGUI extends javax.swing.JFrame {

    /**
     * Creates new form AnlegenGUI
     */
    public AnlegenGUI() {
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
        labelA_anlegen = new javax.swing.JLabel();
        tfANR = new javax.swing.JTextField();
        tfBez = new javax.swing.JTextField();
        tfBestandsmenge = new javax.swing.JTextField();
        tfKrit = new javax.swing.JTextField();
        tfLNR = new javax.swing.JTextField();
        labelANR = new javax.swing.JLabel();
        labelBEZ = new javax.swing.JLabel();
        labelMenge = new javax.swing.JLabel();
        labelKrit = new javax.swing.JLabel();
        labelA_LNR = new javax.swing.JLabel();
        labelL_anlegen = new javax.swing.JLabel();
        labelLagerort = new javax.swing.JLabel();
        labelRegal = new javax.swing.JLabel();
        labelFach = new javax.swing.JLabel();
        labelMaxM = new javax.swing.JLabel();
        tfLagernummer = new javax.swing.JTextField();
        tfRegal = new javax.swing.JTextField();
        tfFach = new javax.swing.JTextField();
        tfmaxMenge = new javax.swing.JTextField();
        buttonArtikelAnlegen = new javax.swing.JButton();
        buttonLagerAnlegen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(725, 500));

        buttonBack.setText("Zurück");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        labelA_anlegen.setText("Artikel anlegen");

        labelANR.setText("Artikelnummer:");

        labelBEZ.setText("Bezeichnung:");

        labelMenge.setText("Bestandsmenge:");

        labelKrit.setText("kritische Menge:");

        labelA_LNR.setText("Lieferantennummer:");

        labelL_anlegen.setText("Lagerort anlegen");

        labelLagerort.setText("Lagerortnummer:");

        labelRegal.setText("Regal:");

        labelFach.setText("Fach:");

        labelMaxM.setText("Max. Menge:");

        buttonArtikelAnlegen.setText("Artikel anlegen");

        buttonLagerAnlegen.setText("Lagerort anlegen");
        buttonLagerAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLagerAnlegenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelANR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(tfANR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelA_anlegen)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBEZ)
                                    .addComponent(labelMenge)
                                    .addComponent(labelKrit)
                                    .addComponent(labelA_LNR))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfBestandsmenge, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(tfKrit)
                                    .addComponent(tfBez)
                                    .addComponent(tfLNR)
                                    .addComponent(tfLagernummer)
                                    .addComponent(tfRegal)
                                    .addComponent(tfFach)
                                    .addComponent(tfmaxMenge)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelLagerort))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBack)
                            .addComponent(labelL_anlegen)
                            .addComponent(labelRegal)
                            .addComponent(labelFach)
                            .addComponent(labelMaxM))))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonArtikelAnlegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLagerAnlegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonBack)
                .addGap(18, 18, 18)
                .addComponent(labelA_anlegen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelANR)
                            .addComponent(tfANR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBEZ)))
                    .addComponent(buttonArtikelAnlegen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMenge)
                    .addComponent(tfBestandsmenge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKrit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLNR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA_LNR))
                .addGap(18, 18, 18)
                .addComponent(labelL_anlegen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLagerort)
                            .addComponent(tfLagernummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRegal)
                            .addComponent(tfRegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonLagerAnlegen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFach)
                    .addComponent(tfFach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaxM)
                    .addComponent(tfmaxMenge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        setVisible(false);
        LagerverwaltungGUI lagerGUI = new LagerverwaltungGUI();
        lagerGUI.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonLagerAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLagerAnlegenActionPerformed
        entity.Lagerort lager = new entity.Lagerort();
        
    }//GEN-LAST:event_buttonLagerAnlegenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(AnlegenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnlegenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnlegenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnlegenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnlegenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonArtikelAnlegen;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonLagerAnlegen;
    private javax.swing.JLabel labelANR;
    private javax.swing.JLabel labelA_LNR;
    private javax.swing.JLabel labelA_anlegen;
    private javax.swing.JLabel labelBEZ;
    private javax.swing.JLabel labelFach;
    private javax.swing.JLabel labelKrit;
    private javax.swing.JLabel labelL_anlegen;
    private javax.swing.JLabel labelLagerort;
    private javax.swing.JLabel labelMaxM;
    private javax.swing.JLabel labelMenge;
    private javax.swing.JLabel labelRegal;
    private javax.swing.JTextField tfANR;
    private javax.swing.JTextField tfBestandsmenge;
    private javax.swing.JTextField tfBez;
    private javax.swing.JTextField tfFach;
    private javax.swing.JTextField tfKrit;
    private javax.swing.JTextField tfLNR;
    private javax.swing.JTextField tfLagernummer;
    private javax.swing.JTextField tfRegal;
    private javax.swing.JTextField tfmaxMenge;
    // End of variables declaration//GEN-END:variables
}