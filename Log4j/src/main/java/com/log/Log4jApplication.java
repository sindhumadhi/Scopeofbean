package com.log;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Log4jApplication 
{
	static Logger log=Logger.getLogger("Log4jApplication.class");
	

	public static void main(String[] args)
	{
		SpringApplication.run(Log4jApplication.class, args);
		
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");//file name....
		log.info("INFORMATION");
		log.warn("WARNING");
		log.error("ERROR");
		log.debug("DEBUGGING");
		log.fatal("FATAL");
	
		
	}

}
