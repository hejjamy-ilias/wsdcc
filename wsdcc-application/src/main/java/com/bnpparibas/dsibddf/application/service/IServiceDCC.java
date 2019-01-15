/**
 * 
 */
package com.bnpparibas.dsibddf.application.service;

import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;
import com.bnpparibas.dsibddf.domain.beans.DCCSwaRp;


/**
 * @author Ismail B30653
 *
 */
public interface IServiceDCC {

	/**
	 * @param dccInqRQ
	 * @return
	 */
	public DCCSwaRp callServiceDCC(DCCInqRQ dccInqRQ);
}
