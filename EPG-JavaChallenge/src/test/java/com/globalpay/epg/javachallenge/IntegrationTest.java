package com.globalpay.epg.javachallenge;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.globalpay.epg.javachallenge.config.AppConfig;
import com.globalpay.epg.javachallenge.model.EcommerceDto;
import com.globalpay.epg.javachallenge.model.PaymentProcessorDto;
import com.globalpay.epg.javachallenge.service.EcommerceService;
import com.globalpay.epg.javachallenge.service.PaymentProcessorService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
  classes = { AppConfig.class }, 
  loader = AnnotationConfigContextLoader.class)
@Transactional
@ComponentScan("com.globalpay.epg.javachallenge")

@DataJpaTest
class IntegrationTest {
	
	@Autowired
	StartProcess startProcess;
	
	@Autowired
	EcommerceService ecommerceService;
	
	@Autowired
	PaymentProcessorService paymentProcessorService;
	
	@Before
	public void setUp() {
		ecommerceService.saveEcommerce(new EcommerceDto("ECOMMERCE1"));
		ecommerceService.saveEcommerce(new EcommerceDto("ECOMMERCE2"));
		List<EcommerceDto> ecommerces = ecommerceService.getEcommerces();
		
		int flatFee = 4;
		int volumen = 100;
		double app = 0.02;
		PaymentProcessorDto pp = paymentProcessorService.save(new PaymentProcessorDto("CCPP0", flatFee, volumen, app,ecommerces));
	}

	@Test
	void dailyProcessTest() {
		startProcess.dailyProcess();
	}

}
