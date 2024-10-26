package com.student.service;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.student.Student;
import com.student.dao.StuDao;
import com.student.exception.AgeExceptoin;

@Service
public class StuService {

	@Autowired
	StuDao sd;
	
	public String postAll(List<Student> l) throws Exception
	{
		
		List<Student> a=l;
		ArrayList<Student> al=new ArrayList<>();
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).getAge()>18)
			{
				al.add(a.get(i));
			}	
			else
			{
				throw new AgeExceptoin("age lesser thean 18");
				
			}
		}
		
		return sd.postAll(al);
	}
	
	public List<Student> getAll()
	{
		return sd.getAll();
	}
	public void del(int a)
	{
		 sd.del(a);
	}
	
	public Student findById(int a)
	{
		return sd.findById(a);
	}

	public String update(Student s,int a)
	{
	return sd.update(s, a);
	}
	

}
