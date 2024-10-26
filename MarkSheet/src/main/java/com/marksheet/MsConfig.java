package com.marksheet;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MsConfig {
	
	@Bean
	public RestTemplate tr()
	{
		return new RestTemplate();
	}

}
