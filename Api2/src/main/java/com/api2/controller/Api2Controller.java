package com.api2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api2.AcPojo;

@RestController
@RequestMapping(value = "/api2")
public class Api2Controller 
{
	@Autowired
	RestTemplate rt;
	
	@GetMapping(value = "/getValue")
	public String getValue()
	{
		String url="http://localhost:8080/get";
		ResponseEntity<String> re=rt.exchange(url, HttpMethod.GET,null,String.class);
		String x=re.getBody();
		return x;
		
	}
	
	@GetMapping(value = "/getValueP")
	public Integer getPriceValue()
	{
		String url="http://localhost:8082/getPrice";
		ResponseEntity<Integer> re=rt.exchange(url, HttpMethod.GET,null,Integer.class);
		Integer x=re.getBody();
		return x-x*10/100;
	}
	
	@GetMapping(value = "/getList ")
	public List<AcPojo> getAc()
	{
		String url="http://localhost:8080/Ac/getAll";
		ResponseEntity <List<AcPojo>> re=rt.exchange(url, HttpMethod.GET,null,new  ParameterizedTypeReference<List<AcPojo>>() {});
		List<AcPojo> l=re.getBody();
		return l;
	
	}
	
	@GetMapping(value = "/getId/{b}")
	public AcPojo getById(@PathVariable int b)
	{
		
		String url="http://localhost:8080/Ac/getById/";
		//int b=1;
		ResponseEntity<AcPojo> re=rt.exchange(url+b, HttpMethod.GET,null,new ParameterizedTypeReference<AcPojo>() {});
		AcPojo ap=re.getBody();
		return ap;
	}
	

}
