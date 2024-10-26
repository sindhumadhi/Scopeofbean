package com.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepositary er;
	public String postThis(Employee e)
	{
		er.save(e);
		return "POSTED SUCCESSFULLY";
	}
	
	public List<Employee> getAllEmp()
	{
	
		return er.findAll();
	}
	
	public String postTheValue(List<Employee> e)
	{
		er.saveAll(e);
		return "saved successfully";
	}

	public List<Employee> getCon()
	{
		return er.findAll();
	}
	public Object getById(int a)
	{
		return er.findById(a).get();
	}
	public String delById( int b)
	{
		er.deleteById(b);
		
		return "deleted";
			
	}
}
