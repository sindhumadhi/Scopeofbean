package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.Student;
import com.student.repo.StuRepo;

@Repository
public class StuDao {

	@Autowired
	StuRepo sr;
	
	public String postAll(List<Student> l)
	{
		sr.saveAll(l);
		
		return "POSTED";
		
	}
	
	public List<Student> getAll()
	{
		return sr.findAll();
	}
	public void del(int a)
	{
		sr.deleteById(a);
	}
	
	public Student findById(int a)
	{
		
		return sr.findById(a).get();
		
	}
	
	public String update(Student s,int a)
	{
		Student x= sr.findById(a).get();
		
		x.setName(s.getName());
		x.setRollNo(s.getRollNo());
		x.setGender(s.getGender());
		x.setAge(s.getAge());
		x.setCourse(s.getCourse());
		x.setAttendence(s.getAttendence());
		
		sr.save(x);
		return "UPDATED";
		
	}
	
}
