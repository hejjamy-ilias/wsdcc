/**
 * 
 */
package com.bnpparibas.dsibddf.domain.services;

import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;

/**
 * @author ADMINIBM
 *
 */
public interface IServiceCIBCRest {

	public DCCInqRP callServiceCIBC(final DCCInqRQ  dccInqRQ);
}
