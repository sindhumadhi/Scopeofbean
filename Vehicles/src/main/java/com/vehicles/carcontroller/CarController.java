package com.vehicles.carcontroller;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vehicles.Car;
import com.vehicles.carservice.CarService;


@RestController
@RequestMapping("/Car")
public class CarController
{
	@Autowired
	CarService cs;
	
	@PostMapping(value = "/sing")
	public String postsing(@RequestBody Car c)
	{
		return cs.postsing(c);
	}
	
	@PostMapping(value = "/postVal")
	public String postValues(@RequestBody List<Car> c)
	{
		return cs.postValues(c);
	}
	
	@GetMapping(value ="/getall")
	public List<Car> getAll()
	{
		return cs.getAll();
	}
	
	@PutMapping(value="/update/{id}")
	public String updateThis(@PathVariable int id, @RequestBody Car c)
	{
		return cs.updateThis(id,c);
	}
	
	@GetMapping(value="/getBrand/{s}")
	public List<Car> getByBrand(@PathVariable String s)
	{
		return cs.getByBrand(s);
	}
	
	@GetMapping(value = "/max")
	public java.util.stream.Stream<Car> getCdetails()
	{
		return cs.getCdetails();
	}
	
	@GetMapping(value = "/descBrand")
	public List<String> getdescBrand()
	{
		return cs.getdescBrand();
	}
	
	@GetMapping(value = "/price/{n1}/{n2}")
	public Map<String, Integer> getbwPrice (@PathVariable int n1, @PathVariable int n2)
	{
		return cs.getbwPrice(n1,n2);
	}
	
	@GetMapping(value ="/charcolor")
	public List<Character> getlastChar()
	{
		return cs.getlastChar();
	}
	
	@GetMapping(value = "/lastThree")
	public List<Car> getlastThree()
	{
		return cs.getlastThree();
	}
	

}
