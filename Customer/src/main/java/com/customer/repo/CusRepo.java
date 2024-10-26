package com.customer.repo;




import org.springframework.data.jpa.repository.JpaRepository;


import com.customer.Customer;

public interface CusRepo extends JpaRepository<Customer, Integer>

{
	
}
