package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.Student;

public interface StuRepo extends JpaRepository<Student, Integer>


{
//	@Query
	//public String Up(int a);
	

}
