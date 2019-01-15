package com.bnpparibas.dsibddf.infrastructure.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.bnpparibas.dsibddf.domain.beans.BinGaGn;
import com.bnpparibas.dsibddf.domain.services.IBinGAGN;
@Repository
@Primary
public class BinGAGN implements IBinGAGN{

	/** */
	@Autowired
	private transient BinGAGNRepository gagnRepository;
	

	public BinGaGn findByBin(String bin) {
		return gagnRepository.findByBin(bin);
	}

}
