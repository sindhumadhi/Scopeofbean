package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Bank;
import com.bank.dao.BankDao;

@Service
public class BankService {

	@Autowired
	BankDao bd;
	
	public String PostAll(List<Bank> l)
	{
		
		 return bd.PostAll(l);
	}
	
	public String getBranch(String a)
	{
		return bd.getBranch(a);
	}
	
}
