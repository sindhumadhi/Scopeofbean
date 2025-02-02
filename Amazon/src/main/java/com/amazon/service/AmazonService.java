package com.amazon.service;

import java.util.ArrayList;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.amazon.Amazon;

import com.amazon.dao.AmazonDao;
import com.amazon.exception.IdNotFoundException;
import com.amazon.exception.LowPriceException;
import com.amazon.exception.ProductNotFoundException;
import com.amazon.exception.QuantityException;
import com.amazon.exception.StatusException;

@Service
public class AmazonService {

	@Autowired
	AmazonDao ad;
	
	public String postValues( List<Amazon> a)
	{
		return ad.postValues(a);
	}

	public List<Amazon> getAll()
	{
		return ad.getAll();
	}
	public List<Amazon> getByProduct(String p) throws ProductNotFoundException 
	{
        List<Amazon> l=ad.getByProduct(p);
        if(l.isEmpty())
        {
        	throw new ProductNotFoundException("product is not present");
        }
        else
        {
        	return ad.getByProduct(p);
        }
    }
	
	public String postPrice( Amazon a)throws LowPriceException
	{
		if(a.getPrice()>10000)
		{
		return ad.postPrice(a);
		}
		else
		{
			
			
			throw new LowPriceException("Price less than 10000");
		}
	}
       
        
	public String postName( Amazon a) throws com.amazon.exception.LengthOutOfBoundException
	{
		if(a.getCusName().length()<=3)
		{
			return ad.postName(a);
		}
		else
		{
			throw new com.amazon.exception.LengthOutOfBoundException("LENGTH GREATER THAN 3");
		}      
	}
    	   
	public Amazon getById( int a) throws Exception
	 {
	 	Amazon am= ad.getById(a);
	 	if(am.getId()<0)
	 	{
	 		throw new NoSuchElementException("no element");
	 	}
	 	else
	 	{
	 		return am;
	 	}
	 	
	 }
	 	
	public List<Integer> getPrice(int a) throws Exception
	{
		List<Amazon> l=ad.getAll();
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<l.size();i++)
		{
			int b=l.get(i).getPrice()/a;
			
				al.add(b);
			
				
		}
		return al;
	}
	
	public List<Amazon> getByQuantity(int a) throws QuantityException
	{
		List<Amazon> l=ad.getByQuantity(a);
		
		if(l.isEmpty())
		{
			throw new QuantityException("quantity is not found");
		}
		else
		{
			return ad.getByQuantity(a);
		}
	}
	public Amazon getBasedOnId(int a) throws IdNotFoundException
	{
		Amazon z=ad.getBasedOnId(a);
		if(z==null)
		{
			throw new IdNotFoundException("id is not available");
		}
		else
		{
			return ad.getBasedOnId(a);
		}
	}

	public List<Amazon> getByStatus(String s) throws StatusException
	{
		List<Amazon>l=ad.getByStatus(s);
		if(l.isEmpty())
		{
			throw new StatusException("Status not found");
		}
		else
		{
			return ad.getByStatus(s);
		}
	}

	
	
	
	
	
	
	
	
	
}
		
		 
		
		
		
	


