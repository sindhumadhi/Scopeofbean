package com.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> 
{
	@Query(value = " select branch from banktable where ifsc=?",nativeQuery = true)
	public String getBranch(String a);

}
