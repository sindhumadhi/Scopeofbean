package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/get")
	public String getTest() {
		return "I'm a test engineer ...i can easily test microservice applications";
		
	}

}
