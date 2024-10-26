package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Student;

public interface StuRepo extends JpaRepository<Student, Integer>
{

}
