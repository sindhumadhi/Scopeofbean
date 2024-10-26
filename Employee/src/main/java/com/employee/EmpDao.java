package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class EmpDao 
{
	@Autowired
	EmpRepo er;
	
	
	public String post(Employee l)
	{
		er.save(l);
		return "POSTED SUCCESSFULLY";
	}

	public List<Employee> get()
	{
		 return  er.findAll();
		
	}
	public Employee getById( int a)
	{
		return er.findById(a).get();
	}
	
	public Employee deleteById(int a)
	{
		
		Employee x=er.findById(a).get();
		er.deleteById(x.getId());
		return x;
		
	}
	
	public Employee update( int a,  Employee e)
	{
		
		
		return er.save(e);
		
		
	}
	
}
