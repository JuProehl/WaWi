package entity;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@Entity
@Table(name = "Arti")

public class Arti {
	@Id
	@Column(name = "ANR")
	int ANR;
	@Column(name = "BEZEICHNUNG")
	String BEZEICHNUNG;
	@Column(name = "BESTANDSMENGE")
	String BESTANDSMENGE;
	@Column(name = "krit_Menge")
	String krit_Menge;
	@Column(name = "F_LNR")
	int F_LNR;
        
        	
	public Arti() {
		super();
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

    public String getBESTANDSMENGE() {
        return BESTANDSMENGE;
    }

    public void setBESTANDSMENGE(String BESTANDSMENGE) {
        this.BESTANDSMENGE = BESTANDSMENGE;
    }

    public String getKrit_Menge() {
        return krit_Menge;
    }

    public void setKrit_Menge(String krit_Menge) {
        this.krit_Menge = krit_Menge;
    }

    public int getF_LNR() {
        return F_LNR;
    }

    public void setF_LNR(int F_LNR) {
        this.F_LNR = F_LNR;
    }
        
  
    
  
       
        
}
	