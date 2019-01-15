package com.bnpparibas.dsibddf.application.statistiques;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.bnpparibas.dsibddf.application.jms.MessageSender;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRP.DCCOffer;
import com.bnpparibas.dsibddf.domain.constants.Constants;
import com.bnpparibas.dsibddf.domain.utils.FormaterUtil;
import com.bnpparibas.dsibddf.domain.utils.NumeroteurEvtATM;



/**
 * 
 * @author a51399
 *
 */
public class StatistiquesImpl implements Istatistiques{

	private static final Logger LOGGER = Logger.getLogger(StatistiquesImpl.class);

	
	/**
     * Correspond au Type d’opération
     */
    private String typeEnr=Constants.TYPEENR;
    
    /**
     * Correspond au Numéro de terminal
     */
    private String idAtm;
    
    /**
     * Correspond au protocole de la demande
     */
    private String protocole="  ";  //$NON-NLS-1$
    
    /**
     * Correspond au numero Siège recupéré depuis Meogab
     */
    private String codeSiege;

    /**
     * Correspond au Sous-type de protocole de la demande
     */
    private String sousTypeProtocole=" ";  //$NON-NLS-1$
    
    /**
     * Correspond au Station ID recupéré depuis MeoGAB
     */
    private String stationId;
    
    /**
     * Correspond au numero d'opération GAB
     */
    private int numOperation;
  
    /**
     * Correspond à la Référence emetteur de la carte
     */
    private String refEmetteur;
    
    /**
     * Correspond au Code enseigne de la carte
     */
    private String codeEnseigneCarte="   ";  //$NON-NLS-1$

    /**
     * Correspond à la Date de la transaction
     */
    private String dateTransaction;
    
    /**
     * Correspond à l'Heure de la transaction
     */
    private String heureTransaction;
    
    /**
     * Correspond au Code résultat interne
     */
    private String codeResultatInt;
    
    /**
     * Correspond au Numéro de carte
     */
    private String carte;
    
    /**
     * Correspond au Code service
     */
    private String codeService = "   ";  //$NON-NLS-1$
    
    /**
     * Correspond au Siège du porteur
     */
    private String siegePorteur="     ";  //$NON-NLS-1$
    
    /**
     * Correspond a l identifiant du compte
     */
    private String idCompte;
    
    /**
     * Correspond au montant en euro
     */
    private String montantEnEuro;
    
    /**
     * Correspond position decimale montant en euro
     */
    private String posDecimaleMontantEuro;
    
    /**
     * Correspond Réponse CIBC
     */
    private DCCInqRP cibcResponse;
    
