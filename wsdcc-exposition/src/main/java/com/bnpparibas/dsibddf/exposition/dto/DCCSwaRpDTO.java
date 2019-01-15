/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ismail B30653
 *Message de réponse à la demande d'offre DCC
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DCCSwaRp")
public class DCCSwaRpDTO {

	@XmlElement(name = "CodeReponse", required = true)
	private int codeReponse;
	@XmlElement(name = "LibelleCodeReponse", required = true)
	private String libelleCodeReponse;
	@XmlElement(name = "Reference_DCC", required = true)
	private String referenceDCC;
	@XmlElement(name = "DccInqRP", required = true)
	private DCCInqRPDTO dccInqRPDTO;
	/**
	 * Code réponse du	service
	 * @return the codeReponse
	 */
	public int getCodeReponse() {
		return codeReponse;
	}
	/**
	 * @param codeReponse the codeReponse to set
	 */
	public void setCodeReponse(int codeReponse) {
		this.codeReponse = codeReponse;
	}
	/**
	 * Libellé associé au code réponse
	 * @return the libelleCodeReponse
	 */
	public String getLibelleCodeReponse() {
		return libelleCodeReponse;
	}
	/**
	 * @param libelleCodeReponse the libelleCodeReponse to set
	 */
	public void setLibelleCodeReponse(String libelleCodeReponse) {
		this.libelleCodeReponse = libelleCodeReponse;
	}
	/**
	 * La reference DCC de l'offre DCC qui vaut une suite de zeros en cas d'erreur.
	 * @return the referenceDCC
	 */
	public String getReferenceDCC() {
		return referenceDCC;
	}
	/**
	 * @param referenceDCC the referenceDCC to set
	 */
	public void setReferenceDCC(String referenceDCC) {
		this.referenceDCC = referenceDCC;
	}
	/**
	 * @return the dccInqRPDTO
	 */
	public DCCInqRPDTO getDccInqRPDTO() {
		return dccInqRPDTO;
	}
	/**
	 * @param dccInqRPDTO the dccInqRPDTO to set
	 */
	public void setDccInqRPDTO(DCCInqRPDTO dccInqRPDTO) {
		this.dccInqRPDTO = dccInqRPDTO;
	}
}