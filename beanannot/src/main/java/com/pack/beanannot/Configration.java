package com.pack.beanannot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configration {
	
	@Bean
	public Resort getBean() {
		return new Resort();
	}

}
