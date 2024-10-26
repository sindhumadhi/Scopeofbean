package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnoController 
{
	@Value("${envi}")
	String name;
	
	@GetMapping("/get")
	public String getThis()
	{
		return name;
	}

}
