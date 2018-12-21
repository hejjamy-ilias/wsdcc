/**
 * 
 */
package com.bnpparibas.dsibddf.infrastructure.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import com.bnpparibas.dsibddf.domain.beans.DCCInqRP;
import com.bnpparibas.dsibddf.domain.beans.DCCInqRQ;
import com.bnpparibas.dsibddf.domain.services.IServiceCIBCRest;

/**
 * @author ADMINIBM
 *
 */
public class ServiceCIBCRest implements IServiceCIBCRest {

	private final RestTemplate restTemplate;
	
	public DCCInqRP callServiceCIBC(DCCInqRQ dccInqRQ) {
		
		DCCInqRP dccInqRP =restTemplate.postForObject("", dccInqRQ, DCCInqRP.class);
		return null;
	}

	/**
	 * @param restTemplate
	 */
	public ServiceCIBCRest(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

}
