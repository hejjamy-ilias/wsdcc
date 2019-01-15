package com.bnpparibas.dsibddf.domain.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hamza Machtali
 * @since 03/02/2014
 */
public final class NumeroteurEvtATM {

    /** this class single instance */
    private static NumeroteurEvtATM instance;

    /**
     * attribut hashMap a comme cle idAtm et comme valeur compteur
     */
    private Map<String, Integer> countMap = new HashMap<String, Integer>();

    /**
     * Constructeur
     * 
     */
    private NumeroteurEvtATM() {

    }

    /**
     * Methode permettant la recuperation d une instance de type NumeroteurEvtATM
     * 
     * @return NumeroteurEvtATM : retourne un objet de type NumeroteurEvtATM
     */
    public static NumeroteurEvtATM getInstance() {
        if (instance == null) {
            synchronized (NumeroteurEvtATM.class) {
                instance = new NumeroteurEvtATM();
            }
        }
        return instance;
    }

    /**
     * @return countMap
     */
    public Map<String, Integer> getCountMap() {
        return countMap;
    }

    /**
     * Methode permettant l incrementation du compteur
     * 
     * @param idAtm
     *            : l identifiant de l automate
     * @return int : retoutne une valeur entiere
     */
    public int incrementerCompteur(final String idAtm) {
        Integer compteur = countMap.get(idAtm);
        if (compteur == null || compteur.intValue() == 999999) {
            compteur = Integer.valueOf(0);
        } else {
            compteur = Integer.valueOf(compteur.intValue() + 1);
        }
        countMap.put(idAtm, compteur);
        return compteur.intValue();
    }

    /**
     * @param countMap
     *            countMap à définir 
     */
    public void setCountMap(final Map<String, Integer> countMap) {
        this.countMap = countMap;
    }

}