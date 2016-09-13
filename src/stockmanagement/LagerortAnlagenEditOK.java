/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import database.DB_Connect;
import entity.Lage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matthias
 */
public class LagerortAnlagenEditOK extends javax.swing.JFrame {
    
    int LNR;
    LagerGUI lagergui;

    /**
     * Creates new form LagerortAnlagenEditOK
     */
    
    
    public LagerortAnlagenEditOK() {

   
    }
    public LagerortAnlagenEditOK(LagerGUI lagergui) {

        initComponents();
        LNR = nextLNR();
        this.lagergui = lagergui;
        Label_Lagerortnummer.setText(nextLNR().toString());
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonLagerAnlegen = new javax.swing.JButton();
        labelL_anlegen = new javax.swing.JLabel();
        labelLagerort = new javax.swing.JLabel();
        labelRegal = new javax.swing.JLabel();
        labelFach = new javax.swing.JLabel();
        labelMaxM = new javax.swing.JLabel();
        tfRegal = new javax.swing.JTextField();
        tfFach = new javax.swing.JTextField();
        tfmaxMenge = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Label_Lagerortnummer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonLagerAnlegen.setText("OK");
        buttonLagerAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLagerAnlegenActionPerformed(evt);
            }
        });

        labelL_anlegen.setText("Lagerort anlegen");

        labelLagerort.setText("Lagerortnummer:");

        labelRegal.setText("Regal:");

        labelFach.setText("Fach:");

        labelMaxM.setText("Max. Menge:");

        jButton1.setText("Abbrechen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelLagerort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Label_Lagerortnummer))
                            .addComponent(labelL_anlegen)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFach)
                                    .addComponent(labelMaxM)
                                    .addComponent(labelRegal))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfFach, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfmaxMenge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonLagerAnlegen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfRegal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelL_anlegen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLagerort)
                    .addComponent(Label_Lagerortnummer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelRegal)
                        .addGap(24, 24, 24)
                        .addComponent(labelFach)
                        .addGap(18, 18, 18)
                        .addComponent(labelMaxM))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfRegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfFach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfmaxMenge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(buttonLagerAnlegen))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLagerAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLagerAnlegenActionPerformed
            anlegen();
    }//GEN-LAST:event_buttonLagerAnlegenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LagerortAnlagenEditOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerortAnlagenEditOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerortAnlagenEditOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerortAnlagenEditOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerortAnlagenEditOK().setVisible(true);
            }
        });
    }
    
   public void anlegen(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean success = true;
        try {
            list.add(Integer.parseInt(tfRegal.getText()));
            list.add(Integer.parseInt(tfFach.getText()));
            list.add(Integer.parseInt(tfmaxMenge.getText()));
        } catch (NumberFormatException e) {
            general.Message.showError("Eingabefehler", "Eingaben überprüfen!");
            success = false;
        }
        if (success) {
            if (!general.Check.istNegativ(list)) {
                Lage ort = new Lage();
                int i = ort.InsertLagerort(LNR, Integer.parseInt(tfRegal.getText()),
                    Integer.parseInt(tfFach.getText()), Integer.parseInt(tfmaxMenge.getText()));
                switch (i) {
                    case 1:
                    setVisible(false);
                    general.Message.showSuccess("", "Anlage erfolgreich!");
                    lagergui.TabelleHolen();
                    lagergui.Tabelleausgeben();
                    break;
                    case 2:
                    general.Message.showError("", "Lagerort existiert bereits!");
                    break;
                    case 3:
                    general.Message.showError("", "Regal-Fach-Kombination bereits vergeben!");
                    break;
                }
            }
        }
   }
   
   
   public Integer nextLNR(){
       
            
        DB_Connect con = new DB_Connect();
        List list = con.Connect("SELECT max(L.LNr) FROM Lage L");
        System.out.println(list);
     
        Integer MaxLNR = (Integer) list.get(0);
        MaxLNR = MaxLNR + 1;
        return MaxLNR;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Lagerortnummer;
    private javax.swing.JButton buttonLagerAnlegen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelFach;
    private javax.swing.JLabel labelL_anlegen;
    private javax.swing.JLabel labelLagerort;
    private javax.swing.JLabel labelMaxM;
    private javax.swing.JLabel labelRegal;
    private javax.swing.JTextField tfFach;
    private javax.swing.JTextField tfRegal;
    private javax.swing.JTextField tfmaxMenge;
    // End of variables declaration//GEN-END:variables
}
