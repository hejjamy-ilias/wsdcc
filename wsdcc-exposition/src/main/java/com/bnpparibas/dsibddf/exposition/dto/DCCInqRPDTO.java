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
 * Message de reponse� demande d'offre DCC - Reponse
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "pan", "tranAmt", "time", "date", "acqCo", "tranFee", "acqId", "rrn", "termId",
		"accId", "tranCur", "rc", "atmCat", "cDate", "rcvId", "dccOffer", "acqSett" })
@XmlRootElement(name = "DCCInqRP")
public class DCCInqRPDTO {

	@XmlElement(name = "PAN", required = true)
	private String pan;
	@XmlElement(name = "TranAmt", required = true)
	private BigDecimal tranAmt;
	@XmlElement(name = "Time", required = true)
	@XmlSchemaType(name = "time")
	private XMLGregorianCalendar time;
	@XmlElement(name = "Date", required = true)
	@XmlSchemaType(name = "date")
	private XMLGregorianCalendar date;
	@XmlElement(name = "AcqCo", required = true)
	private BigInteger acqCo;
	@XmlElement(name = "TranFee")
	private BigDecimal tranFee;
	@XmlElement(name = "AcqId", required = true)
	private String acqId;
	@XmlElement(name = "RRN",required=false )
	private String rrn;
	@XmlElement(name = "TermId", required = true)
	private String termId;
	@XmlElement(name = "AccId")
	private String accId;
	@XmlElement(name = "TranCur", required = true)
	private BigInteger tranCur;
	@XmlElement(name = "RC", required = true)
	private String rc;
	@XmlElement(name = "ATMCat")
	private String atmCat;
	@XmlElement(name = "CDate", required = true)
	@XmlSchemaType(name = "date")
	private XMLGregorianCalendar cDate;
	@XmlElement(name = "RcvId")
	private String rcvId;
	@XmlElement(name = "DCCOffer")
	private DCCInqRPDTO.DCCOffer dccOffer;
	@XmlElement(name = "AcqSett")
	private DCCInqRPDTO.AcqSett acqSett;

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
	public void setPan(final String value) {
		this.pan = value;
	}

	/**
	 * Gets the value of the tranAmt property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	/**
	 * Sets the value of the tranAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTranAmt(final BigDecimal value) {
		this.tranAmt = value;
	}

	/**
	 * Gets the value of the time property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTime() {
		return time;
	}

	/**
	 * Sets the value of the time property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTime(final XMLGregorianCalendar value) {
		this.time = value;
	}

	/**
	 * Gets the value of the date property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDate(final XMLGregorianCalendar value) {
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
	 * Gets the value of the rc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRc() {
		return rc;
	}

	/**
	 * Sets the value of the rc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRc(final String value) {
		this.rc = value;
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
	 * Gets the value of the cDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCDate() {
		return cDate;
	}

	/**
	 * Sets the value of the cDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCDate(final XMLGregorianCalendar value) {
		this.cDate = value;
	}

	/**
	 * Gets the value of the rcvId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRcvId() {
		return rcvId;
	}

	/**
	 * Sets the value of the rcvId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRcvId(final String value) {
		this.rcvId = value;
	}

	/**
	 * Gets the value of the dccOffer property.
	 * 
	 * @return possible object is {@link DCCInqRPDTO.DCCOffer }
	 * 
	 */
	public DCCInqRPDTO.DCCOffer getDccOffer() {
		return dccOffer;
	}

	/**
	 * Sets the value of the dccOffer property.
	 * 
	 * @param value
	 *            allowed object is {@link DCCInqRPDTO.DCCOffer }
	 * 
	 */
	public void setDccOffer(final DCCInqRPDTO.DCCOffer value) {
		this.dccOffer = value;
	}

	/**
	 * Gets the value of the acqSett property.
	 * 
	 * @return possible object is {@link DCCInqRPDTO.AcqSett }
	 * 
	 */
	public DCCInqRPDTO.AcqSett getAcqSett() {
		return acqSett;
	}

	/**
	 * Sets the value of the acqSett property.
	 * 
	 * @param value
	 *            allowed object is {@link DCCInqRPDTO.AcqSett }
	 * 
	 */
	public void setAcqSett(final DCCInqRPDTO.AcqSett value) {
		this.acqSett = value;
	}

