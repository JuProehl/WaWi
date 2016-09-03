package entity;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import Datenbank.DB_Connect;
import java.util.*;

@Entity
@Table(name = "Arti")

public class Arti {
	@Id
	@Column(name = "ANR")
	int ANR;
	@Column(name = "BEZEICHNUNG")
	String BEZEICHNUNG;
	@Column(name = "BESTANDSMENGE")
	int BESTANDSMENGE;
	@Column(name = "krit_Menge")
	int krit_Menge;
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

    public int getF_LNR() {
        return F_LNR;
    }

    public void setF_LNR(int F_LNR) {
        this.F_LNR = F_LNR;
    }
        

    public int UpdateArtikel(int amount, int nummer){
        DB_Connect con = new DB_Connect();
        return con.simpleConnect("UPDATE Arti SET BESTANDSMENGE = BESTANDSMENGE + " + Integer.toString(amount)+ " WHERE ANR = " + Integer.toString(nummer));                
       }
    
    public int Bestandskorrektur(int bestandsmenge, int nummer){
        DB_Connect con = new DB_Connect();
        return con.simpleConnect("UPDATE Arti SET BESTANDSMENGE = " + Integer.toString(bestandsmenge)+ " WHERE ANR = " + Integer.toString(nummer));
    }
    
}

  

	
