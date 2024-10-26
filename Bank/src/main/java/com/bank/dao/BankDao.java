package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.Bank;
import com.bank.repo.BankRepo;

@Repository
public class BankDao 
{

	@Autowired
	BankRepo br;
	
	public String PostAll(List<Bank> l)
	{
		 br.saveAll(l);
		 return "posted successfully";
	}
	public String getBranch(String a)
	{
		return br.getBranch(a);
	}
}
