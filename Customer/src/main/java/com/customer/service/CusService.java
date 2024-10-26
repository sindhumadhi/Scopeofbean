package com.customer.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.Customer;
import com.customer.dao.CusDao;


@Service
public class CusService 
{

	@Autowired
	CusDao cd;
	@Autowired
	RestTemplate rt;
	
	public String postAll(List<Customer> l)
	{
		return cd.postAll(l);
	}
	
	public List<Customer> getAll()
	{
		return cd.getAll();
	}
	
	public String  postAllIncludeBranch(List<Customer> a)
	{
		
		return cd.postAllIncludeBranch(a);
	
	}
	
	
}
