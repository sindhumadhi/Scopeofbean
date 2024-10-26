package com.vehicles.carservice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.engine.jdbc.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.vehicles.Car;
import com.vehicles.Dao.CarDao;

@Service
public class CarService
{

	@Autowired
	CarDao cd;
	
	public String postsing( Car c)
	{
		return cd.postsing(c);
	}
	
	public String postValues(List<Car> c)
	{
		
		return cd.postValues(c);
	}
	public List<Car> getAll()
	{
		return cd.getAll();
	}
	
	public String updateThis( int id, Car c)
	{
		return cd.updateThis(id,c);
	}
	public List<Car> getByBrand( String s)
	{
		List<Car> c=cd.getAll();
		List<Car> l=c.stream().filter(x->x.getBrand().equals(s)).collect(Collectors.toList());
		 
		return l;
		
	}
	public Stream<Car> getCdetails()
	{
		List<Car>c=cd.getAll();
		Stream<Car> l= c.stream().sorted(Comparator.comparingInt(Car::getPrice).reversed()).limit(2).skip(1);
		return l;
	
	}
	
	public List<String> getdescBrand()
	{
		List<Car>c=cd.getAll();
		List<String> l= c.stream().map(x->x.getBrand()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		return l;
		
	}
	
	public Map<String, Integer> getbwPrice( int n1, int n2)
	{
		
		List<Car>c=cd.getAll();
		Map<String, Integer> m=c.stream().filter(x->x.getPrice()>n1 && x.getPrice()<n2).collect(Collectors.toMap(x->x.getBrand(), y->y.getPrice()));
		return m;
		
	}
	public List<Character> getlastChar()
	{
		List<Car>c=cd.getAll();
	return	c.stream().map(x->x.getColor().charAt(x.getColor().length()-1)).collect(Collectors.toList());
	}
	
	public List<Car> getlastThree()
	{
		List<Car>c=cd.getAll();
		
		List<Car> li=c.stream().skip(c.size()-3).collect(Collectors.toList());
		return li;
	}

}
