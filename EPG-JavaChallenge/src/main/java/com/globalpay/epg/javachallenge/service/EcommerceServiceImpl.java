package com.globalpay.epg.javachallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalpay.epg.javachallenge.model.EcommerceDto;
import com.globalpay.epg.javachallenge.persistence.dao.EcommerceRepository;

@Service
public class EcommerceServiceImpl implements EcommerceService {
	
	@Autowired
	EcommerceRepository ecommerceRepository;

	@Override
	public List<EcommerceDto> getEcommerces() {
		return EcommerceConverter.convert(ecommerceRepository.findAll());
	}

	@Override
	public void updateEcommerces(List<EcommerceDto> ecommerces) {
		ecommerces.forEach(e -> saveEcommerce(e));
	}

	@Override
	public void saveEcommerce(EcommerceDto ecommerce) {
		ecommerceRepository.save(EcommerceConverter.convert(ecommerce));

	}

}
