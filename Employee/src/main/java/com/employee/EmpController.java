package com.employee;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("frontEmp")
public class EmpController 
{
	@Autowired
	EmpService es;
	
	@PostMapping("post")
	public String post( @RequestBody Employee l)
	{
		return es.post(l);
	}

	@GetMapping("get")
	public List<Employee> get()
	{
		return es.get();
	}
	@GetMapping("/getbyid/{a}")
	public Employee getById(@PathVariable int a)
	{
		return es.getById(a);
	}
	
	@DeleteMapping("/delete/{a}")
	public Employee deleteById(@PathVariable int a)
	{
	return es.deleteById(a);
	}
	
	@PutMapping("/put/{a}")
	public Employee update(@PathVariable int a, @RequestBody Employee e)
	{
		return es.update(a,e);
	}

	
	

}
