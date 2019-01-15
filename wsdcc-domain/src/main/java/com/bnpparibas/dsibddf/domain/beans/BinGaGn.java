package com.bnpparibas.dsibddf.domain.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ismail B30653
 *
 */
@Entity
@Table(name ="BinGaGn")
public class BinGaGn {

	/**
	 * 
	 */
	@Id
	@Column(name = "bin", unique = true, nullable = false, precision = 0)
	String bin;

	/**
	 * 
	 */
	String banque;

	/**
	 * 
	 */
	String typeCarte;

	/**
	 * 
	 */
	String gaGn;

	public BinGaGn() {
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public String getGaGn() {
		return gaGn;
	}

	public void setGaGn(String gaGn) {
		this.gaGn = gaGn;
	}

}