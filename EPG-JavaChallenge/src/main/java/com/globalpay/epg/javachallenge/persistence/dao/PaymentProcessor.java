package com.globalpay.epg.javachallenge.persistence.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PaymentProcessor implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String paymentProcessorName;
	
	@Column
	private int flatFee;
	@Column
	private int volumen;
	@Column
	private double app;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="paymentProcessor")
	private List<Ecommerce> ecommerces;

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


	public List<Ecommerce> getEcommerces() {
		return ecommerces;
	}

	public void setEcommerces(List<Ecommerce> ecommerces) {
		this.ecommerces = ecommerces;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentProcessor:");
		builder.append(paymentProcessorName);
		this.ecommerces.forEach(ec -> builder.append(ec));
		
		return builder.toString();
	}
}