    /**
     * Alimentation des données communes
     */
	public String partieCommune() {
		final StringBuilder headerMsg = new StringBuilder();
        // type d operation
        headerMsg.append(StringUtils.rightPad(typeEnr, Constants.LONGEUR_TYPEENR).substring(0,Constants.LONGEUR_TYPEENR));
        // numero de terminal
        headerMsg.append(StringUtils.rightPad(idAtm, Constants.LONGEUR_IDATM).substring(0,Constants.LONGEUR_IDATM));
        // protocole de la demande
        headerMsg.append(StringUtils.rightPad(protocole, Constants.LONGEUR_PROTOCOLE).substring(0,Constants.LONGEUR_PROTOCOLE));
        // code Siege
        headerMsg.append(StringUtils.leftPad(codeSiege, Constants.LONGEUR_CODESIEGE, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_CODESIEGE)); 
        // sous type de protocole
        headerMsg.append(StringUtils.rightPad(sousTypeProtocole, Constants.LONGEUR_SOUSTYPEPROTOCOLE).substring(0,Constants.LONGEUR_SOUSTYPEPROTOCOLE));
        // station id
        if (idAtm.length() > 5) {
            headerMsg.append(StringUtils.leftPad(idAtm.substring(4, 6), Constants.LONGEUR_STATIONID, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_STATIONID)); 
        } else {
            headerMsg.append(StringUtils.leftPad(FormaterUtil.formaterParamCIBC(" ", 2), Constants.LONGEUR_STATIONID, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_STATIONID));   //$NON-NLS-1$
        }
        // n operation gab
        headerMsg.append(StringUtils.leftPad(String.valueOf(NumeroteurEvtATM.getInstance().incrementerCompteur(idAtm)), Constants.LONGEUR_N_OPERATION_GAB, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_N_OPERATION_GAB)); 
        // reference emetteur de la carte
        if (carte != null && carte.length() > 5) {
            headerMsg.append(StringUtils.leftPad(carte.substring(0, 5), Constants.LONGEUR_EMETTEUR_CARTE, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_EMETTEUR_CARTE)); 
        } else {
            headerMsg.append(StringUtils.rightPad(FormaterUtil.formaterParamCIBC(Constants.CHAR_VIDE, Constants.LONGEUR_EMETTEUR_CARTE), Constants.LONGEUR_EMETTEUR_CARTE).substring(0,Constants.LONGEUR_EMETTEUR_CARTE)); 
        }
        // code enseigne de la carte
        headerMsg.append(StringUtils.rightPad(codeEnseigneCarte, Constants.LONGEUR_CODEENSEIGNECARTE).substring(0,Constants.LONGEUR_CODEENSEIGNECARTE));
        // date de la transaction
        SimpleDateFormat formatterDate = new SimpleDateFormat(Constants.FORMAT_DATE_YYYYMMDD); 
        final Date today = new Date();
        headerMsg.append(StringUtils.leftPad(formatterDate.format(today), Constants.LONGEUR_DATE, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_DATE)); 
        // heure de la transaction
        formatterDate = new SimpleDateFormat(Constants.FORMAT_DATE_HHMM); 
        headerMsg.append(StringUtils.leftPad(formatterDate.format(today), Constants.LONGEUR_HEURE, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_HEURE)); 
        // code resultat interne
        headerMsg.append(StringUtils.leftPad(Constants.CHAINEZERO, Constants.LONGEUR_RESULTAT_INTERNE, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_RESULTAT_INTERNE));  
        
        if (carte != null) {
        	// numero de carte
            headerMsg.append(StringUtils.leftPad(carte, Constants.LONGEUR_PAN, Constants.CHAINEZERO).substring(0,Constants.LONGEUR_PAN)); 
        }
        // code service
        headerMsg.append(StringUtils.rightPad(codeService, Constants.LONGEUR_CODESERVICE).substring(0,Constants.LONGEUR_CODESERVICE));
        // siege du porteur
        headerMsg.append(StringUtils.rightPad(FormaterUtil.formaterParamCIBC(siegePorteur, Constants.LONGEUR_SIEGEPORTEUR), Constants.LONGEUR_SIEGEPORTEUR).substring(0,Constants.LONGEUR_SIEGEPORTEUR));
        
        return headerMsg.toString();
	}

	/**
	 * Alimentation des données spécifiques
	 */

	public String partieSpecifique() {
		
		final DCCOffer offer = cibcResponse.getDccOffer();
		final StringBuilder msg = new StringBuilder();

		// Identifiant de l’offre DCC
		if ("00".equals(cibcResponse.getRc())){  //$NON-NLS-1$
			msg.append(StringUtils.rightPad(offer.getRpId(), Constants.LONGEUR_RPID));
		}
		else{
			msg.append(StringUtils.rightPad(" ", Constants.LONGEUR_RPID));  //$NON-NLS-1$
		}
        
        // Montant en euros
		msg.append(StringUtils.rightPad(montantEnEuro, Constants.LONGEUR_TRANSAMT).substring(0, Constants.LONGEUR_TRANSAMT));
        // Position Décimale Montant Euros
		msg.append(StringUtils.rightPad(posDecimaleMontantEuro, Constants.LONGEUR_POS).substring(0, Constants.LONGEUR_POS));

        // Montant converti (facturé au porteur)
		msg.append(StringUtils.rightPad(StringUtils.leftPad(offer.getBillAmt().movePointRight((offer.getPos())).toString(), Constants.LONGEUR_MONTANT_CONVERTI, '0'), Constants.LONGEUR_MONTANT_CONVERTI).substring(0, Constants.LONGEUR_MONTANT_CONVERTI));
        // Position Décimale Montant Converti
		msg.append(StringUtils.rightPad(Integer.toString(offer.getPos()), Constants.LONGEUR_POSITIONDECIMALE).substring(0, Constants.LONGEUR_POSITIONDECIMALE));
        // Taux de conversion
		msg.append(StringUtils.rightPad(offer.getBillRate().toString(), Constants.LONGEUR_TAUXCONVERSION).substring(0, Constants.LONGEUR_TAUXCONVERSION));
        // Code devise étrangère
		msg.append(StringUtils.rightPad(offer.getBillCur().toString(), Constants.LONGEUR_DEVISEETRANGERE).substring(0, Constants.LONGEUR_DEVISEETRANGERE));
        // Marge DCC
		msg.append(StringUtils.rightPad(offer.getMUp().toString(), Constants.LONGEUR_MARGEDCC).substring(0, Constants.LONGEUR_MARGEDCC));
        // Source du taux de change
		msg.append(StringUtils.rightPad(offer.getSrc(), Constants.LONGEUR_TAUXCHANGE).substring(0, Constants.LONGEUR_TAUXCHANGE));
        // Revenu de l'acquéreur
		final String rev = new StringBuffer(offer.getRev().toString().replace(".", "")).toString();    //$NON-NLS-1$//$NON-NLS-2$
		msg.append(StringUtils.leftPad(rev,Constants.TAILLE_REVENU_ACQUEREUR, '0').toUpperCase());
        // Réseau d’appartenance de la carte
		msg.append(StringUtils.rightPad(cibcResponse.getRcvId(), Constants.LONGEUR_RESEAUAPPART).substring(0, Constants.LONGEUR_RESEAUAPPART));

		return msg.toString();
	}

