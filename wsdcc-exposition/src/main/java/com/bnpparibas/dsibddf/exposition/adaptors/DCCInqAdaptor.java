/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.adaptors;

import java.util.Optional;

import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;
import com.bnpparibas.dsibddf.domain.beans.DCCSwaRp;
import com.bnpparibas.dsibddf.exposition.dto.DCCInqRPDTO;
import com.bnpparibas.dsibddf.exposition.dto.DCCInqRQDTO;
import com.bnpparibas.dsibddf.exposition.dto.DCCSwaRpDTO;

/**
 * @author ADMINIBM
 *
 */
public class DCCInqAdaptor {

	/**
	 * @param dccInqRP
	 * @return
	 */
	private static DCCInqRPDTO convertToDto(final DCCInqRP dccInqRP) {
		final DCCInqRPDTO rpDTO = new DCCInqRPDTO();

		if (dccInqRP.getAcqSett() != null) {
			final DCCInqRPDTO.AcqSett acqSett = new DCCInqRPDTO.AcqSett();
			acqSett.setEd(dccInqRP.getAcqSett().getEd());
			acqSett.setSettAmt(dccInqRP.getAcqSett().getSettAmt());
			acqSett.setSettCur(dccInqRP.getAcqSett().getSettCur());
			acqSett.setSettRate(dccInqRP.getAcqSett().getSettRate());
			rpDTO.setAcqSett(acqSett);
		}

		if (dccInqRP.getDccOffer() != null) {
			final DCCInqRPDTO.DCCOffer offer = new DCCInqRPDTO.DCCOffer();
			offer.setBillAmt(dccInqRP.getDccOffer().getBillAmt());
			offer.setBillCur(dccInqRP.getDccOffer().getBillCur());
			offer.setBillCurA(Optional.ofNullable(dccInqRP.getDccOffer().getBillCurA()).orElse(""));
			offer.setBillRate(dccInqRP.getDccOffer().getBillRate());
			offer.setEd(dccInqRP.getDccOffer().getEd());
			offer.setExp(dccInqRP.getDccOffer().getExp());
			offer.setMUp(dccInqRP.getDccOffer().getMUp());
			offer.setPos(Optional.ofNullable(dccInqRP.getDccOffer().getPos()).orElse(null));
			offer.setR(dccInqRP.getDccOffer().getR());
			offer.setRev(dccInqRP.getDccOffer().getRev());
			offer.setRFlag(dccInqRP.getDccOffer().getRFlag());
			offer.setRpId(dccInqRP.getDccOffer().getRpId());
			offer.setSrc(dccInqRP.getDccOffer().getSrc());
			rpDTO.setDccOffer(offer);
		}

		rpDTO.setAccId(Optional.ofNullable(dccInqRP.getAccId()).orElse(null));
		rpDTO.setAtmCat(Optional.ofNullable(dccInqRP.getAtmCat()).orElse(null));
		rpDTO.setRcvId(Optional.ofNullable(dccInqRP.getRcvId()).orElse(null));
		rpDTO.setRrn(Optional.ofNullable(dccInqRP.getRrn()).orElse(null));
		rpDTO.setTranFee(Optional.ofNullable(dccInqRP.getTranFee()).orElse(null));
		rpDTO.setAcqCo(dccInqRP.getAcqCo());
		rpDTO.setAcqId(dccInqRP.getAcqId());
		rpDTO.setCDate(dccInqRP.getCDate());
		rpDTO.setDate(dccInqRP.getDate());
		rpDTO.setPan(dccInqRP.getPan());
		rpDTO.setRc(dccInqRP.getRc());
		rpDTO.setTermId(dccInqRP.getTermId());
		rpDTO.setTime(dccInqRP.getTime());
		rpDTO.setTranAmt(dccInqRP.getTranAmt());
		rpDTO.setTranCur(dccInqRP.getTranCur());

		return rpDTO;
	}

	/**
	 * @param rqdto
	 * @return
	 */
	public static DCCInqRQ convertFromDto(final DCCInqRQDTO rqdto) {
		final DCCInqRQ rq = new DCCInqRQ();
		if (rqdto.getCrdAccLoc() != null) {
			final DCCInqRQ.CrdAccLoc accLoc = new DCCInqRQ.CrdAccLoc();
			accLoc.setCi(rqdto.getCrdAccLoc().getCi());
			accLoc.setCo(rqdto.getCrdAccLoc().getCo());
			accLoc.setLo(rqdto.getCrdAccLoc().getLo());
			rq.setCrdAccLoc(accLoc);
		}

		rq.setAccId(Optional.ofNullable(rqdto.getAccId()).orElse(null));
		rq.setAcqCo(rqdto.getAcqCo());
		rq.setAcqId(rqdto.getAcqId());
		rq.setAtmCat(Optional.ofNullable(rqdto.getAtmCat()).orElse(null));
		rq.setCardType(Optional.ofNullable(rqdto.getCardType()).orElse(null));

		rq.setDate(rqdto.getDate());
		rq.setPan(rqdto.getPan());
		rq.setPCode(Optional.ofNullable(rqdto.getPCode()).orElse(null));
		rq.setRrn(Optional.ofNullable(rqdto.getRrn()).orElse(null));
		rq.setTermId(rqdto.getTermId());
		rq.setTime(rqdto.getTime());
		rq.setTranAmt(rqdto.getTranAmt());
		rq.setTranCur(rqdto.getTranCur());
		rq.setTranFee(Optional.ofNullable(rqdto.getTranFee()).orElse(null));

		return rq;
	}

	/**
	 * @param swaRp
	 * @return
	 */
	public static DCCSwaRpDTO convertToSwaRpDTO(final DCCSwaRp swaRp) {
        final DCCSwaRpDTO swaRpDTO= new DCCSwaRpDTO();
        swaRpDTO.setCodeReponse(swaRp.getCodeReponse());
        swaRpDTO.setLibelleCodeReponse(swaRp.getLibelleCodeReponse());
        swaRpDTO.setReferenceDCC(swaRp.getReferenceDCC());
        swaRpDTO.setDccInqRPDTO(convertToDto(swaRp.getDccInqRP()));

		return swaRpDTO;
	}

}
