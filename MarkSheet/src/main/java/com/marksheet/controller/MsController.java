package com.marksheet.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.marksheet.MarkSheet;
import com.marksheet.service.MsService;

@RestController
@RequestMapping("/Ms")
public class MsController 
{
	@Autowired
	MsService ms;
	@Autowired
	RestTemplate rt;
	
	@PostMapping(value = "/post")
	public String postAll(@RequestBody List<MarkSheet> l)
	{
		
		
		return ms.postAll(l);
	}
	
	@GetMapping(value = "/getAll")
	public List<MarkSheet> getAll()
	{
		return ms.getAll();
	}
	
	

}
