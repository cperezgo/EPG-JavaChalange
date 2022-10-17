package com.globalpay.epg.javachallenge.persistence.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * The Class Ecommerce.
 */
@Entity
public class Ecommerce implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -160360027222234077L;

	/** The company name. */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String companyName;
	
	@ManyToOne
	private PaymentProcessor paymentProcessor;
	

	/**
	 * Instantiates a new ecommerce.
	 *
	 * @param companyName the company name
	 */
	public Ecommerce(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Gets the company name.
	 *
	 * @return the company name
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Sets the company name.
	 *
	 * @param companyName the new company name
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Sets the payment processor.
	 *
	 * @param paymentProcessor the new payment processor
	 */
	public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
		this.paymentProcessor.getEcommerces().add(this);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(companyName);
		builder.append("ECOMMERCE:");
		builder.append(companyName);
		builder.append(", paymentProcessor=");
		builder.append(paymentProcessor);
		builder.append("]");
		return builder.toString();
	}

}
