package com.globalpay.epg.javachallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EpgJavaChallengeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(EpgJavaChallengeApplication.class, args);
		
		//run.getBean(requiredType);
	}

}
