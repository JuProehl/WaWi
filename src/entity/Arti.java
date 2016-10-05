package entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import database.DB_Connect;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Arti")

// Klasse Arti 
// Repräsentiert die Tabelle Arti der Datenbank
// Enthält Attribute und Methoden zum Abfragen und Bearbeiten der Tabelle
public class Arti {

    // Primärschlussel ANR der Tabelle Arti (Artikel)
    @Id
    @Column(name = "ANR")
    int ANR;
    @Column(name = "BEZEICHNUNG")
    String BEZEICHNUNG;
    @Column(name = "BESTANDSMENGE")
    int BESTANDSMENGE;
    @Column(name = "krit_Menge")
    int krit_Menge;
    // Fremdschlüssel F_LNR (Lagernummer)
    @OneToOne
    @JoinColumn(name = "F_LNR")
    private Lage lage;
    // Fremdschlüssel F_ANR (Artikelnummer)
    @OneToMany
    @JoinColumn(name = "F_ANR")
    private List<K_BA> k_ba;
    @Column(name = "VK_Preis")
    double VK_Preis;

    // Konstruktor der Klasse Arti
    public Arti(){
        
    }
    // Einfache Anlage ohne Objektreferenzen
    public Arti(int anr, String bezeichnung, int bestandsmenge, int krit_menge, double VK_Preis) {
        this.ANR = anr;
        this.BEZEICHNUNG = bezeichnung;
        this.BESTANDSMENGE = bestandsmenge;
        this.krit_Menge = krit_menge;
        this.VK_Preis = VK_Preis;
    }

    // Methode UpdateArtikelAdd
    // Artikel einlagern
    // Stellt eine Verbindung zur Datenbabk her und
    // lagert unter Ausführung eines SQL-Statements 
    // eine übergebene Menge von Artikeln ein.
    // Übergabeparameter: int amount, int nummer
    // amount: einzulagernde Menge
    // nummer: Artikelnummer des einzulagernden Artikels
    // Rückgabewert int
    // gibt die Anzahl betroffener Zeilen nach Ausführung des SQL-Statements zurück
    public int UpdateArtikelAdd(int amount, int nummer) {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect("UPDATE Arti SET BESTANDSMENGE = BESTANDSMENGE + " + Integer.toString(amount) + " WHERE ANR = " + Integer.toString(nummer));
    }

    // Methode UpdateArtikelSetNew
    // Artikel Bestandskorrektur
    // Stellt eine Verbindung zur Datenbabk her und
    // setzt unter Ausführung eines SQL-Statements
    // die Bestandsmenge eines Artikels.
    // Übergabeparameter: int amount, int nummer
    // amount: neue Bestandmenge
    // nummer: Artikelnummer des zu korrigierenden Artikels
    // Rückgabewert int
    // gibt die Anzahl betroffener Zeilen nach Ausführung des SQL-Statements zurück
    public int UpdateArtikelSetNew(int amount, int nummer) {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect("UPDATE Arti SET BESTANDSMENGE = " + Integer.toString(amount) + " WHERE ANR = " + Integer.toString(nummer));
    }

    // Methode UpdateArtikelFree
    // Artikel Bestandskorrektur
    // Stellt eine Verbindung zur Datenbabk her und
    // setzt unter Ausführung eines SQL-Statements die Bestandsmenge eines Artikels.
    // Übergabeparameter: String str
    // str: SQL-Statement, welches ausgeführt werden soll
    // Rückgabewert int
    // gibt die Anzahl betroffener Zeilen nach Ausführung des SQL-Statements zurück   
    public int UpdateArtikelFree(String str) {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect(str);
    }

    // Methode Bestandskorrektur
    // Artikel Bestandskorrektur
    // Stellt eine Verbindung zur Datenbabk her und
    // setzt unter Ausführung eines SQL-Statements die Bestandsmenge eines Artikels.
    // Übergabeparameter: int bestandsmenge, int nummer
    // amount: neue Bestandmenge
    // nummer: Artikelnummer des zu korrigierenden Artikels
    // Rückgabewert int
    // gibt die Anzahl betroffener Zeilen nach Ausführung des SQL-Statements zurück 
    public int Bestandskorrektur(int bestandsmenge, int nummer) {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect("UPDATE Arti SET BESTANDSMENGE = " + Integer.toString(bestandsmenge) + " WHERE ANR = " + Integer.toString(nummer));
    }

    // Methode Auslagern
    // Artikel auslagern
    // Stellt eine Verbindung zur Datenbabk her und
    // lagert unter Ausführung eines SQL-Statements die übergebene Menge eines Artikels aus.
    // Übergabeparameter: int amount, int nummer
    // amount: auszulagernde Menge
    // nummer: Artikelnummer des zu korrigierenden Artikels
    // Rückgabewert int
    // gibt die Anzahl betroffener Zeilen nach Ausführung des SQL-Statements zurück
    public int Auslagern(int amount, int nummer) {
        DB_Connect con = new DB_Connect();
        return con.simpleConnect("UPDATE Arti SET BESTANDSMENGE = BESTANDSMENGE - " + Integer.toString(amount) + " WHERE ANR = " + Integer.toString(nummer));
    }

