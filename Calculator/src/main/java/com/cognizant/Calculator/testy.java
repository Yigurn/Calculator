package com.cognizant.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class testy {

	@Test
	public void TestOne() {
		
		Addition add = new Addition(10, 2);
		assertEquals("DEM TINGS", 12, add.getResult());
	}
	
}
