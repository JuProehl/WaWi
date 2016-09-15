/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import entity.Arti;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lists.LageList;

/**
 *
 * @author matthias
 */
public class EditOKArtikelMetadaten extends javax.swing.JFrame {

        
    Integer ANR;
    Integer LNr;
    String Bezeichnung;
    Integer kritMenge;
    ArtikelbestandGUI artikelbestand;
    LageList LagerListe;
         
    /**
     * Creates new form MetaDatenEditOKGUI
     */
    public EditOKArtikelMetadaten() {
        initComponents();
    }
    
    public EditOKArtikelMetadaten(int ANr, int LNr, String Bezeichnung, int kritMenge,ArtikelbestandGUI Artikelbestand) {
        initComponents();
        this.ANR = ANr;
        this.LNr = LNr;
        this.Bezeichnung = Bezeichnung;
        this.kritMenge = kritMenge;
        this.artikelbestand = Artikelbestand;
        String str = "FROM Lage Where LNr = " + LNr;
        LagerListe = new LageList(str);
        
        
        Label_ANR_Set.setText(this.ANR.toString());
        JTF_Bezeichnung.setText(Bezeichnung);
        JTF_kritMenge.setText(this.kritMenge.toString());
        JTF_LagerOrt.setText(this.LNr.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        JButton_OK = new javax.swing.JButton();
        JTF_Bezeichnung = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Label_ANR_Set = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTF_kritMenge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTF_LagerOrt = new javax.swing.JTextField();

        jLabel1.setText("Metadaten bearbeiten");

        jLabel2.setText("Bezeichnung");

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

        JTF_Bezeichnung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTF_BezeichnungKeyPressed(evt);
            }
        });

        jLabel3.setText("Artikelnummer");

        jLabel4.setText("kritische Menge");

        JTF_kritMenge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTF_kritMengeKeyPressed(evt);
            }
        });

        jLabel5.setText("Lagerort");

        JTF_LagerOrt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTF_LagerOrtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Label_ANR_Set))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JButton_OK))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTF_Bezeichnung, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_kritMenge, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_LagerOrt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Label_ANR_Set))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_Bezeichnung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTF_kritMenge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTF_LagerOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(JButton_OK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);

    }//GEN-LAST:event_jButtonBackActionPerformed

    private void JButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_OKActionPerformed
       bearbeiten();
    }//GEN-LAST:event_JButton_OKActionPerformed

    private void JButton_OKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JButton_OKKeyPressed

    }//GEN-LAST:event_JButton_OKKeyPressed

    private void JTF_BezeichnungKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_BezeichnungKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            bearbeiten();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            setVisible(false);
        }
    }//GEN-LAST:event_JTF_BezeichnungKeyPressed

    private void JTF_kritMengeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_kritMengeKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            bearbeiten();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            setVisible(false);
        }
    }//GEN-LAST:event_JTF_kritMengeKeyPressed

    private void JTF_LagerOrtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_LagerOrtKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            bearbeiten();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            setVisible(false);
        }
    }//GEN-LAST:event_JTF_LagerOrtKeyPressed

    private void bearbeiten(){
        Integer EditLNr = 0;
        Integer EditkritMenge = 0;
        Boolean succes = true;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arti artikel = new Arti();
        Boolean LNRCHECK = false;
        
        
        try{
        EditLNr = Integer.parseInt(JTF_LagerOrt.getText());
        EditkritMenge = Integer.parseInt(JTF_kritMenge.getText());
        } 
        catch (NumberFormatException e){
            general.Message.showError("Fehler!", "Bitte nur für Lagernummer und kritische Menge nur Zahlen eingeben");
            succes = false;
        }
        
        if(succes){
            list.add(EditLNr);
            list.add(EditkritMenge);
            
            if(!general.Check.istNegativ(list)){
        
                String EditBezeichnung = JTF_Bezeichnung.getText();
                String UpdateString = "UPDATE Arti SET";
                String ShowString;
                
                if(EditkritMenge <= LagerListe.getMaxMenge(0)){
        
                    if ( this.LNr == EditLNr && this.Bezeichnung.equals(EditBezeichnung) && this.kritMenge == EditkritMenge ){
                        setVisible(false);
                           general.Message.showSuccess("Keine Änderungen", "Kein Änderungen durchgeführt!");
                        } else {
                    
                        
                    
                    if (!(this.LNr == EditLNr)){
                        if(!(artikel.UpdateLNrCheck(EditLNr)==0)){
                            UpdateString = UpdateString + " F_LNR=" + EditLNr;
                            LNRCHECK = true;
                        } 
                   }
                    if (!(this.Bezeichnung.equals(EditBezeichnung))){
                        if (LNRCHECK){
                            UpdateString = UpdateString + ",BEZEICHNUNG='" + EditBezeichnung + "'";
                        } else {
                            UpdateString = UpdateString + " BEZEICHNUNG='" + EditBezeichnung + "'";
                        }
                    }
                    if (!(this.kritMenge == EditkritMenge)){
                       if (LNRCHECK || !(this.Bezeichnung.equals(EditBezeichnung)) ){
                            UpdateString = UpdateString + ",krit_Menge=" + EditkritMenge;
                        } else {
                            UpdateString = UpdateString + " krit_Menge=" + EditkritMenge;
                        } 
                    }
                    
                    if(!UpdateString.equals("UPDATE Arti SET")){
        
                    UpdateString = UpdateString + " WHERE ANr=" + this.ANR.toString();
                    Integer returnwert = artikel.UpdateArtikelFree(UpdateString);
                    setVisible(false);
                    artikelbestand.tabelleHolen();
                    artikelbestand.tabelleausgeben();
                    }
        
                     
                }
                }else { 
                    general.Message.showError("Fehler", "Die kritische Menge darf nicht höher als die Fachgröße sein!");
                }
            
            }
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
            java.util.logging.Logger.getLogger(EditOKArtikelMetadaten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOKArtikelMetadaten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOKArtikelMetadaten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOKArtikelMetadaten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditOKArtikelMetadaten().setVisible(true);
            }
        });
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_OK;
    private javax.swing.JTextField JTF_Bezeichnung;
    private javax.swing.JTextField JTF_LagerOrt;
    private javax.swing.JTextField JTF_kritMenge;
    private javax.swing.JLabel Label_ANR_Set;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
