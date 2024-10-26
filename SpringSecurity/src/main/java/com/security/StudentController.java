package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/getStudent")
	public String getStu()
	{
		return "This is student";
	}
	
	@GetMapping("/getTrainer")
	public String getTrain()
	{
		return "This is Trainer";
	}
	
	@GetMapping("/getManager")
	public String getManger()
	{
		return "This is Manager";
	}

}
