/**
 * 
 */
package com.bnpparibas.dsibddf.application.service;

import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;

/**
 * @author ADMINIBM
 *
 */
public interface IServiceDCC {

	public DCCInqRP callServiceDCC(DCCInqRQ dccInqRQ);
}
