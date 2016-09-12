package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "K_BA")

public class K_BA {
	@Id
	@Column(name = "F_BNR")
	private int F_BNR;
	@Column(name = "POSITION")
	private int POSITION;
        @Column(name = "F_ANR")
	private int F_ANR;
        @Column(name = "ANZAHL")
	private int ANZAHL;
	
	
	
	public K_BA() {
		super();
	}

    /**
     * @return the F_BNR
     */
    public int getF_BNR() {
        return F_BNR;
    }

    /**
     * @param F_BNR the F_BNR to set
     */
    public void setF_BNR(int F_BNR) {
        this.F_BNR = F_BNR;
    }

    /**
     * @return the POSITION
     */
    public int getPOSITION() {
        return POSITION;
    }

    /**
     * @param POSITION the POSITION to set
     */
    public void setPOSITION(int POSITION) {
        this.POSITION = POSITION;
    }

    /**
     * @return the F_ANR
     */
    public int getF_ANR() {
        return F_ANR;
    }

    /**
     * @param F_ANR the F_ANR to set
     */
    public void setF_ANR(int F_ANR) {
        this.F_ANR = F_ANR;
    }

    /**
     * @return the ANZAHL
     */
    public int getANZAHL() {
        return ANZAHL;
    }

    /**
     * @param ANZAHL the ANZAHL to set
     */
    public void setANZAHL(int ANZAHL) {
        this.ANZAHL = ANZAHL;
    }



	

	
	
}
