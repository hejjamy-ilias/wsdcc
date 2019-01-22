/**
 * 
 */
package com.bnpparibas.dsibddf.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.application.service.IServiceDCC;
import com.bnpparibas.dsibddf.application.service.exceptions.DCCLocalException;
import com.bnpparibas.dsibddf.application.statistiques.StatistiquesImpl;
import com.bnpparibas.dsibddf.application.utils.RetraitDCCUtil;
import com.bnpparibas.dsibddf.domain.beans.BinGaGn;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;
import com.bnpparibas.dsibddf.domain.beans.DCCSwaRp;
import com.bnpparibas.dsibddf.domain.constants.Constants;
import com.bnpparibas.dsibddf.domain.services.IBinGAGN;
import com.bnpparibas.dsibddf.domain.services.IServiceCIBCRest;

/**
 * @author Ismail B30653
 *
 */
@Service
public class ServiceDCC implements IServiceDCC {

	private static final int CODE_SUCCES = 0;

	private static final String TRAITEMENT_REALISE_AVEC_SUCCES = "Traitement realise avec succes";

	@Autowired
	private IServiceCIBCRest serviceCIBCRest;

	@Autowired
	private IBinGAGN serviceBinGAGN;

	/* (non-Javadoc)
	 * @see com.bnpparibas.dsibddf.application.service.IServiceDCC#callServiceDCC(com.bnpparibas.dsibddf.domain.beans.DCCInqRQ)
	 */
	public DCCSwaRp callServiceDCC(final DCCInqRQ dccInqRQ) {
		final BinGaGn binGaGn = getBin(dccInqRQ.getPan());
		if (binGaGn == null||eligibiliteBinGaGn(getTypeBinGAGN(binGaGn))) {
			throw new DCCLocalException(RetraitDCCUtil.initError(dccInqRQ));
		}else{
			return getResultServiceCIBC(dccInqRQ);
		}

	}

	/**
	 * @param dccInqRQ
	 * @return
	 */
	public DCCSwaRp getResultServiceCIBC(final DCCInqRQ dccInqRQ) {

		final DCCSwaRp swaRp = new DCCSwaRp();
		final DCCInqRP dccInqRP = serviceCIBCRest.callServiceCIBC(dccInqRQ);

		if (Constants.CODE_RETOUR_OK.equalsIgnoreCase(dccInqRP.getRc()) && dccInqRP.getDccOffer() != null) {
			swaRp.setCodeReponse(CODE_SUCCES);
			swaRp.setLibelleCodeReponse(TRAITEMENT_REALISE_AVEC_SUCCES);
			swaRp.setReferenceDCC(dccInqRP.getDccOffer().getRpId());
			swaRp.setDccInqRP(dccInqRP);
			alimenterStats(swaRp.getDccInqRP());
			return swaRp;

		}else {
			throw new DCCLocalException(RetraitDCCUtil.initError(dccInqRQ));
		}
		
	}

	/**
	 * @param numCarte
	 * @return
	 */
	public BinGaGn getBin(final String numCarte) {
		String bin = Constants.CHAR_VIDE;
		BinGaGn binGaGn = null;
		if (numCarte != null) {
			for (int i = 10; i > 5; i--) {
				if (numCarte.length() >= i) {
					bin = numCarte.substring(0, i);
					binGaGn = serviceBinGAGN.findByBin(bin);
					if (binGaGn != null) {
						break;
					}
				}
			}
		}

		return binGaGn;
	}

	/**
	 * @param binGaGn
	 * @return
	 */
	private String getTypeBinGAGN(final BinGaGn binGaGn) {
		String typeBin = Constants.BIN_AUTRE;
		if (binGaGn != null) {
			final String bin = binGaGn.getGaGn();
			if (Constants.BIN_GN.equalsIgnoreCase(bin) || Constants.BIN_GAGN.equalsIgnoreCase(bin)) {
				typeBin = Constants.BIN_GN;
			} else if (Constants.BIN_GA.equalsIgnoreCase(bin)) {
				typeBin = Constants.BIN_GA;
			} else {
				typeBin = Constants.BIN_AUTRE;
			}
			/*
			 * if (LOGGER.isDebugEnabled()) { LOGGER.debug("BIN = " + binGaGn.getBin() +
			 * " & Type = " + typeBin); //$NON-NLS-1$ //$NON-NLS-2$ }
			 */
		}
		return typeBin;

	}

	/**
	 * @param typeBin
	 * @return
	 */
	public boolean eligibiliteBinGaGn(String typeBin) {
		return Constants.BIN_GN.equalsIgnoreCase(typeBin);
	}

	private void alimenterStats(final DCCInqRP dccInqRP) {

		final StatistiquesImpl stats = new StatistiquesImpl();
		stats.setCarte(dccInqRP.getPan());
		stats.setIdAtm(dccInqRP.getTermId());
		stats.setCibcResponse(dccInqRP);
		stats.setMontantEnEuro(dccInqRP.getTranAmt().toString());
		stats.setPosDecimaleMontantEuro("");
		stats.setCodeSiege(" "); //$NON-NLS-1$
		// Envoi du message
		stats.envoyerStats();
	}
}
