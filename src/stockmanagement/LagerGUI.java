
// von Julian Pröhl, Matthias Escher
// von Markus Overberg, Marc Czolbe
package stockmanagement;

import database.DB_Connect;
import entity.Arti;
import entity.Lage;
import java.util.*;
import lists.LageList;

public class LagerGUI extends javax.swing.JFrame {

    LageList LagerListe = new LageList();

    /**
     * Creates new form ArtikelbestandGUI
     */
    public LagerGUI() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLagerbestand = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buttonAktualisieren = new javax.swing.JButton();
        jButton_bearbeiten = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_anlegen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonBack.setText("Zurück");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        tableLagerbestand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lagernummer", "Regal", "Fach", "Fachgröße", "ANR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLagerbestand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableLagerbestandKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableLagerbestand);

        jLabel1.setText("Lagerübersicht");

        buttonAktualisieren.setText("Aktualisieren");
        buttonAktualisieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAktualisierenActionPerformed(evt);
            }
        });
        buttonAktualisieren.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonAktualisierenKeyPressed(evt);
            }
        });

        jButton_bearbeiten.setText("Lagerfach bearbeiten (F2)");
        jButton_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bearbeitenActionPerformed(evt);
            }
        });

        jButton_delete.setText("Lagerfach löschen (F3)");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_anlegen.setText("Lagerfach anlegen (F1)");
        jButton_anlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_anlegenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonBack)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(buttonAktualisieren))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_bearbeiten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_anlegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(jLabel1)
                    .addComponent(buttonAktualisieren))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton_anlegen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_bearbeiten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_delete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        setVisible(false);
        LagerverwaltungGUI lagerGUI = new LagerverwaltungGUI();
        lagerGUI.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonAktualisierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAktualisierenActionPerformed
        TabelleHolen();
        Tabelleausgeben();


    }//GEN-LAST:event_buttonAktualisierenActionPerformed

    private void tableLagerbestandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableLagerbestandKeyPressed

    }//GEN-LAST:event_tableLagerbestandKeyPressed

    private void buttonAktualisierenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonAktualisierenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAktualisierenKeyPressed

    private void jButton_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bearbeitenActionPerformed
        bearbeitenaufrufen();
    }//GEN-LAST:event_jButton_bearbeitenActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        deleteaufrufen();
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_anlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_anlegenActionPerformed
        EditOKLagerortAnlegen anlegenGUI = new EditOKLagerortAnlegen(this);
        anlegenGUI.setVisible(true);
    }//GEN-LAST:event_jButton_anlegenActionPerformed

        //Lagerliste in die Tabelle ausgeben
    public void Tabelleausgeben() {
        LagerListe.LagerInTabelleAusgeben(tableLagerbestand);
    }
        //Lagerliste aktualisieren
    public void TabelleHolen() {
        LagerListe.TabelleHolen();
    }
        //Aufrufen der GUI zum bearbeiten eines Lagerfachs
    private void bearbeitenaufrufen() {
        try {
            int row = tableLagerbestand.getSelectedRow();
            EditOKLagerortMetadaten metadatengui = new EditOKLagerortMetadaten(this, LagerListe.getLage(row));
            metadatengui.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            general.Message.showError("Fehler", "Bitte Zeile auswählen!");
        }
    }
        //Aufrufen der Löschenmethode, um ein Lagerfach zu löschen 
        //Auswahl durch auswählen der Zeile
        //Überprüfung ob noch ein Artikel mit dem Lagerfach verknüpft ist
    private void deleteaufrufen() {

        try {
            int row = tableLagerbestand.getSelectedRow();
            Lage lage = LagerListe.getLage(row);
            int lnr = lage.getLNr();

            DB_Connect con = new DB_Connect();
            int j = con.simpleConnect("SELECT F_LNR FROM Arti WHERE F_LNR=" + lnr);
            if (j == 0) {
                int i = lage.deleteLage();
                if (i == 1) {
                    general.Message.showSuccess("Erfolgreich!", "Dantensatz mit der Lagernummer " + lnr + " wurde gelöscht!");
                } else {
                    general.Message.showError("Fehler", "Datensatz konnte nicht gelöscht werden!");
                }
                TabelleHolen();
                Tabelleausgeben();
            } else {

                Arti arti = new Arti();
                List artilist = con.Connect("FROM Arti WHERE F_LNR=" + lnr);
                arti = (Arti) artilist.get(0);
                general.Message.showError("Fehler!", "Es ist noch ein Artikel mit der Artikelnummer " + arti.getANR() + " und der Bezeichnung '" + arti.getBEZEICHNUNG() + "' dem Lagerort zugeordnet. ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            general.Message.showError("Fehler", "Bitte Zeile auswählen!");
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
            java.util.logging.Logger.getLogger(LagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>  
        //</editor-fold>  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAktualisieren;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton jButton_anlegen;
    private javax.swing.JButton jButton_bearbeiten;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLagerbestand;
    // End of variables declaration//GEN-END:variables
}
