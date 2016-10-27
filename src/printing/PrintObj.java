/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

import entity.K_BA;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author JProehl
 */
public class PrintObj implements Printable {

    String adress_z1 = "";
    String adress_z2 = "";
    String adress_z3 = "";
    ArrayList picklist;
    int bnr = 0;

    public PrintObj(String adress_z1, String adress_z2, String adress_z3, int bnr, ArrayList pickList) {
        this.adress_z1 = adress_z1;
        this.adress_z2 = adress_z2;
        this.adress_z3 = adress_z3;
        this.bnr = bnr;
        this.picklist = pickList;
    }

    /**
     * Überschreiben der print Methode
     * 
     * Positionierung der einzelnen Felder auf Basis von x und y Koordinaten
     * @author JProehl
     */
    @Override
    public int print(Graphics g, PageFormat pf, int page)
            throws PrinterException {
        if (page > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        g2d.drawString("Lieferschein", 273, 90);
        g2d.drawString("Der HandyTyp GmbH & Co. KG", 210, 113);
        g2d.drawString("Smartway Drive 151 ● Silicon Valley 424242 ● USA", 162, 126);

        g2d.drawString(adress_z1, 90, 188);
        g2d.drawString(adress_z2, 90, 201);
        g2d.drawString(adress_z3, 90, 214);

        g2d.drawString("Pos", 90, 300);
        g2d.drawString("Menge", 125, 300);
        g2d.drawString("Art.-Nr.", 180, 300);
        g2d.drawString("Artikelbezeichnung", 240, 300);

        int range = 313;
        for (Object i : picklist) {
            K_BA k_ba = (K_BA) i;
            if (k_ba.getBest().getBNR() == bnr) {
                g2d.drawString("KundenNr.", 330, 188);
                if (k_ba.getBest().getkund().getKNr() < 10) {
                    g2d.drawString(": 000" + k_ba.getBest().getkund().getKNr(), 420, 188);
                } else if (k_ba.getBest().getkund().getKNr() < 100) {
                    g2d.drawString(": 00" + k_ba.getBest().getkund().getKNr(), 420, 188);
                } else if (k_ba.getBest().getkund().getKNr() < 1000) {
                    g2d.drawString(": 0" + k_ba.getBest().getkund().getKNr(), 420, 188);
                } else {
                    g2d.drawString(": " + k_ba.getBest().getkund().getKNr(), 420, 188);
                }
                g2d.drawString("Liefers. Datum", 330, 201);
                g2d.drawString(": " + new SimpleDateFormat("dd.MM.yyyy").format(new java.util.Date()), 420, 201);
                g2d.drawString(k_ba.getPOSITION() + ",0", 90, range);
                g2d.drawString(k_ba.getANZAHL() + " St", 125, range);
                if (k_ba.getArti().getANR() < 10) {
                    g2d.drawString("000" + k_ba.getArti().getANR(), 180, range);
                } else if (k_ba.getArti().getANR() < 100) {
                    g2d.drawString("00" + k_ba.getArti().getANR(), 180, range);
                } else if (k_ba.getArti().getANR() < 1000) {
                    g2d.drawString("0" + k_ba.getArti().getANR(), 180, range);
                } else {
                    g2d.drawString("" + k_ba.getArti().getANR(), 180, range);
                }
                g2d.drawString(k_ba.getArti().getBEZEICHNUNG() + "", 240, range);
                range += 13;
            }
        }
        g2d.drawString("__________________________________________________________________", 90, 710);
        g2d.drawString("Der HandyTyp GmbH & Co. KG", 90, 740);
        g2d.drawString("Smartway Drive 151", 90, 753);
        g2d.drawString("Silicon Valley 424242 USA", 90, 766);
        g2d.drawString("Telefon:", 90, 779);
        g2d.drawString("+1 (0)12345 / 134322", 140, 779);
        g2d.drawString("Telefax:", 90, 792);
        g2d.drawString("+1 (0)12345 / 134323", 140, 792);

        g2d.drawString("Bankverbindungen:", 330, 753);
        g2d.drawString("Commerzbank AG", 330, 766);
        g2d.drawString("IBAN US02 7896 6786 3753 6787 00", 330, 779);
        g2d.drawString("BIC COBADEFFXXX", 330, 792);

        g2d.drawString("Geschäftsführer:", 273, 810);
        g2d.drawString("Marc Czolbe, Matthias Escher, Markus Overberg, Julian Pröhl", 140, 823);

        return PAGE_EXISTS;
    }

}
