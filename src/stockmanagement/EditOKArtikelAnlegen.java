/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import database.DB_Connect;
import entity.Arti;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matthias
 */
public class EditOKArtikelAnlegen extends javax.swing.JFrame {

    Integer ANR;
    ArtikelbestandGUI artikelbestand;
    
    /**
     * Creates new form ArtikelAnlegenEditOK
     */
    public EditOKArtikelAnlegen() {
        initComponents();
    }
    
    public EditOKArtikelAnlegen(ArtikelbestandGUI artikelbestand){
        initComponents();
        ANR = nextANR();
        this.artikelbestand = artikelbestand;
        Label_Artikelnummer.setText(ANR.toString());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelKrit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buttonArtikelAnlegen = new javax.swing.JButton();
        labelA_LNR = new javax.swing.JLabel();
        labelA_anlegen = new javax.swing.JLabel();
        tfBez = new javax.swing.JTextField();
        tfBestandsmenge = new javax.swing.JTextField();
        tfKrit = new javax.swing.JTextField();
        tfLNR = new javax.swing.JTextField();
        labelANR = new javax.swing.JLabel();
        labelMenge = new javax.swing.JLabel();
        labelBEZ = new javax.swing.JLabel();
        Label_Artikelnummer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelKrit.setText("kritische Menge:");

        jButton1.setText("Abbrechen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonArtikelAnlegen.setText("OK");
        buttonArtikelAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonArtikelAnlegenActionPerformed(evt);
            }
        });

        labelA_LNR.setText("Lagerortnummer:");

        labelA_anlegen.setText("Artikel anlegen");

        tfBez.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBezKeyPressed(evt);
            }
        });

        tfBestandsmenge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBestandsmengeKeyPressed(evt);
            }
        });

        tfKrit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfKritKeyPressed(evt);
            }
        });

        tfLNR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfLNRKeyPressed(evt);
            }
        });

        labelANR.setText("Artikelnummer:");

        labelMenge.setText("Bestandsmenge:");

        labelBEZ.setText("Bezeichnung:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonArtikelAnlegen))
                    .addComponent(labelA_anlegen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBEZ, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelA_LNR, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelKrit, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelMenge)
                                    .addGap(5, 5, 5)))
                            .addComponent(labelANR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Artikelnummer)
                            .addComponent(tfBestandsmenge, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKrit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBez, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLNR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelA_anlegen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelANR)
                    .addComponent(Label_Artikelnummer))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBEZ))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonArtikelAnlegen)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonArtikelAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonArtikelAnlegenActionPerformed
    anlegen();
    }//GEN-LAST:event_buttonArtikelAnlegenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfLNRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLNRKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tfLNRKeyPressed

    private void tfKritKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKritKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tfKritKeyPressed

    private void tfBestandsmengeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBestandsmengeKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tfBestandsmengeKeyPressed

    private void tfBezKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBezKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tfBezKeyPressed

    
    
    
    private void abfangenKey(java.awt.event.KeyEvent evt){
          if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            setVisible(false);
        }
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            anlegen();
        }
    }
    
    private void anlegen(){
            ArrayList<Integer> list = new ArrayList<Integer>();
        boolean success = true;
        try {
            list.add(Integer.parseInt(tfBestandsmenge.getText()));
            list.add(Integer.parseInt(tfKrit.getText()));
            list.add(Integer.parseInt(tfLNR.getText()));
        } catch (NumberFormatException e) {
            general.Message.showError("Eingabefehler", "Eingaben überprüfen!");
            success = false;

        }
        if (success) {
            if (!general.Check.istNegativ(list)) {
                Arti artikel = new Arti();
                int i = artikel.InsertArtikel(ANR, tfBez.getText(),
                    Integer.parseInt(tfBestandsmenge.getText()), Integer.parseInt(tfKrit.getText()),
                    Integer.parseInt(tfLNR.getText()));
                switch (i) {
                    case 1:
                    general.Message.showSuccess("", "Anlage erfolgreich!");
                        setVisible(false);
                        artikelbestand.tabelleHolen();
                        artikelbestand.tabelleausgeben();
                    break;
                    case 2:
                    general.Message.showError("", "Artikel existiert bereits!");
                    break;
                    case 3:
                    general.Message.showError("", "Lagerort existiert nicht!");
                    break;
                    case 4:
                    general.Message.showError("", "Lagerort bereits vergeben!");
                    break;
                    case 5:
                    general.Message.showError("", "Kritische Menge ist zu groß! Die Fachmenge ist kleiner als die kritische Menge"); 
                    break;
                    case 6:
                    general.Message.showError("", "Bestand kann nicht in das Fach eingelagert werden, da das Fach zu klein ist!");
                    break;
                }
            }
        }
    }
    
       private Integer nextANR(){
       
            
        DB_Connect con = new DB_Connect();
        List list = con.Connect("SELECT max(A.ANR) FROM Arti A");
        System.out.println(list);
     
        Integer MaxANR = (Integer) list.get(0);
        MaxANR = MaxANR + 1;
        return MaxANR;
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
            java.util.logging.Logger.getLogger(EditOKArtikelAnlegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOKArtikelAnlegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOKArtikelAnlegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOKArtikelAnlegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditOKArtikelAnlegen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Artikelnummer;
    private javax.swing.JButton buttonArtikelAnlegen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelANR;
    private javax.swing.JLabel labelA_LNR;
    private javax.swing.JLabel labelA_anlegen;
    private javax.swing.JLabel labelBEZ;
    private javax.swing.JLabel labelKrit;
    private javax.swing.JLabel labelMenge;
    private javax.swing.JTextField tfBestandsmenge;
    private javax.swing.JTextField tfBez;
    private javax.swing.JTextField tfKrit;
    private javax.swing.JTextField tfLNR;
    // End of variables declaration//GEN-END:variables
}