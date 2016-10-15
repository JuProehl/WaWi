/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

import entity.K_BA;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import lists.PickingList;

/**
 *
 * @author JProehl
 */
public class PrintObj implements Printable {

    String ueberschrift = "";
    String unsereAdresse = "";
    String adress_z1 = "";
    String adress_z2 = "";
    String adress_z3 = "";
    ArrayList picklist;
    int bnr = 0;

    public PrintObj(String ueberschrift, String unsereAdresse, String adress_z1, String adress_z2, String adress_z3, int bnr, ArrayList pickList) {
        this.ueberschrift = ueberschrift;
        this.unsereAdresse = unsereAdresse;

        this.adress_z1 = adress_z1;
        this.adress_z2 = adress_z2;
        this.adress_z3 = adress_z3;
        this.bnr = bnr;
        this.picklist = pickList;
    }

    @Override
    public int print(Graphics g, PageFormat pf, int page)
            throws PrinterException {
        if (page > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        g2d.drawString(ueberschrift, 230, 100);
        g2d.drawString(unsereAdresse, 182, 113);

        g2d.drawString(adress_z1, 100, 188);
        g2d.drawString(adress_z2, 100, 201);
        g2d.drawString(adress_z3, 100, 214);
        g2d.drawString("Pos", 100, 300);
        g2d.drawString("Menge", 130, 300);
        g2d.drawString("Art.-Nr.", 180, 300);
        g2d.drawString("Artikelbezeichnung", 240, 300);

        int range = 313;
        for (Object i : picklist) {
            K_BA k_ba = (K_BA) i;
            if (k_ba.getBest().getBNR() == bnr) {
                g2d.drawString(k_ba.getPOSITION() + ",0", 100, range);
                g2d.drawString(k_ba.getANZAHL() + " St", 130, range);
                g2d.drawString(k_ba.getArti().getANR() + "", 180, range);
                g2d.drawString(k_ba.getArti().getBEZEICHNUNG() + "", 240, range);

                range += 13;
            }

        }

        return PAGE_EXISTS;
    }

}
