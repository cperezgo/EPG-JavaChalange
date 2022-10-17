package com.globalpay.epg.javachallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalpay.epg.javachallenge.model.PaymentProcessorDto;
import com.globalpay.epg.javachallenge.persistence.dao.PaymentProcessorRepository;

@Service
public class PaymentProcessorServiceImpl implements PaymentProcessorService {
	@Autowired
	PaymentProcessorRepository repository;

	@Override
	public PaymentProcessorDto save(PaymentProcessorDto paymentProcessor) {
		
		return PaymentProcessorConverter.convert(repository.save(PaymentProcessorConverter.convert(paymentProcessor)));
	}

}
