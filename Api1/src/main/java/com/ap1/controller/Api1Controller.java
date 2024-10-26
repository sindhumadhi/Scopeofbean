package com.ap1.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Api1Controller 
{

	@GetMapping(value = "/get")
	public String get()
	{
		return "sindhu";
	}
	
	@GetMapping(value = "/getPrice")
	public Integer getInt()
	{
		Integer price=10000;
		return price;
	}
}
