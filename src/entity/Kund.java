package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Kund")

public class Kund {
	@Id
	@Column(name = "KNR")
	int KNr;
	@Column(name = "NACHNAME")
	String Nachname;
	@Column(name = "VORNAME")
	String Vorname;
	@Column(name = "STRAßE")
	String Staße;
	@Column(name = "HAUSNUMMER")
	int Hausnummer;
	@Column(name = "PLZ")
	int PLZ;
	@Column(name = "ORT")
	String Ort;
	
	
	
	public Kund() {
		super();
	}



	public int getKNr() {
		return KNr;
	}



	public void setKNr(int kNr) {
		KNr = kNr;
	}



	public String getNachname() {
		return Nachname;
	}



	public void setNachname(String nachname) {
		Nachname = nachname;
	}



	public String getVorname() {
		return Vorname;
	}



	public void setVorname(String vorname) {
		Vorname = vorname;
	}



	public String getStaße() {
		return Staße;
	}



	public void setStaße(String staße) {
		Staße = staße;
	}



	public int getHausnummer() {
		return Hausnummer;
	}



	public void setHausnummer(int hausnummer) {
		Hausnummer = hausnummer;
	}



	public int getPLZ() {
		return PLZ;
	}



	public void setPLZ(int pLZ) {
		PLZ = pLZ;
	}



	public String getOrt() {
		return Ort;
	}



	public void setOrt(String ort) {
		Ort = ort;
	}

	
	
}
