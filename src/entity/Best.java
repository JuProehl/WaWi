package entity;

import java.util.Date;
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
	@JoinColumn(name="F_KNR")
	private Kund kund;
        @Column(name = "STATUS")
	private String STATUS;
        @Column(name = "ABSCHULUSSDATUM")
	private Date ABSCHULUSSDATUM;
	
	
	
	public Best() {
		super();
	}

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
    public Date getABSCHULUSSDATUM() {
        return ABSCHULUSSDATUM;
    }

    /**
     * @param ABSCHULUSSDATUM the ABSCHULUSSDATUM to set
     */
    public void setABSCHULUSSDATUM(Date ABSCHULUSSDATUM) {
        this.ABSCHULUSSDATUM = ABSCHULUSSDATUM;
    }

    



	

	
	
}
