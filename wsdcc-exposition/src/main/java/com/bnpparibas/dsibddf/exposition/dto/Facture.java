/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.dto;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.NumberFormat;

/**
 * @author ADMINIBM
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Facture")
public class Facture {

	@XmlElement(name = "product", required = true)
	private String product;
	@XmlElement(name = "price", required = true)
	@NumberFormat(pattern = "###.##")
	private BigDecimal price;
	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
