package com.bnpparibas.dsibddf.application.statistiques;

/**
 * 
 * @author a51399
 *
 */
public interface Istatistiques {
	
	/**
	 * Alimentation des données communes
	 * @return 
	 */
	String partieCommune();
	/**
	 * Alimentation des données spécifiques
	 * @return
	 */
	String partieSpecifique();
	/**
	 * Envoi du message vers la file MQ
	 */
	void envoyerStats();
	
	

}