/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lagerort")
/**
 *
 * @author Markus
 */
public class Lagerort {
    	@Id
	@Column(name = "LNr")
	int LNr;
	@Column(name = "Regal")
	String Regal;
	@Column(name = "Fach")
	String Fach;
	@Column(name = "maxmenge")
	String maxmenge;
        
        public Lagerort() {
		super();
	}

    public int getLNr() {
        return LNr;
    }

    public void setLNr(int LNr) {
        this.LNr = LNr;
    }

    public String getRegal() {
        return Regal;
    }

    public void setRegal(String Regal) {
        this.Regal = Regal;
    }

    public String getFach() {
        return Fach;
    }

    public void setFach(String Fach) {
        this.Fach = Fach;
    }

    public String getMaxmenge() {
        return maxmenge;
    }

    public void setMaxmenge(String maxmenge) {
        this.maxmenge = maxmenge;
    }
        
        

        
}


