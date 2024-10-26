package com.results.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.results.MarkSheet;
import com.results.Results;
import com.results.Student;
import com.results.service.RService;

@RestController
@RequestMapping("/res")
public class RController 
{
	@Autowired
	RService rs;
	
	@Autowired
	RestTemplate rt;
	
	@PostMapping(value = "/up")
	public String postTab(@ RequestBody List<Results> l)
	{
		
		String url1="http://localhost:8081/Ms/getAll";
	    
		
		//String url2="http://localhost:8080/Stu/get";
		ResponseEntity< List<MarkSheet>> re1=rt.exchange(url1,HttpMethod.GET, null,new ParameterizedTypeReference <List<MarkSheet>>() {});
		List<MarkSheet> lm=re1.getBody();
		
		
		
		
		//List<Results> l=rs.getAll();
		
		for(int i=0;i<l.size();i++)
			
		{
			
		//	 ResponseEntity< List<Student>> re2=rt.exchange(url1,HttpMethod.GET, null,new ParameterizedTypeReference <List<Student>>() {});
			//	List<Student> ls=re2.getBody();
			
			
			if(l.get(i).getName().equals(lm.get(i).getName()))
			{
				//l.get(i).setName(ls.get(i).getName());
				l.get(i).setRollNo(lm.get(i).getRollNo());
				l.get(i).setTotal(lm.get(i).getSem1Tot()+lm.get(i).getSem2Tot());
				
				l.get(i).setPer(((lm.get(i).getSem1Tot()+lm.get(i).getSem2Tot())*100)/200);
				
				
				
			}
			
		
		}
		return rs.postTab(l);
		
		
		
		
	}
	
	@GetMapping(value = "/getAll")
	public List<Results> getAll()
	{
		return rs.getAll();
	}
	@PostMapping(value = "/post")
	public String post(@RequestBody List<Results> l)
	{
		return rs.post(l);
	}
	
	
	
		
		
		
	}
	
	
	
	
	
	


