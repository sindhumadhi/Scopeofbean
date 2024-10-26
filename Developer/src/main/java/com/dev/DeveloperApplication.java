package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DeveloperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperApplication.class, args);
	}

	@Bean
	public RestTemplate rt()
	{
		return new RestTemplate();
	}
}