	/**
	 * Message de réponse à demande d'offre DCC - Règlement de l'acquéreur
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "settAmt", "settRate", "settCur", "ed" })
	public static class AcqSett {

		@XmlElement(name = "SettAmt", required = true)
		private BigDecimal settAmt;
		@XmlElement(name = "SettRate", required = true)
		private BigDecimal settRate;
		@XmlElement(name = "SettCur", required = true)
		private BigInteger settCur;
		@XmlElement(name = "ED", required = true)
		private String ed;

		/**
		 * Gets the value of the settAmt property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getSettAmt() {
			return settAmt;
		}

		/**
		 * Sets the value of the settAmt property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setSettAmt(final BigDecimal value) {
			this.settAmt = value;
		}

		/**
		 * Gets the value of the settRate property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getSettRate() {
			return settRate;
		}

		/**
		 * Sets the value of the settRate property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setSettRate(final BigDecimal value) {
			this.settRate = value;
		}

		/**
		 * Gets the value of the settCur property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getSettCur() {
			return settCur;
		}

		/**
		 * Sets the value of the settCur property.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setSettCur(final BigInteger value) {
			this.settCur = value;
		}

		/**
		 * Gets the value of the ed property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEd() {
			return ed;
		}

		/**
		 * Sets the value of the ed property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEd(final String value) {
			this.ed = value;
		}

	}

	/**
	 * Message de réponse à demande d'offre DCC - L'Offre DCC
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "billAmt", "billRate", "billCur", "billCurA", "rpId", "rFlag", "r", "pos", "exp",
			"mUp", "src", "rev", "ed" })
	public static class DCCOffer {

		@XmlElement(name = "BillAmt", required = true)
		private BigDecimal billAmt;
		@XmlElement(name = "BillRate", required = true)
		private BigDecimal billRate;
		@XmlElement(name = "BillCur", required = true)
		private BigInteger billCur;
		@XmlElement(name = "BillCurA")
		private String billCurA;
		@XmlElement(name = "RpId", required = true)
		private String rpId;
		@XmlElement(name = "RFlag", required = true)
		private String rFlag;
		@XmlElement(name = "R", required = true)
		private BigDecimal r;
		@XmlElement(name = "Pos")
		private int pos;
		@XmlElement(name = "Exp", required = true)
		@XmlSchemaType(name = "dateTime")
		private XMLGregorianCalendar exp;
		@XmlElement(name = "MUp", required = true)
		private BigDecimal mUp;
		@XmlElement(name = "Src", required = true)
		private String src;
		@XmlElement(name = "Rev", required = true)
		private BigDecimal rev;
		@XmlElement(name = "ED")
		private String ed;

		/**
		 * Gets the value of the billAmt property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getBillAmt() {
			return billAmt;
		}

		/**
		 * Sets the value of the billAmt property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setBillAmt(final BigDecimal value) {
			this.billAmt = value;
		}

		/**
		 * Gets the value of the billRate property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getBillRate() {
			return billRate;
		}

		/**
		 * Sets the value of the billRate property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setBillRate(final BigDecimal value) {
			this.billRate = value;
		}

		/**
		 * Gets the value of the billCur property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getBillCur() {
			return billCur;
		}

		/**
		 * Sets the value of the billCur property.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setBillCur(final BigInteger value) {
			this.billCur = value;
		}

		/**
		 * Gets the value of the billCurA property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBillCurA() {
			return billCurA;
		}

		/**
		 * Sets the value of the billCurA property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setBillCurA(final String value) {
			this.billCurA = value;
		}

		/**
		 * Gets the value of the rpId property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRpId() {
			return rpId;
		}

		/**
		 * Sets the value of the rpId property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRpId(final String value) {
			this.rpId = value;
		}

		/**
		 * Gets the value of the rFlag property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRFlag() {
			return rFlag;
		}

		/**
		 * Sets the value of the rFlag property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRFlag(final String value) {
			this.rFlag = value;
		}

		/**
		 * Gets the value of the r property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getR() {
			return r;
		}

		/**
		 * Sets the value of the r property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setR(final BigDecimal value) {
			this.r = value;
		}

		/**
		 * Gets the value of the pos property.
		 * 
		 */
		public int getPos() {
			return pos;
		}

		/**
		 * Sets the value of the pos property.
		 * 
		 */
		public void setPos(final int value) {
			this.pos = value;
		}

		/**
		 * Gets the value of the exp property.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getExp() {
			return exp;
		}

		/**
		 * Sets the value of the exp property.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setExp(final XMLGregorianCalendar value) {
			this.exp = value;
		}

		/**
		 * Gets the value of the mUp property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getMUp() {
			return mUp;
		}

		/**
		 * Sets the value of the mUp property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setMUp(final BigDecimal value) {
			this.mUp = value;
		}

		/**
		 * Gets the value of the src property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSrc() {
			return src;
		}

		/**
		 * Sets the value of the src property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSrc(final String value) {
			this.src = value;
		}

		/**
		 * Gets the value of the rev property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getRev() {
			return rev;
		}

		/**
		 * Sets the value of the rev property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setRev(final BigDecimal value) {
			this.rev = value;
		}

		/**
		 * Gets the value of the ed property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEd() {
			return ed;
		}

		/**
		 * Sets the value of the ed property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEd(final String value) {
			this.ed = value;
		}
	}

}