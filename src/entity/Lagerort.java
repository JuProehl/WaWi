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
	@Column(name = "maxlagermenge")
	String maxlagermenge;
}
