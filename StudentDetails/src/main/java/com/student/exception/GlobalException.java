package com.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalException
{
	@ExceptionHandler(AgeExceptoin.class)
	public ResponseEntity<String> re(AgeExceptoin ae)
	{
		return new ResponseEntity<>("EXCEPTION HANDLED : AGE MUST BE GREATER THAN 18",HttpStatus.BAD_REQUEST);
	}
	

}
