package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {
	
//dev wites exceptions- junit checks whether those exceptions are handled or not
	@Test
	void testExceptions() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
		()->{Integer.parseInt("One");}
	 );
		
	}
	@Test
	public void testmethodExp()
	{
		Calculator c=new Calculator();
		
		final Exception e=assertThrows(ArithmeticException.class,
				()->{c.searchEmp(0);});
		
		Assertions.assertEquals("u entered zero",e.getMessage());
	}

}
