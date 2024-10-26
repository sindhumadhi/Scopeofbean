package com.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.Customer;
import com.customer.repo.CusRepo;

@Repository
public class CusDao 
{

	@Autowired
	CusRepo cr;
	
	public String postAll(List<Customer> l)
	{
		cr.saveAll(l);
		return "Posted";
	}
	
	public List<Customer> getAll()
	{
		return cr.findAll();
	}
	
	public String postAllIncludeBranch(List<Customer> l)
	{
		 cr.saveAll(l);
		 return "posted";
				
	}
}