    // Methode InsertArtikel
    // Artikel anlegen
    // Stellt eine Verbindung zur Datenbabk her und
    // legt unter Ausführung eines SQL-Statements einen neuen Artikel an.
    // Es wird geprüft, ob die Artikelnummer bereits vergeben ist und ob der
    // Lagerplatz existiert/ noch verfügbar ist.
    // Die Bestandsmenge des Artikels darf nicht größer als das Fassungsvermögen
    // des Lagerfaches sein.
    // Übergabeparameter: int anr, String bez, int bestand, int krit, int LNR, String Preis
    // anr: Artikelnummer
    // bez: Bezeichnung
    // bestand: Bestandsmenge
    // krit: Kritische Bestandsmenge
    // LNR: Lagernummer
    // Preis: Verkaufspreis
    // Rückgabewert int
    // Gibt Fehlercodes/Informationscodes zurück
    // 1: Anlegen erfolgreich
    // 2: Artikel existiert bereits
    // 3: Lagerplatz existiert nicht
    // 4: Lagerplatz ist bereits vergeben
    // 5: Kritische Menge des Artikels übersteigt/ist gleich die/der maximale Lagermenge
    // 6: Bestandsmenge des Artikels übersteigt die max. Lagermenge
    public int InsertArtikel(int anr, String bez, int bestand, int krit, int LNR, String Preis) {
        DB_Connect con = new DB_Connect();
        int i = con.simpleConnect("Select ANR FROM Arti WHERE ANR = " + Integer.toString(anr));
        if (i == 0) {
            i = con.simpleConnect("Select LNR FROM Lage WHERE LNR = " + Integer.toString(LNR));
            if (i == 1) {
                i = con.simpleConnect("Select ANR FROM Arti WHERE F_LNR = " + Integer.toString(LNR));
                if (i == 0) {
                    List list = con.Connect("FROM Lage WHERE LNR = " + Integer.toString(LNR));
                    Lage lagerplatz = (Lage) list.get(0);
                    if (lagerplatz.getMaxmenge() >= krit) {
                        if (lagerplatz.getMaxmenge() >= bestand) {

                            con.simpleConnect("INSERT INTO Arti (ANR, BEZEICHNUNG, BESTANDSMENGE, krit_Menge, F_LNR, VK_Preis) VALUES ('" + Integer.toString(anr) + "', '"
                                    + bez + "','" + Integer.toString(bestand) + "', '" + Integer.toString(krit) + "', '" + Integer.toString(LNR) + "', '" + Preis + "')");
                            return 1;
                        } else {
                            return 6;
                        }
                    } else {
                        return 5;
                    }
                } else {
                    return 4;
                }
            } else {
                return 3;
            }
        } else {
            return 2;
        }
    }

    // Methode UpdateLNrCheck
    // Methode zum Überprüfen, ob ein Lagerplatz existiert oder bereits belegt ist.
    // Rückgabewert int
    // Gibt 0 oder 1 zurück: 0 = Existiert nicht ; 1 = Exisitiert und nicht belegt/ist verfügbar
    // Übergabeparameter int LNR
    // Die Methode bekommt die Lagernummer übergeben
    public int UpdateLNrCheck(int LNR) {
        // Objekt der Klasse DB_Connect erzeugen
        DB_Connect con = new DB_Connect();
        int i = 0;
        int j = 0;
        int ret = 0;
        // Datenbankabfragen: Alle Datensätze in denen die übergebene Lagernummer vorhanden ist
        // von Tabelle Lage (Lager)
        i = con.simpleConnect("Select LNR FROM Lage WHERE LNR = " + Integer.toString(LNR));
        // von Tabelle Arti (Artikel)
        j = con.simpleConnect("Select ANR FROM Arti WHERE F_LNR = " + Integer.toString(LNR));

        // Sollten beide Abfragen den Wert 0 zurückgegen, existiert der Lagerplatz noch nicht
        if (i == 0 && j == 0) {
            general.Message.showError("Fehler", "Der Lagerplatz existiert nicht. Bitte anlegen!");
            ret = 0;
            // Sollten der Lagerplatz existieren (i=1) und dieser auch schon von einem Artikel belegt sein(j=1)
        } else if (i == 1 && j == 1) {
            general.Message.showError("Fehler", "Der Lagerplatz ist schon durch ein anderes Produkt belegt!");
            ret = 0;
            // Sollten der Lagerplatz existieren (i=1) und dieser noch von keinem Artikel belegt sein(j=0)   
        } else if (i == 1 && j == 0) {
            ret = 1;
        }
        return ret;
    }

    // Getter und Setter Methoden
    public double getVK_Preis() {
        return VK_Preis;
    }

    public void setVK_Preis(double VK_Preis) {
        this.VK_Preis = VK_Preis;
    }

    public int getANR() {
        return ANR;
    }

    public void setANR(int ANR) {
        this.ANR = ANR;
    }

    public String getBEZEICHNUNG() {
        return BEZEICHNUNG;
    }

    public void setBEZEICHNUNG(String BEZEICHNUNG) {
        this.BEZEICHNUNG = BEZEICHNUNG;
    }

    public int getBESTANDSMENGE() {
        return BESTANDSMENGE;
    }

    public void setBESTANDSMENGE(int BESTANDSMENGE) {
        this.BESTANDSMENGE = BESTANDSMENGE;
    }

    public int getKrit_Menge() {
        return krit_Menge;
    }

    public void setKrit_Menge(int krit_Menge) {
        this.krit_Menge = krit_Menge;
    }

    /**
     * @return the k_ba
     */
    public List<K_BA> getK_ba() {
        return k_ba;
    }

    /**
     * @param k_ba the k_ba to set
     */
    public void setK_ba(List<K_BA> k_ba) {
        this.k_ba = k_ba;
    }

    /**
     * @return the lage
     */
    public Lage getLage() {
        return lage;
    }

    /**
     * @param lage the lage to set
     */
    public void setLage(Lage lage) {
        this.lage = lage;
    }
    
    public Arti clone(){
        Arti arti = new Arti(this.ANR, this.BEZEICHNUNG, this.BESTANDSMENGE, this.krit_Menge, this.VK_Preis);       
        return arti;
    }

}
