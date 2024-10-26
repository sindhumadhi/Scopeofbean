package com.crud;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Employee")
public class EmployeeController
{
	@Autowired
	EmployeeService es;
	
	@PostMapping(value = "/PostEmp")
	public String postThis(@RequestBody Employee e)
	{
		return es.postThis(e);
	}
	
	@GetMapping(value="/getAll")
	public List<Employee> getAllEmp()
	{
	
		return es.getAllEmp();
	}
	
	@PostMapping(value = "/PostTwo")
	public String postTheValue(@RequestBody List<Employee> e)
	{
		return es.postTheValue(e);
	}
	
	@GetMapping(value="/getCon")
	public List<Employee> getCon()
	{
	
		return es.getAllEmp();
	}
	@GetMapping("/getById/{a}")
	public Object getById(@PathVariable int a)
	{
		return es.getById(a);
	}
	
	@GetMapping("/DelById/{b}")
	public String delById(@PathVariable int b)
	{
		return es.delById(b);
	}
	
	

}
