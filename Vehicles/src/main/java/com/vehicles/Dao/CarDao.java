package com.vehicles.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.vehicles.Car;
import com.vehicles.carrepo.CarRepositary;

@Repository
public class CarDao {

	@Autowired
	CarRepositary cr;
	public String postsing( Car c)
	{
		cr.save(c);
		return  "saved";
	}
	
	public String postValues(List<Car> c)
	{
		cr.saveAll(c);
		return "saved successfully";
	}
	public List<Car> getAll()
	{
		return cr.findAll();
	}
	public String updateThis( int id, Car c)
	{
		Car x=cr.findById(id).get();
		
		x.setBrand(c.getBrand());
		x.setModel(c.getModel());
		x.setColor(c.getColor());
		x.setPrice(c.getPrice());
		cr.save(x);
		return "updated";
	}
	
	
}