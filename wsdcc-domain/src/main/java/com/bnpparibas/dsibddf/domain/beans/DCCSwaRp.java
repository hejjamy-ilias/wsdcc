/**
 * 
 */
package com.bnpparibas.dsibddf.domain.beans;



/**
 * @author Ismail B30653
 *
 */
public class DCCSwaRp {
	
	private int codeReponse;
	
	private String libelleCodeReponse;
	
	private String referenceDCC;
	
	private DCCInqRP dccInqRP;

	/**
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
	 * @return the dccInqRP
	 */
	public DCCInqRP getDccInqRP() {
		return dccInqRP;
	}

	/**
	 * @param dccInqRP the dccInqRP to set
	 */
	public void setDccInqRP(DCCInqRP dccInqRP) {
		this.dccInqRP = dccInqRP;
	}
}
