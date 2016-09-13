/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import database.DB_Connect;
import lists.LageList;
import entity.Arti;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author matthias
 */
public class EinlagernEditOkGUI extends javax.swing.JFrame {
    
    int ANR;
    int LNr;
    int AktMenge;
    LageList LagerListe;
    ArtikelbestandGUI Artikelbestand;
    /**
     * Creates new form NewJFrame
     */
    public EinlagernEditOkGUI() {
        initComponents();
    }
    
    public EinlagernEditOkGUI(int ANR, int LNr, int AktMenge, ArtikelbestandGUI ArtikelBestand) {
        initComponents();
        this.ANR = ANR;
        this.LNr = LNr;
        this.AktMenge = AktMenge;
        this.Artikelbestand = ArtikelBestand;
        String str = "FROM Lage Where LNr = " + LNr;
        LagerListe = new LageList(str);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBack = new javax.swing.JButton();
        JButton_OK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTF_Menge = new javax.swing.JTextField();

        jButtonBack.setText("Abbrechen");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        JButton_OK.setText("OK");
        JButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_OKActionPerformed(evt);
            }
        });
        JButton_OK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JButton_OKKeyPressed(evt);
            }
        });

        jLabel1.setText("Einlagern");

        jLabel2.setText("Menge");

        JTF_Menge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTF_MengeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButton_OK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(JTF_Menge))
                            .addComponent(jLabel1))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_Menge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(JButton_OK))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_OKActionPerformed
        einlagern();
    }//GEN-LAST:event_JButton_OKActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
       
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void JButton_OKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JButton_OKKeyPressed
       
    }//GEN-LAST:event_JButton_OKKeyPressed

    private void JTF_MengeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_MengeKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            einlagern();
        } 
         if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
             setVisible(false);
        }
    }//GEN-LAST:event_JTF_MengeKeyPressed

    private void einlagern(){
        Integer MaxMenge = LagerListe.getMaxMenge(0);
        ArrayList<Integer> Zahlen = new ArrayList<Integer>();
        try {
        Integer PlusMenge = Integer.parseInt(JTF_Menge.getText()); 
        Zahlen.add(PlusMenge);
        if (!general.Check.istNegativ(Zahlen)){ 
            if(PlusMenge+AktMenge <= MaxMenge){   
                Arti artikel = new Arti();
                int i = artikel.UpdateArtikelAdd(Integer.parseInt(JTF_Menge.getText()), ANR);
                Artikelbestand.TabelleHolen();
                Artikelbestand.Tabelleausgeben();
                setVisible(false);
            } else {
                int moeglicheMenge = MaxMenge-AktMenge;
             general.Message.showError("Eingabefehler", "Maximale Menge überschritten! Es können nur " + moeglicheMenge + " Einheiten eingelagert werden!");
                }
            }
       } catch (NumberFormatException e) {
          general.Message.showError("Eingabefehler", "Eingaben überprüfen!");
        }
       
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
            java.util.logging.Logger.getLogger(EinlagernEditOkGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EinlagernEditOkGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EinlagernEditOkGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EinlagernEditOkGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EinlagernEditOkGUI().setVisible(true);
            }
           
        });
        
        
       
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_OK;
    private javax.swing.JTextField JTF_Menge;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
