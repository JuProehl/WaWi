package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "K_BA")

public class K_BA implements Serializable{
	@Id
        @ManyToOne
	@JoinColumn(name="F_BNR")
	private Best best;
        @Id
	@Column(name = "POSITION")
	private int POSITION;
        @ManyToOne
	@JoinColumn(name="F_ANR")
        private Arti arti;
        @Column(name = "ANZAHL")
	private int ANZAHL;
			
	public K_BA() {
		super();
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

    /**
     * @return the arti
     */
    public Arti getArti() {
        return arti;
    }

    /**
     * @param arti the arti to set
     */
    public void setArti(Arti arti) {
        this.arti = arti;
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

    
	
}
