
// von Julian Pröhl, Matthias Escher
// von Markus Overberg, Marc Czolbe
package stockmanagement;

import entity.Arti;
import lists.ArtiList;
import java.awt.event.KeyEvent;

public class ArtikelbestandGUI extends javax.swing.JFrame {

    ArtiList ArtikelListe = new ArtiList();

    /**
     * Creates new form ArtikelbestandGUI
     */
    public ArtikelbestandGUI() {
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
        tableArtikelbestand = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buttonAktualisieren = new javax.swing.JButton();
        jButton_Einlagern = new javax.swing.JButton();
        jButton_Auslagern = new javax.swing.JButton();
        jButton_Korrektur = new javax.swing.JButton();
        jButton_MetaDaten = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        JButton_Anlegen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        buttonBack.setText("Zurück");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        tableArtikelbestand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artikelnummer", "Bezeichnung", "Bestandsmenge", "krit. Menge", "Lagernummer", "Verkaufspreis €"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableArtikelbestand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableArtikelbestandKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableArtikelbestand);

        jLabel1.setText("Artikelbestand");

        buttonAktualisieren.setText("Aktualisieren (F5)");
        buttonAktualisieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAktualisierenActionPerformed(evt);
            }
        });

        jButton_Einlagern.setText("Einlagern (F1)");
        jButton_Einlagern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EinlagernActionPerformed(evt);
            }
        });

        jButton_Auslagern.setText("Auslagern (F2)");
        jButton_Auslagern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AuslagernActionPerformed(evt);
            }
        });

        jButton_Korrektur.setText("Bestandskorrektur (F3)");
        jButton_Korrektur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KorrekturActionPerformed(evt);
            }
        });

        jButton_MetaDaten.setText("Metadaten bearbeiten (F4)");
        jButton_MetaDaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MetaDatenActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Löschen (F6)");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        JButton_Anlegen.setText("Anlegen (F7)");
        JButton_Anlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_AnlegenActionPerformed(evt);
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
                            .addComponent(jButton_Korrektur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Auslagern, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Einlagern, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_MetaDaten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JButton_Anlegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jButton_Einlagern)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Auslagern)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Korrektur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_MetaDaten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButton_Anlegen)
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
        tabelleaktualisieren();
    }//GEN-LAST:event_buttonAktualisierenActionPerformed

    private void jButton_EinlagernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EinlagernActionPerformed
        einlagernAufrufen();
    }//GEN-LAST:event_jButton_EinlagernActionPerformed

    private void tableArtikelbestandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableArtikelbestandKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tableArtikelbestandKeyPressed

    private void jButton_AuslagernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AuslagernActionPerformed
        auslagernAufrufen();
    }//GEN-LAST:event_jButton_AuslagernActionPerformed

    private void jButton_KorrekturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KorrekturActionPerformed
        korriegierenAufrufen();
    }//GEN-LAST:event_jButton_KorrekturActionPerformed

    private void jButton_MetaDatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MetaDatenActionPerformed
        bearbeitenAufrufen();
    }//GEN-LAST:event_jButton_MetaDatenActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        deleteaufrufen();
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void JButton_AnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_AnlegenActionPerformed
        anlegenAufrufen();
    }//GEN-LAST:event_JButton_AnlegenActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_formKeyPressed

    private void abfangenKey(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            einlagernAufrufen();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            auslagernAufrufen();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            korriegierenAufrufen();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            bearbeitenAufrufen();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            tabelleaktualisieren();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F6) {
            deleteaufrufen();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F7) {
            anlegenAufrufen();
        }

    }
    //Tabelle in die die GUI ausgeben
    public void tabelleausgeben() {
        ArtikelListe.ArtikelInTabelleAusgeben(tableArtikelbestand);
    }
    //ArtikelListe neu aus der Datenbank holen
    public void tabelleHolen() {
        ArtikelListe.TabelleHolen();
    }
    //holen und ausgeben in einem Schritt
    public void tabelleaktualisieren() {
        tabelleHolen();
        tabelleausgeben();
    }

    
    //Aufrufen der Einlagern GUI mit der ausgewählten Zeile 
    private void einlagernAufrufen() {
        try {
            int row = tableArtikelbestand.getSelectedRow();
            Arti artikel = ArtikelListe.getArti(row);
            EditOKArtikelEinlagern EinlagernGUI = new EditOKArtikelEinlagern(artikel, this);
            EinlagernGUI.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            general.Message.showError("Fehler", "Bitte Zeile auswählen!");
        }
    }
    //Aufrufen der Auslagern GUI mit der ausgewählten Zeile 
    private void auslagernAufrufen() {
        try {
            int row = tableArtikelbestand.getSelectedRow();
            Arti artikel = ArtikelListe.getArti(row);
            EditOKArtikelAuslagern AuslagernGUI = new EditOKArtikelAuslagern(artikel, this);
            AuslagernGUI.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            general.Message.showError("Fehler", "Bitte Zeile auswählen!");
        }
    }
    //Aufrufen der Bestandkorrektur GUI mit der ausgewählten Zeile 
    private void korriegierenAufrufen() {
        try {
            int row = tableArtikelbestand.getSelectedRow();
            Arti artikel = ArtikelListe.getArti(row);
            EditOKArtikelKorrektur KorrekturGUI = new EditOKArtikelKorrektur(artikel, this);
            KorrekturGUI.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            general.Message.showError("Fehler", "Bitte Zeile auswählen!");
        }
    }
    //Aufrufen der Metadaten GUI mit der ausgewählten Zeile 
    private void bearbeitenAufrufen() {

        try {
            int row = tableArtikelbestand.getSelectedRow();
            Arti artikel = ArtikelListe.getArti(row);
            EditOKArtikelMetadaten MetaDatenGUI = new EditOKArtikelMetadaten(artikel, this);
            MetaDatenGUI.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            general.Message.showError("Fehler", "Bitte Zeile auswählen!");
        }

    }
    //Löschen aufrufen mit der ausgewählten Zeile
    private void deleteaufrufen() {
        try {
            int row = tableArtikelbestand.getSelectedRow();
            int i = ArtikelListe.getArti(row).loescheArtikel();
            switch (i) {
                case 2:
                    general.Message.showError("Fehler", "Artikel mit Bestand können nicht gelöscht werden!");
                    break;
                case 1:
                    general.Message.showSuccess("Erfolgreich!", "Dantensatz mit der Artikelnummer " + ArtikelListe.getANR(row) + " wurde gelöscht!");
                    break;
                default:
                    general.Message.showError("Fehler", "Datensatz konnte nicht gelöscht werden!");
                    break;
            }
            tabelleHolen();
            tabelleausgeben();
        } catch (ArrayIndexOutOfBoundsException e) {
            general.Message.showError("Fehler", "Bitte Zeile auswählen!");
        }
    }
    //aufrufen der Anlegen GUI
    private void anlegenAufrufen() {
        EditOKArtikelAnlegen anlegen = new EditOKArtikelAnlegen(this);
        if(anlegen.aufbauenderCB_LNr()){
            anlegen.setVisible(true);
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
            java.util.logging.Logger.getLogger(ArtikelbestandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArtikelbestandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArtikelbestandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArtikelbestandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArtikelbestandGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Anlegen;
    private javax.swing.JButton buttonAktualisieren;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton jButton_Auslagern;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Einlagern;
    private javax.swing.JButton jButton_Korrektur;
    private javax.swing.JButton jButton_MetaDaten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableArtikelbestand;
    // End of variables declaration//GEN-END:variables
}
