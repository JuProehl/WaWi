/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import database.DB_Connect;
import entity.K_BA;
import entity.Kund;
import general.Print;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import lists.PickingList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.print.PrintException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Markus
 */
public class picklistGUI extends javax.swing.JFrame {

    PickingList pickinglist = new PickingList();

    /**
     * Creates new form picklistGUIShow
     */
    public picklistGUI() {
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
        tablePicklist = new javax.swing.JTable();
        buttonPrint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonReady = new javax.swing.JButton();
        buttonPrintEtiketten = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        buttonBack.setText("Zurück");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        tablePicklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "BestellNr", "Position", "Bezeichnung", "Anzahl", "Bestand", "Regal", "Fach"
            }
        ));
        jScrollPane1.setViewportView(tablePicklist);

        buttonPrint.setText("Drucken");
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Picklist");

        buttonReady.setText("Abschließen");

        buttonPrintEtiketten.setText("Etiketten (Kann dann weg)");
        buttonPrintEtiketten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintEtikettenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonReady, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                        .addComponent(buttonPrintEtiketten)
                        .addGap(72, 72, 72)
                        .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(buttonBack)
                    .addComponent(buttonPrintEtiketten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonReady, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonBack.getAccessibleContext().setAccessibleName("buttonBack");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        pickinglist.resetStatusAllBEST();
        setVisible(false);
        LagerverwaltungGUI lagerGUI = new LagerverwaltungGUI();
        lagerGUI.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
        // TODO add your handling code here:
        Print drucken = new Print("PickingList");
        if (tablePicklist.getColumnCount() > 0) {
            drucken.CreatePages(tablePicklist);
        } else {
            general.Message.showError("", "Keine Daten!");
        }
    }//GEN-LAST:event_buttonPrintActionPerformed

    // Button zum Etiketten drucken // Kann wieder weg sobald bei abschließen mit drin
    private void buttonPrintEtikettenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintEtikettenActionPerformed
      printEtiketten();
    }//GEN-LAST:event_buttonPrintEtikettenActionPerformed

    
    // Diese Methode aufrufen bei Abschließen der Picklist
    // beachtet dass der Dialog nur aufploppt wenn man PDF druckt
    // bei "realer" verwendet würde er es so auf dem drucker feuern.
    private void printEtiketten() {
        int rowCount = tablePicklist.getModel().getRowCount();
        Print etikettenprint = new Print();
        int[] bnr = new int[rowCount];
        List Adress;
        String Anschrift = "";
        List KNRlist;

        for (int i = 0; i < rowCount; i++) {
            bnr[i] = Integer.parseInt(tablePicklist.getModel().getValueAt(i, 0).toString());
            KNRlist = getKNR(bnr[i]);

            Iterator iterator;
            iterator = KNRlist.iterator();
            int KNR = (int) iterator.next();

            Adress = getAdress(KNR);

            Object[] rowData = new Object[6];

            for (iterator = Adress.iterator(); iterator.hasNext();) {
                Kund Kunde = (Kund) iterator.next();
                rowData[0] = Kunde.getVorname();
                rowData[1] = Kunde.getNachname();
                rowData[2] = Kunde.getStrasse();
                rowData[3] = Kunde.getHausnummer();
                rowData[4] = Kunde.getPLZ();
                rowData[5] = Kunde.getOrt();

                //DefaultTableModel model = (DefaultTableModel) tablePicklist.getModel();
                // model.addRow(rowData);
                Anschrift = "" + rowData[0] + " " + rowData[1] + "\n"
                        + rowData[2] + " " + rowData[3] + "\n"
                        + rowData[4] + " " + rowData[5];
              
                //general.Message.showError("", Anschrift);
                etikettenprint.CreatePages(Anschrift);
            }                             
        }
    }

    private List getKNR(int bnr) {
        DB_Connect con = new DB_Connect();
        return con.Connect("select kund.KNr from Best WHERE BNR = " + bnr);
    }

    private List getAdress(int knr) {
        DB_Connect con = new DB_Connect();
        return con.Connect("from Kund WHERE KNr = " + knr);
    }

    public void showTable() {
        pickinglist.showTable(tablePicklist, pickinglist.buildPickinglist());
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
            java.util.logging.Logger.getLogger(picklistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(picklistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(picklistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(picklistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new picklistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonPrintEtiketten;
    private javax.swing.JButton buttonReady;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePicklist;
    // End of variables declaration//GEN-END:variables
}
