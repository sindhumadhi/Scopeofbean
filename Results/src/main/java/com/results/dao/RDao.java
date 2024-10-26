package com.results.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.results.MarkSheet;
import com.results.Results;
import com.results.Student;
import com.results.repo.RRepo;

@Repository
public class RDao {

	@Autowired
	RRepo rr;
	@Autowired
	RestTemplate rt;
	
	public String postTab(List<Results> m)
	{
		rr.saveAll(m);
		return "updated";
	}
	
	public List<Results> getAll()
	{
		return rr.findAll();
	}
	
	public String post(List<Results> l)
	{
		rr.saveAll(l);
		return "All posted successfully";
	}
	}
	

