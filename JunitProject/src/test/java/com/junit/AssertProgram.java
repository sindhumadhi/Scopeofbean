package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;



public class AssertProgram
{
	Calculator c=new Calculator();
	
	@Test
	public void testEquals()
	{
		assertEquals(30, c.add(10, 20));
	}
	

	@Test
	public void testNotEquals()
	{
		assertNotEquals(30, c.mul());
	}
	

	@Test
	public void testNull()
	{
		assertNull(null,null);
	}
	
	@Test
	public void testNotNull()
	{
		assertNotNull("sindhu","sindhu");
	}
	
	@Test
	public void testTrue()
	{
		assertTrue(10==10);
	}

	@Test
	public void testFalse()
	{
		assertFalse(10==0);
	}
	
	@Test
	public void testSame()
	{
		assertSame("sindhu","sindhu");//for strings only
	}
	@Test
	public void testNotSame()
	{
		assertNotSame("sindhu","sinshu");//for strings only
	}
	
	@Test
	public void testArrayEqual()
	{
		int a[]= {1,3,4,9};
		int b[]={1,3,4,9};
		
		assertArrayEquals(b, a);
	}
	
	@Test
	public void testArrayNotEqual()
	{
		int a[]= {1,3,4,9,90};
		int b[]={1,3,4,9};
		
		assertFalse(Arrays.equals(b, a));
	}

	
	

}
