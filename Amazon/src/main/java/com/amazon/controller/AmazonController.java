package com.amazon.controller;

import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.Amazon;
import com.amazon.exception.IdNotFoundException;
import com.amazon.exception.LengthOutOfBoundException;
import com.amazon.exception.LowPriceException;
import com.amazon.exception.ProductNotFoundException;
import com.amazon.exception.QuantityException;
import com.amazon.exception.StatusException;
import com.amazon.service.AmazonService;



@RestController
@RequestMapping("/Amazon")
public class AmazonController {
	@Autowired
	AmazonService as;
	
	@PostMapping(value = "/postVal")
	public String postValues(@RequestBody List<Amazon> a)
	{
		return as.postValues(a);
	}
	
	@GetMapping(value ="/getall")
	public List<Amazon> getAll()
	{
		return as.getAll();
	}
	
	@GetMapping(value = "/getPro/{p}")
	public List<Amazon> getByProduct(@PathVariable String p)throws ProductNotFoundException
	{
		return as.getByProduct(p);
	}
	
	@PostMapping("/postP") 
	public String postPrice(@RequestBody Amazon a) throws LowPriceException
	{
		return as.postPrice(a);
	}
	
	@PostMapping("/postN") 
	public String postName(@RequestBody Amazon a) throws LengthOutOfBoundException
	{
		return as.postName(a);
	}
	
	@GetMapping("/getId/{a}")
	public Amazon getById(@PathVariable  int  a) throws Exception
	{
		return as.getById(a);
	}
	
	@GetMapping("/getPrice/{a}")
	public List<Integer> getPrice(@PathVariable   int a) throws Exception
	{
	
	return as.getPrice(a);
	}
	
	@GetMapping("/getQuan/{a}")
	public List<Amazon> getByQuantity(@PathVariable int a) throws QuantityException
	{
		return as.getByQuantity(a);
	}
	
	@GetMapping("/getbaseId/{a}")
	public Amazon getBasedOnId(@PathVariable  int a) throws IdNotFoundException
	{
		
		
			return as.getBasedOnId(a);
		
	}
	
	@GetMapping("/getStatus/{s}")
	public List<Amazon> getByStatus(@PathVariable String s) throws StatusException
	{
		return as.getByStatus(s);
		
	}

}
