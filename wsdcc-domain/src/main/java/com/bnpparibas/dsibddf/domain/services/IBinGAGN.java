package com.bnpparibas.dsibddf.domain.services;

import com.bnpparibas.dsibddf.domain.beans.BinGaGn;

/**
 * @author Ismail B30653
 *
 */
public interface IBinGAGN {

	 /**
	 * @param bin
	 * @return
	 */
	BinGaGn findByBin(String bin);
}
