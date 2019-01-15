package com.bnpparibas.dsibddf.domain.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.bnpparibas.dsibddf.domain.constants.Constants;


public class FormaterUtil {
	
	

	public static String formaterParamCIBC(String chaine, int longeur) {
		final StringBuilder builder= new StringBuilder();
		builder.append(chaine);
		if (builder.length()!=longeur) {
			for (int i = builder.length(); i < longeur; i++) {
				builder.append(" ");
			}
		}
		return builder.toString();
	}
	/**
	  * Converter type string to xmlGregorianCalendar
	  * @author b30653
	  * @param dateString
	  * @return XMLGregorianCalendar
	  * @exception ParseException
	  */
	 public static XMLGregorianCalendar convertToXmlGregorianCalendar(String dateString) {
	     
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
	             
	         }
	      try {
	         xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
	         
	     } catch (DatatypeConfigurationException e) {
	         
	     }

	     return xmlGregCal;
	}
}
