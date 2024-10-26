package com.marksheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.marksheet.MarkSheet;
import com.marksheet.dao.MsDao;

@Service
public class MsService {

	@Autowired
	MsDao md;
	@Autowired
	RestTemplate rt;
	
	public String postAll(List<MarkSheet> l)
	{
		List<MarkSheet> x=l;
		for(int i=0;i<x.size();i++)
		{
			x.get(i).setSem1Tot(x.get(i).getSem1T()+x.get(i).getSem1P());
			x.get(i).setSem2Tot(x.get(i).getSem2T()+x.get(i).getSem2P());
			
		}
		
		return md.postAll(l);
		
	}
	
	public List<MarkSheet> getAll()
	{
		return md.getAll();
	}
	
	
}

