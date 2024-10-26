package com.amazon.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.Amazon;
import com.amazon.repo.AmazonRepo;


@Repository
public class AmazonDao 
{
@Autowired
AmazonRepo ar;

public String postValues( List<Amazon> a)
{
	 ar.saveAll(a);
	 return "Fully posted ";
}
public List<Amazon> getAll()
{
	return ar.findAll();
}

public List<Amazon> getByProduct(String p)
{
	return ar.getByProduct(p);
}

public String postPrice( Amazon a)
{
	 ar.save(a);
	 return "saved";
}

public String postName( Amazon a)
{
	ar.save(a);
	return "saved by checking name condition";
}

public Amazon getById( int a)
{
	return ar.findById(a).get();
} 

public List<Amazon> getByQuantity(int a)
{
	return ar.getByQuantity(a);
}

public Amazon getBasedOnId(int a)
{
	return ar.getBasedOnId(a);
}
public List<Amazon> getByStatus(String s)
{
	return ar.getByStatus(s);
}




   
}
