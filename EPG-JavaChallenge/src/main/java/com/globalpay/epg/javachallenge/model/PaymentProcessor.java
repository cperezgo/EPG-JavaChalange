package com.globalpay.epg.javachallenge.model;

public class PaymentProcessor {

	private String paymentProcessorName;
	
	private int flatFee;
	
	private int volumen;
	
	private double app;

	public String getPaymentProcessorName() {
		return paymentProcessorName;
	}

	public void setPaymentProcessorName(String paymentProcessorName) {
		this.paymentProcessorName = paymentProcessorName;
	}

	public int getFlatFee() {
		return flatFee;
	}

	public void setFlatFee(int flatFee) {
		this.flatFee = flatFee;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public double getApp() {
		return app;
	}

	public void setApp(double app) {
		this.app = app;
	}
}
