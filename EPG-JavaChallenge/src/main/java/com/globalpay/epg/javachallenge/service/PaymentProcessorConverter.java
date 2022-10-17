package com.globalpay.epg.javachallenge.service;

import com.globalpay.epg.javachallenge.model.PaymentProcessorDto;
import com.globalpay.epg.javachallenge.persistence.dao.PaymentProcessor;

public class PaymentProcessorConverter {

	public static PaymentProcessor convert(PaymentProcessorDto paymentProcessor) {
		PaymentProcessor pp = new PaymentProcessor();
		pp.setApp(paymentProcessor.getApp());
		pp.setEcommerces(EcommerceConverter.convertTo(paymentProcessor.getEcommerces()));
		pp.setFlatFee(paymentProcessor.getFlatFee());
		pp.setVolumen(paymentProcessor.getVolumen());
		return pp;
	}

	public static PaymentProcessorDto convert(PaymentProcessor paymentProcessor) {
		PaymentProcessorDto pp = new PaymentProcessorDto();
		pp.setApp(paymentProcessor.getApp());
		pp.setEcommerces(EcommerceConverter.convert(paymentProcessor.getEcommerces()));
		pp.setFlatFee(paymentProcessor.getFlatFee());
		pp.setVolumen(paymentProcessor.getVolumen());
		return pp;
	}

}
