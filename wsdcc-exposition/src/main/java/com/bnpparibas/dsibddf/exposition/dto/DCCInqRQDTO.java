package com.bnpparibas.dsibddf.exposition.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Message de demande d'offre DCC - Request
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "pan", "cardType", "tranAmt", "time", "date", "acqCo", "tranFee", "acqId", "rrn",
		"termId", "accId", "crdAccLoc", "tranCur", "pCode", "atmCat" })
@XmlRootElement(name = "DCCInqRQ")
public class DCCInqRQDTO {

	@XmlElement(name = "PAN", required = true)
	private String pan;
	@XmlElement(name = "CardType")
	private String cardType;
	@XmlElement(name = "TranAmt", required = true)
	private int tranAmt;
	@XmlElement(name = "Time", required = true)
	@XmlSchemaType(name = "time")
	private String time;
	@XmlElement(name = "Date", required = true)
	@XmlSchemaType(name = "date")
	private String date;
	@XmlElement(name = "AcqCo", required = true)
	private BigInteger acqCo;
	@XmlElement(name = "TranFee")
	private BigDecimal tranFee;
	@XmlElement(name = "AcqId", required = true)
	private String acqId;
	@XmlElement(name = "RRN")
	private String rrn;
	@XmlElement(name = "TermId", required = true)
	private String termId;
	@XmlElement(name = "AccId")
	private String accId;
	@XmlElement(name = "CrdAccLoc")
	private DCCInqRQDTO.CrdAccLoc crdAccLoc;
	@XmlElement(name = "TranCur", required = true)
	private BigInteger tranCur;
	@XmlElement(name = "PCode")
	private String pCode;
	@XmlElement(name = "ATMCat")
	private String atmCat;

	/**
	 * Gets the value of the pan property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * Sets the value of the pan property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPan(final String pan) {
		this.pan = pan;
	}

	/**
	 * Gets the value of the cardType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * Sets the value of the cardType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCardType(final String value) {
		this.cardType = value;
	}

	/**
	 * Gets the value of the tranAmt property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public int getTranAmt() {
		return tranAmt;
	}

	/**
	 * Sets the value of the tranAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTranAmt(final int value) {
		this.tranAmt = value;
	}

	/**
	 * Gets the value of the time property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets the value of the time property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTime(final String value) {
		this.time = value;
	}

	/**
	 * Gets the value of the date property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDate(final String value) {
		this.date = value;
	}

	/**
	 * Gets the value of the acqCo property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getAcqCo() {
		return acqCo;
	}

	/**
	 * Sets the value of the acqCo property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setAcqCo(final BigInteger value) {
		this.acqCo = value;
	}

	/**
	 * Gets the value of the tranFee property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTranFee() {
		return tranFee;
	}

	/**
	 * Sets the value of the tranFee property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTranFee(final BigDecimal value) {
		this.tranFee = value;
	}

	/**
	 * Gets the value of the acqId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAcqId() {
		return acqId;
	}

	/**
	 * Sets the value of the acqId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAcqId(final String value) {
		this.acqId = value;
	}

	/**
	 * Gets the value of the rrn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRrn() {
		return rrn;
	}

	/**
	 * Sets the value of the rrn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRrn(final String value) {
		this.rrn = value;
	}

	/**
	 * Gets the value of the termId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTermId() {
		return termId;
	}

	/**
	 * Sets the value of the termId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTermId(final String value) {
		this.termId = value;
	}

	/**
	 * Gets the value of the accId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccId() {
		return accId;
	}

	/**
	 * Sets the value of the accId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccId(final String value) {
		this.accId = value;
	}

	/**
	 * Gets the value of the crdAccLoc property.
	 * 
	 * @return possible object is {@link DCCInqRQDTO.CrdAccLoc }
	 * 
	 */
	public DCCInqRQDTO.CrdAccLoc getCrdAccLoc() {
		return crdAccLoc;
	}

	/**
	 * Sets the value of the crdAccLoc property.
	 * 
	 * @param value
	 *            allowed object is {@link DCCInqRQDTO.CrdAccLoc }
	 * 
	 */
	public void setCrdAccLoc(final DCCInqRQDTO.CrdAccLoc value) {
		this.crdAccLoc = value;
	}

	/**
	 * Gets the value of the tranCur property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getTranCur() {
		return tranCur;
	}

	/**
	 * Sets the value of the tranCur property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setTranCur(final BigInteger value) {
		this.tranCur = value;
	}

	/**
	 * Gets the value of the pCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPCode() {
		return pCode;
	}

	/**
	 * Sets the value of the pCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPCode(final String value) {
		this.pCode = value;
	}

	/**
	 * Gets the value of the atmCat property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAtmCat() {
		return atmCat;
	}

	/**
	 * Sets the value of the atmCat property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAtmCat(final String value) {
		this.atmCat = value;
	}

	/**
	 * Nom et adresse de l'accepteur de carte
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "lo", "ci", "co" })
	public static class CrdAccLoc {

		@XmlElement(name = "Lo", required = true)
		private String lo;
		@XmlElement(name = "Ci", required = true)
		private String ci;
		@XmlElement(name = "Co", required = true)
		private String co;

		/**
		 * Gets the value of the lo property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLo() {
			return lo;
		}

		/**
		 * Sets the value of the lo property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLo(final String value) {
			this.lo = value;
		}

		/**
		 * Gets the value of the ci property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCi() {
			return ci;
		}

		/**
		 * Sets the value of the ci property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCi(final String value) {
			this.ci = value;
		}

		/**
		 * Gets the value of the co property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCo() {
			return co;
		}

		/**
		 * Sets the value of the co property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCo(final String value) {
			this.co = value;
		}

	}

}