package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.Customer;
import com.customer.service.CusService;

@RestController
@RequestMapping(value = "/Cust")
public class CusController {
	
	@Autowired
	CusService cs;
	
	@Autowired
	RestTemplate rt;
	
	@PostMapping(value = "/postAll")
	public String postAll(@RequestBody  List<Customer> l)
	{
		
		return cs.postAll(l);
	}
	
	@GetMapping(value = "/getAll")
	public List<Customer> getAll()
	{
		return cs.getAll();
	}

	@PostMapping(value="/post")
	public String postAllIncludeBranch(@RequestBody List<Customer> l)
	{
		
		String url1="http://localhost:8083/Bank/getBranch/";
		
		l.forEach(x->
		{
			 String d=x.getIfsc();
			
			ResponseEntity<String> re2=rt.exchange(url1+d, HttpMethod.GET,null,String.class );
		String	b =re2.getBody();
			x.setBranch(b);
			
			
		}
		
		);
		return cs.postAllIncludeBranch(l);
	}
	
	
	
}
