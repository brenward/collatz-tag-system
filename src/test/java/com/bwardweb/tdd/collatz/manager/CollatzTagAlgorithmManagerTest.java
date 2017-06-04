package com.bwardweb.tdd.collatz.manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CollatzTagAlgorithmManagerTest {
	TagAlgorithmManager objectUnderTest;
	
	@Before
	public void setup(){
		objectUnderTest = new CollatzTagAlgorithmManager();
	}
	
	@Test
	public void runAlgorithm_notNull(){
		String startString = "abc";
		int lowerLimit = 2;
		assertNotNull(objectUnderTest.runAlgorithm(lowerLimit, startString));
	}
	
	@Test
	public void runAlgorithm_notEmpty(){
		String startString = "abc";
		int lowerLimit = 2;
		assertTrue(objectUnderTest.runAlgorithm(lowerLimit, startString).length() > 0);
	}
	
	@Test
	public void runAlgorithm_lessThanLowerLimit(){
		String startString = "abc";
		int lowerLimit = 2;
		assertTrue(objectUnderTest.runAlgorithm(lowerLimit, startString).length() < lowerLimit);
	}
}
