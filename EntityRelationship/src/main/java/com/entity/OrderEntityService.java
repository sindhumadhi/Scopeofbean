package com.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderEntityService
{

	@Autowired
	OrderEntityDao od;
	
	public String postOne(OrderEntity e)
	{
		
		return od.postOne(e);
	}
	
	public List<Object> getPin()
	{
		return od.getPin();
	}
}
