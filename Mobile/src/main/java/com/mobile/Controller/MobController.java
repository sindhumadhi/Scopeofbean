package com.mobile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.Mobile;
import com.mobile.Dao.MobDao;

@RestController
@RequestMapping("/Mobile")
public class MobController {
	
	@Autowired
	MobDao md;
	
	@PostMapping("/post")
	public List<Mobile> post(@RequestBody  List<Mobile> m)
	{
		
		return m;
	}

	
}
