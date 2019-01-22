
package com.bnpparibas.dsibddf.application.utils;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bnpparibas.dsibddf.application.service.exceptions.DCCError;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;
import com.bnpparibas.dsibddf.domain.beans.DCCSwaRp;
import com.bnpparibas.dsibddf.domain.constants.Constants;
import com.bnpparibas.dsibddf.domain.utils.FormaterUtil;

/**
 * Classe Retrait DCC Util
 */
public final class RetraitDCCUtil {

	/**
	 * 
	 */
	private static final String POINT = ".";
	/**
	 * 
	 */
	private static final String FORMAT_TAUX = "%07d";
	/**
	 * 
	 */
	private static final int MAX_TAILLE_TAUX = 8;
	/**
	 * 
	 */
	private static final String START_VALUE_ZERO = "0";
	private static final Logger LOGGER = LoggerFactory.getLogger(RetraitDCCUtil.class);

	/**
	 * 
	 * @param value
	 * @param decimale
	 * @return
	 */
	public static BigDecimal getDecimalValue(final BigDecimal value, final int decimale) {

		final BigDecimal montant = value;
		return montant.movePointLeft(decimale);
	}

	/**
	 * @author b30653
	 * @param taux
	 * @return
	 */
	public static String formatCBAE(final BigDecimal taux) {

		if ((isIntegerValue(taux))) {
			return getFormatCBAEInt(taux.intValue());
		} else {
			return String.valueOf(getFormatCBAE(taux)).toUpperCase();
		}

	}

	/**
	 * Cette methode permet de formatter le taux CBAE le taux comprehensible par
	 * l'application GDG
	 * 
	 * @author b30653
	 * @param taux
	 * @return
	 * @description : Asap 1372
	 */
	public static BigDecimal getFormatCBAE(final BigDecimal taux) {

		String s = taux.toString();
		final int index = s.indexOf('.');
		s = s.replaceAll("\\.", "");
		int i = 0;
		while (s.startsWith(START_VALUE_ZERO)) {
			i = i + 1;
			s = s.substring(1);
		}
		while (s.length() >= MAX_TAILLE_TAUX) {
			s = s.substring(0, s.length() - 1);

		}
		int taille = s.length() + i;
		final Long l = Long.parseLong(s);
		if (s.length() < MAX_TAILLE_TAUX) {

			s = String.format(FORMAT_TAUX, l);
		}
		s = (new StringBuilder()).append(String.valueOf(taille - index)).append(s).toString();
		return new BigDecimal(s);

	}

	/**
	 * @author b30653
	 * @param decimal
	 * @return
	 */
	public static boolean isIntegerValue(final BigDecimal decimal) {
		String s = decimal.toString();
		if (s.contains(POINT)) {
			return false;
		}
		return true;
	}

	/**
	 * @author b30653
	 * @param taux
	 * @return
	 */
	public static String getFormatCBAEInt(final int taux) {

		String s = String.format(FORMAT_TAUX, taux);
		return s.toUpperCase();
	}

	/**
	 * @param type
	 * @return
	 */
	public static String getTypeCarte(final String type) {

		String res = Constants.VISA;
		if (type != null) {
			if ("7000".equals(type) || "7500".equals(type)) {
				res = Constants.MASTERCARTE;
			} else if ("9000".equals(type) || "9500".equals(type)) {
				res = Constants.VISA;
			}
		}
		return res;
	}

	/**
	 * @param needsSpaces
	 * @return
	 */
	public static String putSpaces(final String needsSpaces) {

		final StringBuilder result = new StringBuilder();
		for (int i = 0; i < needsSpaces.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}

			result.append(needsSpaces.charAt(i));
		}
		return result.toString();
	}

	/**
	 * Création manuelle d'un retour du flux non disponible
	 * 
	 * @return
	 */
	public static DCCError initError(DCCInqRQ rq) {
		final DCCError dccError = new DCCError();
		final DCCInqRP dccInqRP = new DCCInqRP();
		dccError.setCodeReponse(-1);
		dccError.setLibelleCodeReponse("Taux DCC non disponible");
		dccError.setReferenceDCC(Constants.REF_DCC_NON_ELEGB);
		dccInqRP.setPan(rq.getPan());
		dccInqRP.setTranAmt(rq.getTranAmt());
		dccInqRP.setTime(FormaterUtil.convertToXmlGregorianCalendar(rq.getTime()));
		dccInqRP.setDate(FormaterUtil.convertToXmlGregorianCalendar(rq.getDate()));
		dccInqRP.setAcqCo(rq.getAcqCo());
		dccInqRP.setAcqId(rq.getAcqId());;
		dccInqRP.setTermId(rq.getTermId());
		dccInqRP.setTranCur(rq.getTranCur());
		dccInqRP.setAtmCat(rq.getAtmCat());
		dccError.setDccInqRP(dccInqRP);
         LOGGER.debug("flux en  erreur- cas : DCC envoie un code retour DCC différent de zéro");
		return dccError;
	}

	/**
	 * Création manuelle d'un retour Non Eligible
	 * 
	 * @return
	 */
	public static DCCSwaRp initNonEligible(DCCInqRQ rq) {
		final DCCSwaRp swaRp = new DCCSwaRp();
		final DCCInqRP dccInqRP = new DCCInqRP();
		swaRp.setCodeReponse(0);
		swaRp.setLibelleCodeReponse("Taux DCC non disponible");
		swaRp.setReferenceDCC(Constants.REF_DCC_NON_ELEGB);
		dccInqRP.setPan(rq.getPan());
		dccInqRP.setTranAmt(rq.getTranAmt());
		dccInqRP.setTime(FormaterUtil.convertToXmlGregorianCalendar(rq.getTime()));
		dccInqRP.setDate(FormaterUtil.convertToXmlGregorianCalendar(rq.getDate()));
		dccInqRP.setAcqCo(rq.getAcqCo());
		dccInqRP.setAcqId(rq.getAcqId());;
		dccInqRP.setTermId(rq.getTermId());
		dccInqRP.setTranCur(rq.getTranCur());
		dccInqRP.setAtmCat(rq.getAtmCat());
		swaRp.setDccInqRP(dccInqRP);
         LOGGER.debug("flux en  erreur- cas : DCC envoie un code retour DCC différent de zéro");
		return swaRp;
	}
	
	
	
	/**
	 * 
	 * @param numCarte
	 * @return
	 */
	public static int getBin(final String numCarte) {

		int bin = 0;
		if (numCarte != null && numCarte.length() > 5) {
			bin = Integer.valueOf(numCarte.substring(0, 5));
		}
		return bin;
	}

	/**
	 * Constructeur privé
	 */
	private RetraitDCCUtil() {

	}



}