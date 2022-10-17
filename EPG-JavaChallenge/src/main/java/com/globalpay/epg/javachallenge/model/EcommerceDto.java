package com.globalpay.epg.javachallenge.model;

/**
 * The Class Ecommerce.
 */
public class EcommerceDto {
	
	/** The company name. */
	private String companyName;
	private PaymentProcessorDto paymentProcessor;
	

	/**
	 * Instantiates a new ecommerce.
	 *
	 * @param companyName the company name
	 */
	public EcommerceDto(String companyName) {
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
	public void setPaymentProcessor(PaymentProcessorDto paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
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
