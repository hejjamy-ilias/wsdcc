/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.adaptors;

import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;
import com.bnpparibas.dsibddf.exposition.dto.DCCInqRPDTO;
import com.bnpparibas.dsibddf.exposition.dto.DCCInqRQDTO;

/**
 * @author ADMINIBM
 *
 */
public class DCCInqAdaptor {

	public static DCCInqRPDTO convertToDto(final DCCInqRP dccInqRP) {
		final DCCInqRPDTO rpDTO = new DCCInqRPDTO();
		final DCCInqRPDTO.AcqSett acqSett = new DCCInqRPDTO.AcqSett();
		final DCCInqRPDTO.DCCOffer offer = new DCCInqRPDTO.DCCOffer();
			acqSett.setEd(dccInqRP.getAcqSett().getEd());
		acqSett.setSettAmt(dccInqRP.getAcqSett().getSettAmt());
		acqSett.setSettCur(dccInqRP.getAcqSett().getSettCur());
		acqSett.setSettRate(dccInqRP.getAcqSett().getSettRate());
    	offer.setBillAmt(dccInqRP.getDccOffer().getBillAmt());
		offer.setBillCur(dccInqRP.getDccOffer().getBillCur());
		offer.setBillCurA(dccInqRP.getDccOffer().getBillCurA());
		offer.setBillRate(dccInqRP.getDccOffer().getBillRate());
		offer.setEd(dccInqRP.getDccOffer().getEd());
		offer.setExp(dccInqRP.getDccOffer().getExp());
		offer.setMUp(dccInqRP.getDccOffer().getMUp());
		offer.setPos(dccInqRP.getDccOffer().getPos());
		offer.setR(dccInqRP.getDccOffer().getR());
		offer.setRev(dccInqRP.getDccOffer().getRev());
		offer.setRFlag(dccInqRP.getDccOffer().getRFlag());
		offer.setRpId(dccInqRP.getDccOffer().getRpId());
		offer.setSrc(dccInqRP.getDccOffer().getSrc());
		rpDTO.setAccId(dccInqRP.getAccId());
		rpDTO.setAcqCo(dccInqRP.getAcqCo());
		rpDTO.setAcqId(dccInqRP.getAcqId());
		rpDTO.setAcqSett(acqSett);
		rpDTO.setAtmCat(dccInqRP.getAtmCat());
		rpDTO.setCDate(dccInqRP.getCDate());
		rpDTO.setDate(dccInqRP.getDate());
		rpDTO.setDccOffer(offer);
		rpDTO.setPan(dccInqRP.getPan());
		rpDTO.setRc(dccInqRP.getRc());
		rpDTO.setRcvId(dccInqRP.getRcvId());
		rpDTO.setRrn(dccInqRP.getRrn());
		rpDTO.setTermId(dccInqRP.getTermId());
		rpDTO.setTime(dccInqRP.getTime());
		rpDTO.setTranAmt(dccInqRP.getTranAmt());
		rpDTO.setTranCur(dccInqRP.getTranCur());
		rpDTO.setTranFee(dccInqRP.getTranFee());
		return rpDTO;
	}

	public static DCCInqRQ convertFromDto(final DCCInqRQDTO rqdto) {
		final DCCInqRQ rq = new DCCInqRQ();
		final DCCInqRQ.CrdAccLoc accLoc = new DCCInqRQ.CrdAccLoc();
		rq.setAccId(rqdto.getAccId());
		rq.setAcqCo(rqdto.getAcqCo());
		rq.setAcqId(rqdto.getAcqId());
		rq.setAtmCat(rqdto.getAtmCat());
		rq.setCardType(rqdto.getCardType());

		accLoc.setCi(rqdto.getCrdAccLoc().getCi());
		accLoc.setCo(rqdto.getCrdAccLoc().getCo());
		accLoc.setLo(rqdto.getCrdAccLoc().getLo());
		rq.setCrdAccLoc(accLoc);
		rq.setDate(rqdto.getDate());
		rq.setPan(rqdto.getPan());
		rq.setPCode(rqdto.getPCode());
		rq.setRrn(rqdto.getRrn());
		rq.setTermId(rqdto.getTermId());
		rq.setTime(rqdto.getTime());
		rq.setTranAmt(rqdto.getTranAmt());
		rq.setTranCur(rqdto.getTranCur());
		rq.setTranFee(rqdto.getTranFee());

		return rq;
	}

	public DCCInqRPDTO.AcqSett name() {
		return null;
	}
}
