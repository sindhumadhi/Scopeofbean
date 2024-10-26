package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmpService {
	
	@Autowired
	EmpDao ed;
	
	public String post(Employee l)
	{
		return ed.post(l);
	}

	public List<Employee> get()
	{
		 return  ed.get();
		
	}
	public Employee getById( int a)
	{
		return ed.getById(a);
	}
	public Employee deleteById(int a)
	{
	return ed.deleteById(a);
	}
	
	public Employee update( int a,  Employee e)
	{
		return ed.update(a,e);
	}
}
