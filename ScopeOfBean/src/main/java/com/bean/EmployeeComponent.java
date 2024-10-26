package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class EmployeeComponent {
	
	private String name;
	
	@Value("xxx")
	
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	
	public EmployeeComponent() 
	{
		System.out.println("BEAN IS CREATED");
	}
	
	public String toString()
	{
		return name;
	}
	
	

}
