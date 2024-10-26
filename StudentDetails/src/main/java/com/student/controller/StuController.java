package com.student.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Student;
//import com.student.exception.AgeExceptoin;
import com.student.service.StuService;

@RestController
@RequestMapping("/Stu")
public class StuController 
{
	
	@Autowired
	StuService ss;
	
	@PostMapping(value = "/post")
	public String postAll(@RequestBody List<Student> l)throws Exception
	{
	return	ss.postAll(l);

		
	}
	
	
	@GetMapping(value ="/get")
	public List<Student> getAll()
	{
		return ss.getAll();
	}
	
	@DeleteMapping(value = "/del/{a}")
	public void del(@PathVariable int a)
	{
		 ss.del(a);
	}
	
	@GetMapping(value = "/findId/{a}")
	public Student findById(@PathVariable int a)
	{
		return ss.findById(a);
	}
	
	@PutMapping(value ="/put/{a}" )
	public String update(@RequestBody Student s,@PathVariable int a)
	{
	return ss.update(s, a);
	}

}
