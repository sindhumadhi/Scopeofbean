package com.results.service;

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
import com.results.dao.RDao;


@Repository
public class RService {

	@Autowired
	RDao rd;
	@Autowired
	RestTemplate rt;
	
	public String postTab(List<Results> m)
	{
		
		return rd.postTab(m);
		
	}
	

public List<Results> getAll()
{
	return rd.getAll();
}
public String post(List<Results> l)
{
	return rd.post(l);
}
}

	

