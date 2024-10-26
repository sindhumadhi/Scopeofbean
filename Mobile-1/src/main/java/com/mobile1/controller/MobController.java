package com.mobile1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile1.Mobile;
import com.mobile1.repo.MobRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/Mob")
public class MobController
{

	@Autowired
	MobRepo mr;
	
	@PostMapping("/post")
	public List<Mobile> post(@RequestBody List<Mobile> m)
	{
		mr.saveAll(m);
		return m;
	}
	
	@GetMapping("/get")
	public List<Mobile> get()
	{
		return mr.findAll();
	}
	@PutMapping("/put/{a}")
	public Mobile put(@RequestBody Mobile m ,@PathVariable int a)
	{
	
		Mobile x=mr.findById(a).get();
		x.setBrand(m.getBrand());
		x.setColor(m.getColor());
		x.setPrice(m.getPrice());
		x.setRam(m.getRam());
		mr.save(x);
		return x;
		
	}
	
	
}
