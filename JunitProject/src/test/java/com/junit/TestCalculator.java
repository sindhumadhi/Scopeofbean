package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator
{
	
	Calculator c=new  Calculator();
	
	@Before
	public void bef()
	{
		System.out.println("WELCOME");
	}
	
	
		@Test
		public void testAdd()
		{
			System.out.println(c.add(12, 12));
			
		}
		@Test
		public void testSub()
		{
			c.sub(12, 2);
		}
		
		@Test
		public void testMul()
		{
			System.out.println(c.mul());
		}
		
		@Test
		public void testDiv()
		{
			c.div();
		}
		
		
		@After
		public void aft()
		{
			System.out.println("End");
		}
		

		
	

}
