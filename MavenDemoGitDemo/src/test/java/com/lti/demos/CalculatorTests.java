package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c= new Calculator();

	@Disabled
	@Test
	public void testSayHello()
	{
		String msg=c.sayHello();
		Assertions.assertEquals("Hello World",msg );
	}
	
	@Disabled
	@Test
	public void testAddTwoNos()
	{
		int result=c.addNos(100, 200);
		Assertions.assertEquals(300,result);
	}


	@Disabled
	@Test
	public void testSubTwoNos1()
	{
		int result=c.subNos(200, 100);
		Assertions.assertEquals(100,result,"plz check subtraction method code");
	}
	
	@Disabled
	@Test
	public void testAssertNulls()
	{
		String s1=null;
		String s2="Nikhil";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Disabled
	@Test
	public void testAssertFalse()
	{
		Assertions.assertFalse("Sumit".length()==10);
		Assertions.assertFalse(10>20,"10is smaller");
		Assertions.assertNotEquals("Hello", "Hello");
	}
	
	@Test
	public void testArrays()
	{
		ArrayList<Integer> myList=new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
		
	}
	
	
}
