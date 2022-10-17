package com.globalpay.epg.javachallenge.model;

import java.util.List;

/**
 * The Class PaymentProcessorDto.
 */
public class PaymentProcessorDto {
	
	/** The payment processor name. */
	private String paymentProcessorName;
	
	
	/** The flat fee. */
	private int flatFee;
	
	/** The volumen. */
	private int volumen;
	
	/** The app. */
	private double app;
	
	/** The ecommerces. */
	private List<EcommerceDto> ecommerces;

	/**
	 * Instantiates a new payment processor dto.
	 */
	public PaymentProcessorDto() {
		super();
	}

	/**
	 * Instantiates a new payment processor dto.
	 *
	 * @param paymentProcessorName the payment processor name
	 * @param flatFee the flat fee
	 * @param volumen the volumen
	 * @param app the app
	 */
	public PaymentProcessorDto(String paymentProcessorName, int flatFee, int volumen, double app) {
		super();
		this.paymentProcessorName = paymentProcessorName;
		this.flatFee = flatFee;
		this.volumen = volumen;
		this.app = app;
	}
	
	/**
	 * Instantiates a new payment processor dto.
	 *
	 * @param paymentProcessorName the payment processor name
	 * @param flatFee the flat fee
	 * @param volumen the volumen
	 * @param app the app
	 * @param ecommerces the ecommerces
	 */
	public PaymentProcessorDto(String paymentProcessorName, int flatFee, int volumen, double app,List<EcommerceDto> ecommerces) {
		super();
		this.paymentProcessorName = paymentProcessorName;
		this.flatFee = flatFee;
		this.volumen = volumen;
		this.app = app;
		this.ecommerces = ecommerces;
	}


	/**
	 * Gets the payment processor name.
	 *
	 * @return the payment processor name
	 */
	public String getPaymentProcessorName() {
		return paymentProcessorName;
	}

	/**
	 * Sets the payment processor name.
	 *
	 * @param paymentProcessorName the new payment processor name
	 */
	public void setPaymentProcessorName(String paymentProcessorName) {
		this.paymentProcessorName = paymentProcessorName;
	}

	/**
	 * Gets the flat fee.
	 *
	 * @return the flat fee
	 */
	public int getFlatFee() {
		return flatFee;
	}

	/**
	 * Sets the flat fee.
	 *
	 * @param flatFee the new flat fee
	 */
	public void setFlatFee(int flatFee) {
		this.flatFee = flatFee;
	}

	/**
	 * Gets the volumen.
	 *
	 * @return the volumen
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Sets the volumen.
	 *
	 * @param volumen the new volumen
	 */
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	/**
	 * Gets the app.
	 *
	 * @return the app
	 */
	public double getApp() {
		return app;
	}

	/**
	 * Sets the app.
	 *
	 * @param app the new app
	 */
	public void setApp(double app) {
		this.app = app;
	}


	/**
	 * Gets the ecommerces.
	 *
	 * @return the ecommerces
	 */
	public List<EcommerceDto> getEcommerces() {
		return ecommerces;
	}

	/**
	 * Sets the ecommerces.
	 *
	 * @param ecommerces the new ecommerces
	 */
	public void setEcommerces(List<EcommerceDto> ecommerces) {
		this.ecommerces = ecommerces;
	}

}
