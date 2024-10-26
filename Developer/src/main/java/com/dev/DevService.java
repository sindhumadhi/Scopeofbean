package com.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DevService
{
	
	@Autowired
	RestTemplate rt;
	
	@Autowired
	 private CircuitBreakerFactory circuitBreakerFactory;
	
	
	
	
	public String getDev()
	{
		
		CircuitBreaker cb=circuitBreakerFactory.create("DeveloperService");
		
		return cb.run(()->
		{
			String url="http://localhost:8081/get";
			ResponseEntity<String> re=rt.exchange(url, HttpMethod.GET, null, String.class);
			String title=re.getBody();
			
			return  title;
		},Throwable->fall());
		
		
	}
	
	public String fall()
	{
		return "Testing server failed";
	}

}
