package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c= new Calculator();
	int sum=0;
	
	@BeforeAll //only once before all the test case
	public static void testDtartDbComm()
	{
		System.out.println("DB connection is up only once");
	}
	
	@BeforeEach //before each testcase
	public void testStartup()
	{
		int sum=0;
		System.out.println("sum is zero "+sum);
	}
	
	@Test
	public void testAddTwoNos()
	{
		System.out.println("tets case 1");
		int result=c.addNos(100, 200);
		Assertions.assertEquals(300,result);
	}


	@Test
	public void testSubTwoNos1()
	{
		System.out.println("tets case 2");
		int result=c.subNos(200, 100);
		Assertions.assertEquals(100,result,"plz check subtraction method code");
	}
	
	@AfterEach
	public void testShutDown()
	{
		System.out.println("some object null");
	}
	@AfterAll //only once
	public static void testShutDownConn()
	{
		System.out.println("shut down db connection");
	}
	
}
