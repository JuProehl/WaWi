package entity;

import database.DB_Connect;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Best")

public class Best {

    @Id
    @Column(name = "BNR")
    private int BNR;
    @Column(name = "BESTELLDATUM")
    private Date BESTELLDATUM;
    @ManyToOne
    @JoinColumn(name = "F_KNR")
    private Kund kund;
    @Column(name = "STATUS")
    private String STATUS;
    @Column(name = "ABSCHLUSSDATUM")
    private Date ABSCHLUSSDATUM;
    @OneToMany
    @JoinColumn(name = "F_BNR")
    private List<K_BA> k_ba;

    // Konstruktor der Klasse Best
    public Best() {
        super();
    }

    public void UpdateStatus(String status) {
        DB_Connect con = new DB_Connect();
        switch (status) {
            case "inArbeit":
                con.simpleConnect("UPDATE Best SET STATUS = 'inArbeit' WHERE BNR = " + this.BNR);
                break;
            case "offen":
                con.simpleConnect("UPDATE Best SET STATUS = 'offen' WHERE BNR = " + this.BNR);
                con.simpleConnect("UPDATE Best SET ABSCHLUSSDATUM = '01-01-00' WHERE BNR = " + this.BNR);
                break;
            case "Abgeschlossen":
                con.simpleConnect("UPDATE Best SET STATUS = 'Abgeschlossen' WHERE BNR = " + this.BNR);
                con.simpleConnect("UPDATE Best SET ABSCHLUSSDATUM = '" + new SimpleDateFormat("dd-MM-yy").format(new java.util.Date()) + "' WHERE BNR = " + this.BNR);
                break;
            default:
        }
    }

    public void UpdateStatus(int BNR, String Status) {
        DB_Connect con = new DB_Connect();
        con.simpleConnect("UPDATE Best SET STATUS = '" + Status + "' WHERE BNR = " + BNR);

    }

    // Getter und Setter
    /**
     * @return the BNR
     */
    public int getBNR() {
        return BNR;
    }

    /**
     * @param BNR the BNR to set
     */
    public void setBNR(int BNR) {
        this.BNR = BNR;
    }

    /**
     * @return the BESTELLDATUM
     */
    public Date getBESTELLDATUM() {
        return BESTELLDATUM;
    }

    /**
     * @param BESTELLDATUM the BESTELLDATUM to set
     */
    public void setBESTELLDATUM(Date BESTELLDATUM) {
        this.BESTELLDATUM = BESTELLDATUM;
    }

    /**
     * @return the F_KNR
     */
    public Kund getkund() {
        return kund;
    }

    /**
     * @param F_KNR the F_KNR to set
     */
    public void setkund(Kund kund) {
        this.kund = kund;
    }

    /**
     * @return the STATUS
     */
    public String getSTATUS() {
        return STATUS;
    }

    /**
     * @param STATUS the STATUS to set
     */
    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    /**
     * @return the ABSCHULUSSDATUM
     */
    public Date getABSCHLUSSDATUM() {
        return ABSCHLUSSDATUM;
    }

    /**
     * @param ABSCHULUSSDATUM the ABSCHULUSSDATUM to set
     */
    public void setABSCHLUSSDATUM(Date ABSCHULUSSDATUM) {
        this.ABSCHLUSSDATUM = ABSCHULUSSDATUM;
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
}