	/**
	 * Envoi du message vers la file MQ
	 */
	public void envoyerStats() {
	
        final StringBuilder messageMQ = new StringBuilder();
        // initialisation de l en-tete du message
        messageMQ.append(partieCommune());
        // on renseigne le contenu du message
        messageMQ.append(partieSpecifique());
        // On recupere le singleton MessageSender
        final MessageSender msgSenger = MessageSender.getInstance();
        if (LOGGER.isDebugEnabled() ) {
            LOGGER.debug("Message MQ : DEBUT[" + messageMQ.toString()+"]FIN"); //$NON-NLS-1$ //$NON-NLS-2$
        }
        // On envoie le message
        msgSenger.send(messageMQ.toString());
	}
	
	

	/*
	 * Getters & Setters 
	 */
	
	public String getTypeEnr() {
		return typeEnr;
	}

	public DCCInqRP getCibcResponse() {
		return cibcResponse;
	}

	public void setCibcResponse(final DCCInqRP cibcResponse) {
		this.cibcResponse = cibcResponse;
	}

	public void setTypeEnr(final String typeEnr) {
		this.typeEnr = typeEnr;
	}

	public String getIdAtm() {
		return idAtm;
	}

	public void setIdAtm(final String idAtm) {
		this.idAtm = idAtm;
	}

	public String getProtocole() {
		return protocole;
	}

	public void setProtocole(final String protocole) {
		this.protocole = protocole;
	}

	public String getCodeSiege() {
		return codeSiege;
	}

	public void setCodeSiege(final String codeSiege) {
		this.codeSiege = codeSiege;
	}

	public String getSousTypeProtocole() {
		return sousTypeProtocole;
	}

	public void setSousTypeProtocole(final String sousTypeProtocole) {
		this.sousTypeProtocole = sousTypeProtocole;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(final String stationId) {
		this.stationId = stationId;
	}

	public int getNumOperation() {
		return numOperation;
	}

	public void setNumOperation(final int numOperation) {
		this.numOperation = numOperation;
	}

	public String getRefEmetteur() {
		return refEmetteur;
	}

	public void setRefEmetteur(final String refEmetteur) {
		this.refEmetteur = refEmetteur;
	}

	public String getCodeEnseigneCarte() {
		return codeEnseigneCarte;
	}

	public void setCodeEnseigneCarte(final String codeEnseigneCarte) {
		this.codeEnseigneCarte = codeEnseigneCarte;
	}

	public String getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(final String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public String getHeureTransaction() {
		return heureTransaction;
	}

	public void setHeureTransaction(final String heureTransaction) {
		this.heureTransaction = heureTransaction;
	}

	public String getCodeResultatInt() {
		return codeResultatInt;
	}

	public void setCodeResultatInt(final String codeResultatInt) {
		this.codeResultatInt = codeResultatInt;
	}

	public String getCarte() {
		return carte;
	}

	public void setCarte(final String carte) {
		this.carte = carte;
	}

	public String getCodeService() {
		return codeService;
	}

	public void setCodeService(final String codeService) {
		this.codeService = codeService;
	}

	public String getSiegePorteur() {
		return siegePorteur;
	}

	public void setSiegePorteur(final String siegePorteur) {
		this.siegePorteur = siegePorteur;
	}

	public String getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(final String idCompte) {
		this.idCompte = idCompte;
	}

	public String getMontantEnEuro() {
		return montantEnEuro;
	}

	public void setMontantEnEuro(final String montantEnEuro) {
		this.montantEnEuro = montantEnEuro;
	}

	public String getPosDecimaleMontantEuro() {
		return posDecimaleMontantEuro;
	}

	public void setPosDecimaleMontantEuro(final String posDecimaleMontantEuro) {
		this.posDecimaleMontantEuro = posDecimaleMontantEuro;
	}
}