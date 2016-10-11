package entity;

import database.DB_Connect;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Kund")

public class Kund {

    @Id
    @Column(name = "KNR")
    private int KNr;
    @Column(name = "NACHNAME")
    private String Nachname;
    @Column(name = "VORNAME")
    private String Vorname;
    @Column(name = "STRASSE")
    private String Strasse;
    @Column(name = "HAUSNUMMER")
    private int Hausnummer;
    @Column(name = "PLZ")
    private int PLZ;
    @Column(name = "ORT")
    private String Ort;
    @OneToMany
    @JoinColumn(name = "F_KNR")
    private List<Best> best;

    public Kund() {
        super();
    }

    // Getter und Setter
    public int getKNr() {
        return KNr;
    }

    public void setKNr(int kNr) {
        KNr = kNr;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getStrasse() {
        return Strasse;
    }

    public void setStrasse(String strasse) {
        Strasse = strasse;
    }

    public int getHausnummer() {
        return Hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        Hausnummer = hausnummer;
    }

    public int getPLZ() {
        return PLZ;
    }

    public void setPLZ(int pLZ) {
        PLZ = pLZ;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    /**
     * @return the best
     */
    public List<Best> getBest() {
        return best;
    }

    /**
     * @param best the best to set
     */
    public void setBest(List<Best> best) {
        this.best = best;
    }

    public void InsertKunde(Integer KNr, String Name, String Vorname, String Straße, String Hausnummer, String PLZ, String Ort) {
        DB_Connect con = new DB_Connect();
        con.simpleConnect("INSERT INTO KUND (KNr,Nachname,Vorname,Strasse,Hausnummer,PLZ,Ort) VALUES ('" + KNr.toString() + "','" + Name + "','" + Vorname + "','" + Straße + "','" + Hausnummer + "','" + PLZ + "','" + Ort + "')");

    }

    public int UpdateKundenFree(String str) {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect(str);
    }
}
