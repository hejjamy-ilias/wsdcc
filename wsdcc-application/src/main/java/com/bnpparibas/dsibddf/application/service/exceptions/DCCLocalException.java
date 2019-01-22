/**
 * 
 */
package com.bnpparibas.dsibddf.application.service.exceptions;

/**
 * @author Ismail B30653
 *
 */
public class DCCLocalException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4374055544417431416L;
	/**
	 * 
	 */
	private final DCCError error;
	
	/**
	 * @param error
	 */
	public DCCLocalException(DCCError error){
		super();
		this.error = error;
	}


	/**
	 * @return
	 */
	public DCCError getError() {
		return error;
	}
}
