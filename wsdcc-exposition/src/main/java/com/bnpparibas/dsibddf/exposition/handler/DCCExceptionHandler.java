/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.handler;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bnpparibas.dsibddf.application.service.exceptions.DCCLocalException;
import com.bnpparibas.dsibddf.exposition.adaptors.DCCInqAdaptor;
import com.bnpparibas.dsibddf.exposition.dto.DCCSwaRpDTO;

/**
 * @author Ismail B30653
 *
 */
@ControllerAdvice
public class DCCExceptionHandler extends ResponseEntityExceptionHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DCCExceptionHandler.class);  
	
	@ExceptionHandler(DCCLocalException.class)
    public ResponseEntity<Object> handlerException(WebRequest request, DCCLocalException exception) {
		DCCSwaRpDTO output = new DCCSwaRpDTO();
		output.setCodeReponse(exception.getError().getCodeReponse());
		output.setLibelleCodeReponse(exception.getError().getLibelleCodeReponse());
		output.setReferenceDCC(exception.getError().getReferenceDCC());
		output.setDccInqRPDTO(DCCInqAdaptor.convertToDto(exception.getError().getDccInqRP()));
	
		LOGGER.error("Error received from DCC : " + exception.getError().getLibelleCodeReponse());
		return handleExceptionInternal(exception, output, new HttpHeaders(), exception.getError().getHttpStatus(), request);
	}
	
	@ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handlerException(WebRequest request, Exception exception) {
		DCCSwaRpDTO output = new DCCSwaRpDTO();
		output.setCodeReponse(-1);
		output.setLibelleCodeReponse("");
		String uniqueKey = UUID.randomUUID().toString();
		LOGGER.error("Error interne received from DCC {} exception {}", uniqueKey, exception);
		return handleExceptionInternal(exception, output, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}	
	
}