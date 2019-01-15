/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.controller;

import static com.bnpparibas.dsibddf.exposition.adaptors.DCCInqAdaptor.convertFromDto;
import static com.bnpparibas.dsibddf.exposition.adaptors.DCCInqAdaptor.convertToSwaRpDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bnpparibas.dsibddf.application.service.IServiceDCC;
import com.bnpparibas.dsibddf.domain.beans.DCCSwaRp;
import com.bnpparibas.dsibddf.exposition.dto.DCCInqRPDTO;
import com.bnpparibas.dsibddf.exposition.dto.DCCInqRQDTO;
import com.bnpparibas.dsibddf.exposition.dto.DCCSwaRpDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author ADMINIBM
 *
 */
@RestController
@RequestMapping("/wsdcc")
public class Facade {

	@Autowired
	private IServiceDCC serviceDCC;

	@ApiOperation(value = "Find Reponse CIBC By Pan", response = DCCInqRPDTO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 400, message = "Invalid Pan supplied"),
			@ApiResponse(code = 404, message = "Definition not found") })
@RequestMapping(value = "call", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<DCCSwaRpDTO> pub(@RequestBody(required = true) final DCCInqRQDTO dccInqRQDTO) {

		return new ResponseEntity<DCCSwaRpDTO>(convertToSwaRpDTO(callServiceDCC(dccInqRQDTO)), HttpStatus.OK) ;

	}


	/**
	 * @param dccInqRQ
	 * @return DCCInqRP
	 * @see com.bnpparibas.dsibddf.application.service.IServiceDCC#callServiceDCC(com.bnpparibas.dsibddf.domain.beans.DCCInqRQ)
	 */
	public DCCSwaRp callServiceDCC(final DCCInqRQDTO dccInqRQDTO) {
		return serviceDCC.callServiceDCC(convertFromDto(dccInqRQDTO));
	}
}
