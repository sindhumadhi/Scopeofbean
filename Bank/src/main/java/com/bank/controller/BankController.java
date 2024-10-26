package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Bank;
import com.bank.service.BankService;

@RestController
@RequestMapping(value = "/Bank")
public class BankController 
{
	
	@Autowired
	BankService bs;
	
	@PostMapping(value = "/postAll")
	public String PostAll(@RequestBody List<Bank> l)
	{
		
		 return bs.PostAll(l);
	}
	
	@GetMapping(value = "/getBranch/{a}")
	public String getBranch(@PathVariable  String a)
	{
		return bs.getBranch(a);
	}
	

}
