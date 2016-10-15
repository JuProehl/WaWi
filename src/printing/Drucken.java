/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

import entity.K_BA;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/**
 *
 * @author JProehl
 */
public class Drucken {

    /**
     * @param args the command line arguments
     */
    public void druckeLieferschein(ArrayList pickList) {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        ArrayList printedBnr = new ArrayList();
        for (Object kba : pickList) {
            K_BA k_ba = (K_BA) kba;
            if (!printedBnr.contains(Integer.valueOf(k_ba.getBest().getBNR()))) {
                String ueberschrift = "Lieferschein";
                String unterUeberschrift = "Der HandyTyp GmbH & Co. KG";
                String unsereAdresse = "Smartway Drive 151 ● Silicon Valley 424242 ● USA";

                String adresse_z1 = k_ba.getBest().getkund().getVorname() + " " + k_ba.getBest().getkund().getNachname();
                String adresse_z2 = k_ba.getBest().getkund().getStrasse() + " " + k_ba.getBest().getkund().getHausnummer();
                String adresse_z3 = k_ba.getBest().getkund().getPLZ() + " " + k_ba.getBest().getkund().getOrt();

                printJob.setPrintable(new PrintObj(ueberschrift, unterUeberschrift, unsereAdresse, adresse_z1, adresse_z2, adresse_z3, k_ba.getBest().getBNR(), pickList));

                if (printJob.printDialog()) {
                    try {
                        printJob.print();
                    } catch (PrinterException e) {
                        e.printStackTrace();
                    }
                }
            printedBnr.add(Integer.valueOf(k_ba.getBest().getBNR()));
            }
        }
    }

}
