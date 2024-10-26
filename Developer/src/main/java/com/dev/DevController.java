package com.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController
{
	@Autowired
	DevService ds;
	
	@GetMapping("/get")
	public String getDev()
	{
		return ds.getDev();
	}

}
