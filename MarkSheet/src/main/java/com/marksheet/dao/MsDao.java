package com.marksheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marksheet.MarkSheet;
import com.marksheet.repo.MsRepo;

@Repository
public class MsDao
{
	@Autowired
	MsRepo mr;
	
	public String postAll(List<MarkSheet> l)
	{
		mr.saveAll(l);
		return "posted";
	}
	
	public List<MarkSheet> getAll()
	{
		return mr.findAll();
	}
	

}
