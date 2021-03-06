
// von Julian Pröhl, Matthias Escher
// von Markus Overberg, Marc Czolbe
package customermanagement;

// Bibliotheken import
import entity.Kund;
import java.awt.event.KeyEvent;

// Klasse zum Ändern der Metadaten von Kunden
public class EditOKKundenMetaDaten extends javax.swing.JFrame {

    customerGUI customerGUI;
    Kund kunde;
    Integer KNR;
    String Nachname;
    String Vorname;
    String Strasse;
    Integer Hausnummer;
    Integer PLZ;
    String Ort;

    /**
     * Creates new form ArtikelAnlegenEditOK
     */
    public EditOKKundenMetaDaten() {
        initComponents();
    }

    public EditOKKundenMetaDaten(customerGUI customerGUI, Kund kunde) {
        initComponents();
        this.customerGUI = customerGUI;
        this.kunde = kunde;
        this.KNR = kunde.getKNr();
        this.Nachname = kunde.getNachname();
        this.Vorname = kunde.getVorname();
        this.Strasse = kunde.getStrasse();
        this.Hausnummer = kunde.getHausnummer();
        this.PLZ = kunde.getPLZ();
        this.Ort = kunde.getOrt();

        Label_KNR.setText(this.KNR.toString());
        tfHausnummer.setText(Hausnummer.toString());
        tfNachname.setText(Nachname);
        tfOrt.setText(Ort);
        tfPLZ.setText(PLZ.toString());
        tfStraße.setText(Strasse);
        tfVorname.setText(Vorname);

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
        buttonAbbrechen = new javax.swing.JButton();
        buttonArtikelAnlegen = new javax.swing.JButton();
        labelA_LNR = new javax.swing.JLabel();
        labelA_anlegen = new javax.swing.JLabel();
        tfVorname = new javax.swing.JTextField();
        tfNachname = new javax.swing.JTextField();
        tfStraße = new javax.swing.JTextField();
        tfHausnummer = new javax.swing.JTextField();
        labelANR = new javax.swing.JLabel();
        labelMenge = new javax.swing.JLabel();
        labelBEZ = new javax.swing.JLabel();
        Label_Artikelnummer = new javax.swing.JLabel();
        labelVKPreis = new javax.swing.JLabel();
        tfPLZ = new javax.swing.JTextField();
        labelVKPreis1 = new javax.swing.JLabel();
        tfOrt = new javax.swing.JTextField();
        Label_KNR = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelKrit.setText("Straße:*");

        buttonAbbrechen.setText("Abbrechen");
        buttonAbbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbbrechenActionPerformed(evt);
            }
        });

        buttonArtikelAnlegen.setText("OK");
        buttonArtikelAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonArtikelAnlegenActionPerformed(evt);
            }
        });

        labelA_LNR.setText("Hausnummer:*");

        labelA_anlegen.setText("Kunden bearbeiten");

        tfVorname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfVornameKeyPressed(evt);
            }
        });

        tfNachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNachnameActionPerformed(evt);
            }
        });
        tfNachname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNachnameKeyPressed(evt);
            }
        });

        tfStraße.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfStraßeKeyPressed(evt);
            }
        });

        tfHausnummer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfHausnummerKeyPressed(evt);
            }
        });

        labelANR.setText("Kundennummer:");

        labelMenge.setText("Nachname:*");

        labelBEZ.setText("Vorname:*");

        labelVKPreis.setText("PLZ:*");

        labelVKPreis1.setText("Ort:*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAbbrechen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(buttonArtikelAnlegen))
                    .addComponent(labelA_anlegen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBEZ, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelA_LNR)
                            .addComponent(labelKrit)
                            .addComponent(labelANR)
                            .addComponent(labelVKPreis)
                            .addComponent(labelMenge)
                            .addComponent(labelVKPreis1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Label_Artikelnummer)
                                .addComponent(tfNachname, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(tfStraße, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(tfVorname, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(tfHausnummer, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(tfPLZ)
                                .addComponent(tfOrt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Label_KNR)
                                .addGap(57, 57, 57)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(Label_Artikelnummer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelA_anlegen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelANR)
                    .addComponent(Label_KNR))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBEZ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMenge)
                    .addComponent(tfNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStraße, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKrit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHausnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA_LNR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVKPreis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVKPreis1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAbbrechen)
                    .addComponent(buttonArtikelAnlegen))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonArtikelAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonArtikelAnlegenActionPerformed
        bearbeiten();
    }//GEN-LAST:event_buttonArtikelAnlegenActionPerformed

    private void buttonAbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAbbrechenActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonAbbrechenActionPerformed

    private void tfHausnummerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHausnummerKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tfHausnummerKeyPressed

    private void tfStraßeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStraßeKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tfStraßeKeyPressed

    private void tfNachnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNachnameKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tfNachnameKeyPressed

    private void tfVornameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVornameKeyPressed
        abfangenKey(evt);
    }//GEN-LAST:event_tfVornameKeyPressed

    private void tfNachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNachnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNachnameActionPerformed

    private void abfangenKey(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            bearbeiten();
        }
    }
    
    //die Methode bearbeiten, kann einen Kunden in der Datenbank bearbeiten
    //Werte die nur Zahlen enthalten dürfen werden zuvor auf Negativität und Zahlen überprüft
    //abschließend wird, wenn etwas geändert wurde, die Änderung in die Datenbank geschrieben
    private void bearbeiten() {

        String Name = "";
        String Vorname = "";
        String Straße = "";
        Integer Hausnummer = 0;
        Integer PLZ = 0;
        String Ort = "";
        try {
            Name = tfNachname.getText();
            Vorname = tfVorname.getText();
            Straße = tfStraße.getText();
            Hausnummer = Integer.parseInt(tfHausnummer.getText());
            PLZ = Integer.parseInt(tfPLZ.getText());
            Ort = tfOrt.getText();
        } catch (NumberFormatException e) {
            general.Message.showError("Fehler", "Bitte für PLZ oder Hausnummer nur Zahlen eingeben!");
        }

        Kund Kunde = new Kund();
        String SuccessText = "Folgende Elemente wurden aktualisiert: ";
        String UpdateString = "UPDATE KUND SET";
        int Anzahl = 0;

        if (!(this.Nachname.equals(Name))) {
            SuccessText = SuccessText + "Nachname";
            UpdateString = UpdateString + " Nachname = '" + Name + "'";
            Anzahl++;
        }

        if (!(this.Vorname.equals(Vorname))) {
            if (Anzahl == 0) {
                SuccessText = SuccessText + "Vorname";
                UpdateString = UpdateString + " Vorname = '" + Vorname + "'";
            } else {
                SuccessText = SuccessText + ", Vorname";
                UpdateString = UpdateString + ", Vorname = '" + Vorname + "'";
            }
            Anzahl++;
        }
        if (!(this.Strasse.equals(Straße))) {
            if (Anzahl == 0) {
                SuccessText = SuccessText + "Straße";
                UpdateString = UpdateString + " Strasse = '" + Straße + "'";
            } else {
                SuccessText = SuccessText + ", Straße";
                UpdateString = UpdateString + ", Strasse = '" + Straße + "'";
            }
            Anzahl++;
        }

        if (!(this.Hausnummer.equals(Hausnummer))) {
            if (Anzahl == 0) {
                SuccessText = SuccessText + "Hausnummer";
                UpdateString = UpdateString + " Hausnummer = " + Hausnummer;
            } else {
                SuccessText = SuccessText + ", Hausnummer";
                UpdateString = UpdateString + ", Hausnummer = " + Hausnummer;
            }
            Anzahl++;
        }
        if (!(this.PLZ.equals(PLZ))) {
            if (Anzahl == 0) {
                SuccessText = SuccessText + "PLZ";
                UpdateString = UpdateString + " PLZ = " + PLZ;
            } else {
                SuccessText = SuccessText + ", PLZ";
                UpdateString = UpdateString + ", PLZ = " + PLZ;
            }
            Anzahl++;
        }
        if (!(this.Ort.equals(Ort))) {
            if (Anzahl == 0) {
                SuccessText = SuccessText + "Ort";
                UpdateString = UpdateString + " Ort = '" + Ort + "'";
            } else {
                SuccessText = SuccessText + ", Ort";
                UpdateString = UpdateString + ", Ort = '" + Ort + "'";
            }
            Anzahl++;
        }

        if (!(Anzahl == 0)) {
            int wert = kunde.updateKund(UpdateString);
            customerGUI.tabelleaktualisieren();
            this.setVisible(false);
            general.Message.showSuccess("Fehler", SuccessText);
        } else {
            this.setVisible(false);
            general.Message.showError("Fehler", "Es wurde nichts geändert!");
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
            java.util.logging.Logger.getLogger(EditOKKundenMetaDaten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOKKundenMetaDaten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOKKundenMetaDaten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOKKundenMetaDaten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditOKKundenMetaDaten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Artikelnummer;
    private javax.swing.JLabel Label_KNR;
    private javax.swing.JButton buttonAbbrechen;
    private javax.swing.JButton buttonArtikelAnlegen;
    private javax.swing.JLabel labelANR;
    private javax.swing.JLabel labelA_LNR;
    private javax.swing.JLabel labelA_anlegen;
    private javax.swing.JLabel labelBEZ;
    private javax.swing.JLabel labelKrit;
    private javax.swing.JLabel labelMenge;
    private javax.swing.JLabel labelVKPreis;
    private javax.swing.JLabel labelVKPreis1;
    private javax.swing.JTextField tfHausnummer;
    private javax.swing.JTextField tfNachname;
    private javax.swing.JTextField tfOrt;
    private javax.swing.JTextField tfPLZ;
    private javax.swing.JTextField tfStraße;
    private javax.swing.JTextField tfVorname;
    // End of variables declaration//GEN-END:variables
}
