package com.crud;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao ed;
	public String postThis( Employee e)
	{
		return ed.postThis(e);
	}
	
	public List<Employee> getAllEmp()
	{
	
		return ed.getAllEmp();
	}
	
	public String postTheValue(List<Employee> e)
	{
		
		return ed.postTheValue(e);
	}
	
	public List<Employee> getCon()
	{
		List<Employee> e=ed.getAllEmp();
		
		ArrayList<Employee>al=new ArrayList<>();
		Employee max=e.get(0);
		
		 for(int i=0;i<e.size();i++)
		{
			if(e.get(i).getSalary()>max.getSalary())
			{
				
			max=e.get(i);
			al.add(max);
			}
		}
		
		return al;
		
		
	}
	
	public Object getById(int a)
	{
		return ed.getById(a);
	}
	public String delById( int b)
	{
		return ed.delById(b);
	}
}
