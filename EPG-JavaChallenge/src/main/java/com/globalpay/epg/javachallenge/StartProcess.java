package com.globalpay.epg.javachallenge;

import java.util.List;
import java.util.stream.IntStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.globalpay.epg.javachallenge.model.EcommerceDto;
import com.globalpay.epg.javachallenge.model.PaymentProcessorDto;
import com.globalpay.epg.javachallenge.service.EcommerceService;
import com.globalpay.epg.javachallenge.service.PaymentProcessorService;

@Component
public class StartProcess {
	
	 private static final Logger LOGGER = LogManager.getLogger(StartProcess.class);

	
	private int volumen;

	private double app;

	
	private int flatFee;
	
	@Autowired
	private EcommerceService ecommerceService;
	
	@Autowired
	private PaymentProcessorService paymentProcessorService;

	
	@Scheduled( cron = "0 8 * * *")
	public void dailyProcess() {
		List<EcommerceDto> ecommerces = ecommerceService.getEcommerces(); 
		// volumen aleatorio entre 100 y 200
		volumen = (int)Math.floor(Math.random()*(200-200+1)+100);
		StringBuilder sb = new StringBuilder();
		IntStream.range(0, ecommerces.size()). forEach((index) -> {
			sb.append("Payment Processor name: ").append("CCPP"+index);
			PaymentProcessorDto save = paymentProcessorService.save(new PaymentProcessorDto("CCPP"+index, flatFee, volumen, app));
			ecommerces.get(index).setPaymentProcessor(save);
		});
		ecommerceService.updateEcommerces(ecommerces);
		
		sb.append("\nFlat Fee: ").append(flatFee);
		sb.append("\nVolumen: ").append(volumen).append("/day - APP:").append(app);
		

		LOGGER.info(sb);
		
	}
}
