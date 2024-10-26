package com.amazon.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.amazon.Amazon;

public interface AmazonRepo extends JpaRepository<Amazon,Integer >
{
	@Query(value = "select * from amazon where product= ?",nativeQuery = true)
	public List<Amazon> getByProduct(String p);
	
	@Query(value = "select * from amazon where quantity= ?",nativeQuery = true)
	public List<Amazon> getByQuantity(int a);
	
	
	@Query(value = "select * from amazon where id=?",nativeQuery = true)
	public Amazon getBasedOnId(int a); 
	
	@Query(value = "select * from amazon where status =?",nativeQuery = true)
	public List<Amazon> getByStatus(String s);
	
}

