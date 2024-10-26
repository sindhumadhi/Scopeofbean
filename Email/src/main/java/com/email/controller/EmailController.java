package com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.email.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	EmailService es;
	
	@PostMapping("/post")
	public String mail(@RequestParam String to, @RequestParam String subject, @RequestParam String text)
	{
		 es.mail(to, subject, text);
		 return "message sent successfully";
	}
	
	

}
