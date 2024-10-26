package com.amazon.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException 
{
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> re(ProductNotFoundException pe)
	{
		return new ResponseEntity<>("product is not present try someother",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(QuantityException.class)
	public ResponseEntity<String> re(QuantityException q)
	{
		return new ResponseEntity<>("Quantity exception handled-give valid quantity",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> re(IdNotFoundException ie)
	{
		return new ResponseEntity<>("Exception handled-try some other which is present in db",HttpStatus.BAD_REQUEST);
	}
	
	
	

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> re(NoSuchElementException nf)
	{
		return new ResponseEntity<>("Exception handled-try id greater than 0",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> re(ArithmeticException ae)
	{
		return new ResponseEntity<>("cannot divide by 0 give something else",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(StatusException.class)
	public ResponseEntity<String> re(StatusException se)
	{
		return new ResponseEntity<>("exception handled-item is shipping",HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	
	
	
	
	

}
