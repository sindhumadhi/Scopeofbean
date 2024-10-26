package com.productpojo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.productpojo.ProductPojo;

@RestController
@RequestMapping("/Pojo")
public class ProductPojoController 
{
	@Autowired
	RestTemplate rt;
	
	
	@GetMapping(value = "/getPro")
	public List<ProductPojo> getThis()
	{
		String url1="http://localhost:8080/Product/getall";
		String url2="http://localhost:8081/Gst/getPer/";
		
		ResponseEntity<List<ProductPojo>> re1=rt.exchange(url1, HttpMethod.GET,null,new ParameterizedTypeReference <List<ProductPojo>>() {});
		
		List<ProductPojo> pro=re1.getBody();
		
		pro.forEach(x->
		{
			int hsn=x.getHsnCode();
			ResponseEntity<Integer> re2=rt.exchange(url2+hsn, HttpMethod.GET,null,Integer.class);
			Integer percent=re2.getBody();
			
			int netPrice=x.getPrice()+ x.getPrice()*percent/100;
			x.setPrice(netPrice);
		
			
		});
		return pro;
		
		
	}
	

}
