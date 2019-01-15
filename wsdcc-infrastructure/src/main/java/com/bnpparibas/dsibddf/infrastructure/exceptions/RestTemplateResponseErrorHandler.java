/**
 * 
 */
package com.bnpparibas.dsibddf.infrastructure.exceptions;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * @author Ismail B30653
 *
 */
@Component
public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.client.ResponseErrorHandler#hasError(org.
	 * springframework.http.client.ClientHttpResponse)
	 */
	public boolean hasError(ClientHttpResponse httpResponse) throws IOException {

		return (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR
				|| httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.client.ResponseErrorHandler#handleError(org.
	 * springframework.http.client.ClientHttpResponse)
	 */
	public void handleError(ClientHttpResponse httpResponse) throws IOException {

		if (httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
			// Handle SERVER_ERROR
		} else if (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR
				|| httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
			// Handle CLIENT_ERROR
			throw new NotFoundException();

		}
	}
}
