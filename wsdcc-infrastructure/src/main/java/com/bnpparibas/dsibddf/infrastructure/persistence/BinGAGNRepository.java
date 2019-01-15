package com.bnpparibas.dsibddf.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnpparibas.dsibddf.domain.beans.BinGaGn;
import com.bnpparibas.dsibddf.domain.services.IBinGAGN;

public interface BinGAGNRepository extends IBinGAGN,JpaRepository<BinGaGn, String> {
	
	

}
