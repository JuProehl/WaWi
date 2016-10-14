/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import entity.Arti;
import entity.K_BA;
import general.Print;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javafx.print.Collation;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JProehl
 */
public class picklistArtiSumGUI extends javax.swing.JFrame {

    ArrayList aktuellePickList;
    ArrayList<Arti> artiPickingList = new ArrayList<>();

    /**
     * Creates new form picklistArtiSumGUI
     */
    public picklistArtiSumGUI(ArrayList aktuellePickList) {
        initComponents();
        this.aktuellePickList = aktuellePickList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArtiList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonEnd = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTableArtiList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Artikel Nr.", "Bezeichnung", "Summe der Artikel", "Regal", "Fach"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableArtiList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableArtiList);
        if (jTableArtiList.getColumnModel().getColumnCount() > 0) {
            jTableArtiList.getColumnModel().getColumn(0).setHeaderValue("Artikel Nr.");
            jTableArtiList.getColumnModel().getColumn(1).setHeaderValue("Bezeichnung");
            jTableArtiList.getColumnModel().getColumn(2).setHeaderValue("Summe der Artikel");
            jTableArtiList.getColumnModel().getColumn(3).setHeaderValue("Regal");
            jTableArtiList.getColumnModel().getColumn(4).setHeaderValue("Fach");
        }

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Picking Liste nach Artikel");

        jButtonEnd.setText("Schließen");
        jButtonEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEndActionPerformed(evt);
            }
        });

        jButtonPrint.setText("Drucken");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnd)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEndActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEndActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        // TODO add your handling code here:
        // Drucken Button
        //neues Print Objekt 
        Print drucken = new Print("Artikel der aktuellen PickingList");
        //Prüfung ob in der PickingList tabelle Daten vorhanden sind
        if (jTableArtiList.getColumnCount() > 0) {
            //JA --> Seiten des Print Objekts erzeugen
            drucken.CreatePages(jTableArtiList);
        } else {
            //NEIN --> Fehlermeldung "Keine Daten!"
            general.Message.showError("", "Keine Daten!");
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    public void createAndshowTabel() {
        Arti tmp;
        boolean sorted = false;
        for (Object i : aktuellePickList) {
            K_BA k_ba = (K_BA) i;
            if (!artiPickingList.contains(anrtoArti(k_ba.getArti().getANR()))) {
                artiPickingList.add(k_ba.getArti());
            }
        }
        Collections.sort(artiPickingList, new Comparator<Arti>() {
            public int compare(Arti a1, Arti a2) {
                return Integer.valueOf(a1.getLage().getRegal() * 1000000 + a1.getLage().getFach()).compareTo(a2.getLage().getRegal()* 1000000 + a2.getLage().getFach());
            }
        });
        this.showTable();
    }

    private Arti anrtoArti(int anr) {
        for (Object i : aktuellePickList) {
            K_BA k_ba = (K_BA) i;
            if (anr == k_ba.getArti().getANR()) {
                return k_ba.getArti();
            }
        }
        return null;
    }

    private void showTable() {
        //Methode die aus der picklistGUI aufgerufen wird zur Ausgabe einer ArrayList in der JTable GUI
        //erzeugen eines DefaultTableModel aus der Übergebenen guitable
        DefaultTableModel model = (DefaultTableModel) jTableArtiList.getModel();
        //Rohobjekte als Array zum füllen der Spalten
        Object rowData[] = new Object[5];
        model.setRowCount(0);
        //Iteration durch die Übergebene ArrayList
        for (Object i : artiPickingList) {
            //Casten der kba Objekte auf K_BA Objekte
            Arti arti = (Arti) i;
            //füllen des rowData Arrays mit Werten
            rowData[0] = arti.getANR();
            rowData[1] = arti.getBEZEICHNUNG();
            rowData[2] = zaehleArti(arti.getANR());
            rowData[3] = arti.getLage().getRegal();
            rowData[4] = arti.getLage().getFach();
            //hinzufügen der rowData Datensätze zu dem GUI Table Model
            model.addRow(rowData);
        }
    }

    private int zaehleArti(int anr) {
        int summe = 0;
        for (Object i : aktuellePickList) {
            K_BA k_ba = (K_BA) i;
            if (anr == k_ba.getArti().getANR()) {
                summe += k_ba.getANZAHL();
            }
        }
        return summe;
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
            java.util.logging.Logger.getLogger(picklistArtiSumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(picklistArtiSumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(picklistArtiSumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(picklistArtiSumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new picklistArtiSumGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnd;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableArtiList;
    // End of variables declaration//GEN-END:variables
}
