package com.jarsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jcontroller 
{
	@GetMapping("/get/{a}")
	public String getThis(@PathVariable String a)
	{
		return a;
	}

}
