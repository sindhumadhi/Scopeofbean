package com.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderEntityDao
{
	@Autowired
	OrderEntityRepo or;
	
	public String postOne(OrderEntity e)
	{
		or.save(e);
		return "posted";
	}
	public List<Object> getPin()
	{
		return or.getPin();
	}

}
