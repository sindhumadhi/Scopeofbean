package com.customer;

import org.springframework.context.annotation.Bean;
//import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomConfig {
	
	@Bean
	public RestTemplate rt()
	{
		return new RestTemplate();
	}
	

}
