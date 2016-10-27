/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import database.DB_Connect;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Marc Czolbe
 */
@Entity
@Table(name = "Lief")

public class Lief {

    @Id
    @Column(name = "LIFNR")
    private int LIFNR; //Liefernummer
    @OneToOne
    @JoinColumn(name = "F_BNR")
    private Best best;  //zugeordnete Bestellung
    @Column(name = "LIEFERUNGSDATUM")
    private Date LIEFERUNGSDATUM;   //Datum an dem die Lieferung angelegt wurde

    //Factory
    static Lief create(Best best) {
        Lief lief = new Lief();

        DB_Connect con = new DB_Connect();
        List list = con.Connect("SELECT max(L.LIFNR) FROM Lief L");
        //Nächster freier Primärschlüssel, wenn keiner vorhanden, dann 1
        Integer id;
        if (list.get(0) == null){
            id = 1;
        }else{
        id = (Integer) list.get(0) +1;
        }
        lief.setLIFNR(id);
        lief.setBest(best);
        lief.setLIEFERUNGSDATUM(new Date(new java.util.Date().getTime()));
        //Lieferung in Datenbank festschreiben
        lief.createDB();
        return lief;
    }

    //Lieferung in Datenbank schreiben
    private void createDB() {
        DB_Connect con = new DB_Connect();
        con.simpleConnect("INSERT INTO Lief (LIFNR, F_BNR, LIEFERUNGSDATUM) VALUES ('" + LIFNR + "', '"
                + best.getBNR() + "','" + new SimpleDateFormat("dd-MM-yy").format(LIEFERUNGSDATUM) + "')");
    }

    /**
     * @return the LIFNR
     */
    public int getLIFNR() {
        return LIFNR;
    }

    /**
     * @param LIFNR the LIFNR to set
     */
    public void setLIFNR(int LIFNR) {
        this.LIFNR = LIFNR;
    }

    /**
     * @return the best
     */
    public Best getBest() {
        return best;
    }

    /**
     * @param best the best to set
     */
    public void setBest(Best best) {
        this.best = best;
    }

    /**
     * @return the LIEFERUNGSDATUM
     */
    public Date getLIEFERUNGSDATUM() {
        return LIEFERUNGSDATUM;
    }

    /**
     * @param LIEFERUNGSDATUM the LIEFERUNGSDATUM to set
     */
    public void setLIEFERUNGSDATUM(Date LIEFERUNGSDATUM) {
        this.LIEFERUNGSDATUM = LIEFERUNGSDATUM;
    }
}
