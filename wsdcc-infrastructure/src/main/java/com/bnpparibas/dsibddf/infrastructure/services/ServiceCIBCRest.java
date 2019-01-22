/**
 * 
 */
package com.bnpparibas.dsibddf.infrastructure.services;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRP.DCCOffer;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;
import com.bnpparibas.dsibddf.domain.constants.Constants;
import com.bnpparibas.dsibddf.domain.services.IServiceCIBCRest;
import com.bnpparibas.dsibddf.domain.utils.FormaterUtil;
import com.bnpparibas.dsibddf.infrastructure.exceptions.RestTemplateResponseErrorHandler;

/**
 * @author ADMINIBM
 *
 */
@Service
public class ServiceCIBCRest implements IServiceCIBCRest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceCIBCRest.class);

	private final RestTemplate restTemplate;
	/**
	 * @param restTemplate
	 */
	   @Autowired
	public ServiceCIBCRest(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.errorHandler(new RestTemplateResponseErrorHandler()).build();
	}

	private static boolean isBouchon=true;

	public DCCInqRP callServiceCIBC(DCCInqRQ dccInqRQ) {
		if (isBouchon) {
			LOGGER.debug("You are in bouchon mode");
			return callModeBouchonDCC(dccInqRQ) ;
		} 
		return restTemplate.postForObject("", dccInqRQ, DCCInqRP.class);
		
	}

	
	

	
	
public DCCInqRP callModeBouchonDCC(DCCInqRQ dccInqRQ) {
		
		DCCInqRP dccInqRP=new DCCInqRP();
		LOGGER.debug("Welcome callModeBouchonDCC");
		dccInqRP.setPan(dccInqRQ.getPan());
        dccInqRP.setTranAmt(dccInqRQ.getTranAmt());
        dccInqRP.setTime(FormaterUtil.convertToXmlGregorianCalendar(dccInqRQ.getTime()));
        dccInqRP.setDate(FormaterUtil.convertToXmlGregorianCalendar(dccInqRQ.getDate()));
        dccInqRP.setAcqCo(dccInqRQ.getAcqCo());
        dccInqRP.setTermId(dccInqRQ.getTermId());
        dccInqRP.setTranCur(dccInqRQ.getTranCur());
        dccInqRP.setAtmCat(dccInqRQ.getAtmCat());
        dccInqRP.setRcvId("tttt");
        dccInqRP.setRc("hhh");
   
        final  DCCOffer dccOffer = new DCCOffer();
        
        dccOffer.setBillAmt(BigDecimal.valueOf(Double.parseDouble(Constants.BILLAMT)));
        dccOffer.setBillRate(BigDecimal.valueOf(Double.parseDouble(Constants.BILLRATE)));
        dccOffer.setBillCur(BigInteger.valueOf(Long.parseLong(Constants.BILLCUR)));
        dccOffer.setBillCurA(Constants.BILLCURA);
        dccOffer.setRpId(Constants.RPID);
        dccOffer.setRFlag(Constants.RFLAG);
        dccOffer.setR(BigDecimal.valueOf(Double.parseDouble(Constants.R)));
        dccOffer.setPos(Constants.POS);
        dccOffer.setExp(FormaterUtil.convertToXmlGregorianCalendar(Constants.EXP));
        dccOffer.setMUp(BigDecimal.valueOf(Double.parseDouble(Constants.MUP)));
        dccOffer.setSrc(Constants.SRC);
        dccOffer.setRev(BigDecimal.valueOf(Double.parseDouble(Constants.REV)));
        dccInqRP.setDccOffer(dccOffer);	
		return dccInqRP;
	}
	
	

	
}
