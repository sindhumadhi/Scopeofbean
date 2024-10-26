package com.docker;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DController {
	
	@GetMapping("/getDoc")
	public String getThis()
	{
		return "Docker";
	}

}
