/**
 * 
 */
package com.bnpparibas.dsibddf.application.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.application.service.IServiceDCC;
import com.bnpparibas.dsibddf.application.utils.Constants;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRP.DCCOffer;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;

/**
 * @author ADMINIBM
 *
 */
@Service
public class ServiceDCC implements IServiceDCC {
	

	public DCCInqRP callServiceDCC(DCCInqRQ dccInqRQ) {
		
		DCCInqRP dccInqRP=new DCCInqRP();
		
		dccInqRP.setPan(dccInqRQ.getPan());
        dccInqRP.setTranAmt(BigDecimal.valueOf(dccInqRQ.getTranAmt()));
        dccInqRP.setTime(convertToXmlGregorianCalendar(dccInqRQ.getTime()));
        dccInqRP.setDate(convertToXmlGregorianCalendar(dccInqRQ.getDate()));
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
        dccOffer.setExp(convertToXmlGregorianCalendar(Constants.EXP));
        dccOffer.setMUp(BigDecimal.valueOf(Double.parseDouble(Constants.MUP)));
        dccOffer.setSrc(Constants.SRC);
        dccOffer.setRev(BigDecimal.valueOf(Double.parseDouble(Constants.REV)));
        dccInqRP.setDccOffer(dccOffer);
        

		
		return dccInqRP;
	}

	
	   /**
     * Converter type string to xmlGregorianCalendar
     * @author b30653
     * @param dateString
     * @return XMLGregorianCalendar
     * @exception ParseException
     */
    private static XMLGregorianCalendar convertToXmlGregorianCalendar(String dateString) {
        
        DateFormat format=null;
            if (dateString.length()<= Constants.LONGEUR_TIME) {
                format = new SimpleDateFormat("HH:mm:ss");
            }else if (dateString.length()== Constants.LONGEUR_CDATE) {
                format = new SimpleDateFormat("yyyy-MM-dd");
            }else if (dateString.length()==Constants.LONGEUR_EXP) {
                format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");  
            }
        XMLGregorianCalendar xmlGregCal = null;
        Date date;
        GregorianCalendar cal = new GregorianCalendar();
            try {
                if (!dateString.isEmpty()) {
                    date = format.parse(dateString);
                    cal.setTime(date);
                }  
                 
            } catch (ParseException e) {
                
              
            	System.out.println("["+"probleme de conversion" + cal + "()] ");
            }
         try {
            xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            
        } catch (DatatypeConfigurationException e) {
            System.out.println("["+"probleme de conversion" + cal + "()] ");
            
        }

        return xmlGregCal;
 }
	
}
