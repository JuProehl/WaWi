

// von Julian Pröhl, Matthias Escher
// von Markus Overberg, Marc Czolbe
package entity;

import database.DB_Connect;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lage")

public class Lage {

    @Id
    @Column(name = "LNr")
    int LNr;    //Lagernummer
    @Column(name = "Regal")
    int Regal;  //Nummer des Regals
    @Column(name = "Fach")
    int Fach;   //Nummer des Fachs im Regal
    @Column(name = "maxmenge")
    int maxmenge;   //Maximale Menge, die von diesem Lagerort gehalten werden kann
    

    // Konstruktor der Klasse Lage
    public Lage() {
        super();   
    }

    public int InsertLagerort(int LNR, int regal, int fach, int max) {
        DB_Connect con = new DB_Connect();
        int i = con.simpleConnect("Select LNR FROM Lage WHERE LNR = " + Integer.toString(LNR));
        if (i == 0) {
            i = con.simpleConnect("Select LNR FROM Lage WHERE Regal = " + Integer.toString(regal) + " AND Fach = " + Integer.toString(fach));
            if (i == 0) {
                con.simpleConnect("INSERT INTO Lage (LNr, Regal, Fach, maxmenge) VALUES ('" + Integer.toString(LNR)
                        + "', '" + Integer.toString(regal) + "', '" + Integer.toString(fach) + "', '" + Integer.toString(max) + "')");
                return 1;
            } else {
                return 3;
            }
        } else {
            return 2;
        }

    }

    // Getter und Setter
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
    
   

    public int deleteLage() {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect("DELETE FROM LAGE WHERE LNR=" + LNr);
    }

    public int updateLage(String str) {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect(str + " WHERE LNr=" + this.LNr);
    }
    
    public Arti getArti(){
        Arti arti = null ;
        DB_Connect con = new DB_Connect();
        List list = con.Connect("FROM Arti WHERE F_LNR = " + this.LNr);
        try{
        arti = (Arti) list.get(0);
        } catch ( IndexOutOfBoundsException e){
        }
        
        
        return arti;
        } 

    /**
     * @return the arti
     *
     * public Arti getArti() { return arti; }
     *
     *
     * public void setArti(Arti arti) { this.arti = arti; }
     */
}
