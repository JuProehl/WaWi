/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import database.DB_Connect;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/**
 *
 * @author Markus
 */
public class Lage {

    @Id
    @Column(name = "LNr")
    int LNr;
    @Column(name = "Regal")
    int Regal;
    @Column(name = "Fach")
    int Fach;
    @Column(name = "maxmenge")
    int maxmenge;

    public Lage() {
        super();
    }

    public int getLNr() {
        return LNr;
    }

    public void setLNr(int LNr) {
        this.LNr = LNr;
    }

    public int getRegal() {
        return Regal;
    }

    public void setRegal(int Regal) {
        this.Regal = Regal;
    }

    public int getFach() {
        return Fach;
    }

    public void setFach(int Fach) {
        this.Fach = Fach;
    }

    public int getMaxmenge() {
        return maxmenge;
    }

    public void setMaxmenge(int maxmenge) {
        this.maxmenge = maxmenge;
    }
    
    public int UpdateArtikelFree(String str) {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect(str);
    }

    public int InsertLagerort(int LNR, int regal, int fach, int max) {
        DB_Connect con = new DB_Connect();
        int i = con.simpleConnect("Select LNR FROM Lage WHERE LNR = " + Integer.toString(LNR));
        if (i == 0) {
            i = con.simpleConnect("Select LNR FROM Lage WHERE Regal = " + Integer.toString(regal) +" AND Fach = "+ Integer.toString(fach));
            if(i == 0){                          
            con.simpleConnect("INSERT INTO Lage (LNr, Regal, Fach, maxmenge) VALUES ('" + Integer.toString(LNR)
                    + "', '" + Integer.toString(regal) + "', '" + Integer.toString(fach) + "', '" + Integer.toString(max) + "')");
            return 1;
            }
            else{
               return 3; 
            }
        } else {
            return 2;
        }

    }

}
