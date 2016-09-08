package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Best")

public class Best {
	@Id
	@Column(name = "BNR")
	private int BNR;
	@Column(name = "BESTELLDATUM")
	private Date BESTELLDATUM;
        @Column(name = "F_KNR")
	private int F_KNR;
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
    public int getF_KNR() {
        return F_KNR;
    }

    /**
     * @param F_KNR the F_KNR to set
     */
    public void setF_KNR(int F_KNR) {
        this.F_KNR = F_KNR;
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
