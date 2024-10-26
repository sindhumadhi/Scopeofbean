package com.crud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositary extends JpaRepository<Employee, Integer>
{

}
