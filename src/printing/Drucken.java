
// von Julian Pröhl, Matthias Escher
// von Markus Overberg, Marc Czolbe
package printing;

import entity.K_BA;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;

public class Drucken {

    /**
     * Erzeugt aus der übergebenen PickingList eine ArrayList die jede BNR der pickinglist nur einmal führt.
     * Anschließend wir für jedes element der pickList eine Methode aufgerufen die den Druck des Lieferscheins einleitet.
     * @param pickList
     */
    public void druckeLieferschein(ArrayList pickList) {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        ArrayList printedBnr = new ArrayList();
        for (Object kba : pickList) {
            K_BA k_ba = (K_BA) kba;
            if (!printedBnr.contains(k_ba.getBest().getBNR())) {
                buildAndprintLieferschein(k_ba, printJob, pickList);
                printedBnr.add(k_ba.getBest().getBNR());
            }
        }
    }

    
    /**
     * Aufbau des Adressblocks aus dem übergebene k_ba.
     * Übergabe an die Methode setPrintable der Klasse Prinable.
     * Drucken des Printable.
     * @param k_ba
     * @param printJob
     * @param posList
     */
    public void buildAndprintLieferschein(K_BA k_ba, PrinterJob printJob, ArrayList posList) {
        String adresse_z1 = k_ba.getBest().getkund().getVorname() + " " + k_ba.getBest().getkund().getNachname();
        String adresse_z2 = k_ba.getBest().getkund().getStrasse() + " " + k_ba.getBest().getkund().getHausnummer();
        String adresse_z3 = k_ba.getBest().getkund().getPLZ() + " " + k_ba.getBest().getkund().getOrt();

        printJob.setPrintable(new PrintObj(adresse_z1, adresse_z2, adresse_z3, k_ba.getBest().getBNR(), posList));

        if (printJob.printDialog()) {
            try {
                printJob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }

}
