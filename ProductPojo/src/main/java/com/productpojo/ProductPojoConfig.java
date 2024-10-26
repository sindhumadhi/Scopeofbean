package com.productpojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProductPojoConfig {
	
	@Bean
	public RestTemplate rt()
	{
		return new RestTemplate();
	}

}
