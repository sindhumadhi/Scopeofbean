package com.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderentity")
public class OrderEntityController 
{
	
@Autowired
OrderEntityService os;

@PostMapping("/post")
public String postOne(@RequestBody OrderEntity e)
{
	return os.postOne(e);
}

@GetMapping("/get")
public List<Object> getPin()
{
	return os.getPin();
}

}
