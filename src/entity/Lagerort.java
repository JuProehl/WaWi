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
	int Regal;
	@Column(name = "Fach")
	int Fach;
	@Column(name = "maxmenge")
	int maxmenge;
        
        public Lagerort() {
		super();
	}

    public int getLNr() {
        return LNr;
    }

    public void setLNr(int LNr) {
        this.LNr = LNr;
    }

    public int getRegal() {
        return Regal;
    }

    public void setRegal(int Regal) {
        this.Regal = Regal;
    }

    public int getFach() {
        return Fach;
    }

    public void setFach(int Fach) {
        this.Fach = Fach;
    }

    public int getMaxmenge() {
        return maxmenge;
    }

    public void setMaxmenge(int maxmenge) {
        this.maxmenge = maxmenge;
    }
        
   
        

        
}

