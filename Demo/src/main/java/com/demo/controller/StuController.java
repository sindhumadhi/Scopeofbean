package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student;
import com.demo.repo.StuRepo;

@RestController
public class StuController 
{
 @Autowired
 StuRepo sr;
 
 @PostMapping("/post")
 public String post(@RequestBody List<Student>l)
 {
	 sr.saveAll(l);
	 return "posted";
	 }
 
 @PutMapping("/put/{a}")
 public String put(@PathVariable int a, @RequestBody Student s ) 
 {
    Student x=sr.findById(a).get();
    x.setName(s.getName());
    x.setAge(s.getAge());
    x.setGender(s.getGender());
    
    sr.save(x);
    return "updated";
 
 }
 
 @PatchMapping("/patch/{a}")
 public String patch(@PathVariable int a,@RequestBody Student s)
 {
	 Student x=sr.findById(a).get();
	 x.setName(s.getName());
	 sr.save(x);
	 return "field updated";
 }
 

}
