package com.bwardweb.tdd.collatz.converter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bwardweb.tdd.collatz.converter.CharacterConverter;
import com.bwardweb.tdd.collatz.converter.CollatzCharacterConverter;

public class CollatzCharacterConverterTest {
	CharacterConverter objectUnderTest; 
	
	@Before
	public void setup(){
		objectUnderTest = new CollatzCharacterConverter();
	}
	
	@Test(expected=NullPointerException.class)
	public void convertCharacter_nullInput(){
		String testString = null;		
		objectUnderTest.convertCharacter(testString);
	}
	
	@Test
	public void convertCharacter_noMatchReturnsEmpty(){
		String testString = "z";		
		assertTrue("String returned should be empty",objectUnderTest.convertCharacter(testString).length() == 0);
	}
	
	@Test
	public void convertCharacter_notEmpty(){
		String testString = "a";		
		assertTrue("String returned should not be empty",objectUnderTest.convertCharacter(testString).length() > 0);
	}
	
	@Test
	public void convertCharacter_aInput(){
		String testString = "a";
		assertEquals("bc",objectUnderTest.convertCharacter(testString));
	}
	
	@Test
	public void convertCharacter_bInput(){
		String testString = "b";		
		assertEquals("a",objectUnderTest.convertCharacter(testString));
	}
	
	@Test
	public void convertCharacter_cInput(){
		String testString = "c";		
		assertEquals("aaa",objectUnderTest.convertCharacter(testString));
	}
}
