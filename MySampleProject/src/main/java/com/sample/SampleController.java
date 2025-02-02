package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

@GetMapping("/getHello")
public String get()
{
		return "Hello World";
	
}

@GetMapping("/getNum")
public int getnum()
{
	return 12;
}

@GetMapping("/getName/{name}")
public String getName(@PathVariable String name)
{
	return "Hello"+" "+name;
}

@GetMapping("/getAdd/{num1}/{num2}")
public int getAdd(@PathVariable int num1, @PathVariable int num2)
{
	if(num1>num2)
	{
		return num1;
	}
	else
	{
		return num2;
	}
}

@GetMapping("/getMin")
public String getMin(@RequestParam int n1, @RequestParam int n2)
{
	if(n1<n2)
	{
		return n1+" is the lowest";
	}
	else
	{
		return n2+" is the lowest";
		
	}
}


}
