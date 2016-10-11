/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagement;

import gui.WaWiMainGUI;
import lists.BestList;

/**
 *
 * @author Matthias
 */
// Klasse CustomerGUI
// Enthält Methoden zum Anzeigen und Bearbeiten von Kundendaten
public class orderGUI extends javax.swing.JFrame {

    // Klassenvariablen
    BestList BestellListe;

    /**
     * Creates new form customerGUI
     */
    // Konstruktor customerGUI
    // Erzeugt ein Objekt Kundenliste der Klasse KundList
    public orderGUI() {
        initComponents();
        this.BestellListe = new BestList();
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
        tableBest = new javax.swing.JTable();
        buttonAktualisieren = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CBOffen = new javax.swing.JCheckBox();
        CBInArbeit = new javax.swing.JCheckBox();
        CBGeschlossen = new javax.swing.JCheckBox();
        Button_Filteranwenden = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonBack.setText("Zurück");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        labelCM.setText("Bestellverwaltung");

        tableBest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BNR", "KNR", "Bestelldatum", "Status", "Abschlussdatum"
            }
        ));
        jScrollPane1.setViewportView(tableBest);

        buttonAktualisieren.setText("Aktualisieren");
        buttonAktualisieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAktualisierenActionPerformed(evt);
            }
        });

        jLabel1.setText("Filter nach Status");

        CBOffen.setText("Offen");

        CBInArbeit.setText("In Arbeit");

        CBGeschlossen.setText("Abgeschlossen");

        Button_Filteranwenden.setText("Filter anwenden");
        Button_Filteranwenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FilteranwendenActionPerformed(evt);
            }
        });

        jButton1.setText("Status aktualisieren");
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonBack)
                        .addGap(105, 105, 105)
                        .addComponent(labelCM)
                        .addGap(26, 26, 26)
                        .addComponent(buttonAktualisieren)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(CBOffen)
                            .addComponent(CBInArbeit)
                            .addComponent(CBGeschlossen)
                            .addComponent(Button_Filteranwenden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))))
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBOffen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBInArbeit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBGeschlossen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_Filteranwenden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Methode buttonBackActionPerformed
    // Bei Klick auf den "Zurück-Button" wird die aktuelle Ansicht ausgeblendet
    // und Hauptmenü des Warenwirtschaftssystem eingeblendet.
    // Übergabeparameter: Button Clickevent
    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        setVisible(false);
        // Objekt der Klasse WaWiMainGUI erzeugen
        WaWiMainGUI wawiGUI = new WaWiMainGUI();
        wawiGUI.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

    // Methode buttonAktualiserenActionPerformed
    // Bei Klick auf den Button "Aktualisieren" wird die Methode
    // tabelleaktualisieren aufgerufen
    // Übergabeparameter: Button Clickevent
    private void buttonAktualisierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAktualisierenActionPerformed
        tabelleaktualisieren();
    }//GEN-LAST:event_buttonAktualisierenActionPerformed

    private void Button_FilteranwendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FilteranwendenActionPerformed
        String SelectString = "FROM Best";
        if (CBOffen.isSelected()) {
            if (SelectString.equals("FROM Best")) {
                SelectString = SelectString + " Where STATUS = 'offen'";
            }
        }

        if (CBInArbeit.isSelected()) {
            if (SelectString.equals("FROM Best")) {
                SelectString = SelectString + " Where STATUS = 'inArbeit'";
            } else {
                SelectString = SelectString + " OR STATUS = 'inArbeit'";
            }
        }

        if (CBGeschlossen.isSelected()) {
            if (SelectString.equals("FROM Best")) {
                SelectString = SelectString + " Where STATUS = 'Abgeschlossen'";
            } else {
                SelectString = SelectString + " OR STATUS = 'Abgeschlossen'";
            }
        }

        BestellListe.TabelleHolen(SelectString);
        tabelleausgeben();
    }//GEN-LAST:event_Button_FilteranwendenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        statusAktualisieren();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Methode tabelleausgaben
    // Ruft die Methode KundenInTabelleAusgeben des Objektes Kundenliste auf
    // Der Methode wird die Tabelle tableKunden übergeben
    // Kundenliste ist ein Objekt der Klasse KundList
    public void tabelleausgeben() {
        this.BestellListe.BestInTabelleAusgeben(tableBest);
    }

    // Methode tabelleaktualisieren
    // Ruft die Methoden tabelleHolen auf
    // Ruft die Methoden tabelleausgeben auf
    public void tabelleaktualisieren() {
        tabelleHolen();
        tabelleausgeben();
    }

    // Methode tabelleHolen
    // Ruft die Methode TabelleHolen des Objektes Kundeliste auf
    // Kundenliste ist ein Objekt der Klasse KundList
    private void tabelleHolen() {
        this.BestellListe.TabelleHolen();
    }

    private void statusAktualisieren() {
        try {
            int row = tableBest.getSelectedRow();
            EditOKStatusAktualisieren StatusGUI = new EditOKStatusAktualisieren(this, BestellListe.getBest(row));
            StatusGUI.setVisible(true);

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
            java.util.logging.Logger.getLogger(orderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Filteranwenden;
    private javax.swing.JCheckBox CBGeschlossen;
    private javax.swing.JCheckBox CBInArbeit;
    private javax.swing.JCheckBox CBOffen;
    private javax.swing.JButton buttonAktualisieren;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCM;
    private javax.swing.JTable tableBest;
    // End of variables declaration//GEN-END:variables

}
