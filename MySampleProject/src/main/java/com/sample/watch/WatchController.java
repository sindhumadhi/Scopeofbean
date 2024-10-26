package com.sample.watch;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Watch")
public class WatchController 
{

@GetMapping(value="/getWatch")
public Watch getWatch(@RequestBody Watch w)
{
		return w;
}
	
@GetMapping(value="/getWatches")
public List<Watch> getWatches(@RequestBody List<Watch> w)
{
	return w;
}

@GetMapping(value = "/getBrand")
public List<String> getName(@RequestBody List<Watch> w)
{
	
		List<String>l=w.stream().map(x->x.getBrand()).filter(x->x.startsWith("L")).collect(Collectors.toList());
	
	return l;
	
}

@GetMapping(value = "/getMP")
public String getMatPrice(@RequestBody List<Watch> w)
{
	
  Watch max=w.get(0);
	for(int i=0;i<w.size();i++)
	{
		if(w.get(i).getBrand().length()>max.getBrand().length())
		{
			max=w.get(i);
		}
	}
	return max.getPrice()+" "+max.getMaterial();
	
	
//	Map<Integer,String> l=w.stream().max().collect(Collectors.toMap(x->x.getPrice(),y->y.getMaterial()));
	

    
	
	}
	
}


