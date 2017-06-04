package com.bwardweb.tdd.collatz.algorithm;

import static org.junit.Assert.*;

import java.util.Deque;

import org.junit.Before;
import org.junit.Test;

import com.bwardweb.tdd.collatz.algorithms.CollatzTagAlgorithm;
import com.bwardweb.tdd.collatz.converter.CharacterConverter;
import com.bwardweb.tdd.collatz.converter.CollatzCharacterConverter;
import com.bwardweb.tdd.collatz.processors.DequeProcessor;

public class CollatzTagAlgorithmTest {
	private CollatzTagAlgorithm objectUnderTest;
	private DequeProcessor processor;
	private CharacterConverter converter;
	
	@Before
	public void setup(){
		processor = new DequeProcessor();
		converter = new CollatzCharacterConverter();
		objectUnderTest = new CollatzTagAlgorithm(converter,processor);
	}
	
	@Test
	public void performIteration_notNull(){
		String testStart = "aaa";
		Deque<String> startDeque = processor.convertStringToDeque(testStart);
				
		assertNotNull(objectUnderTest.performIteration(startDeque));
	}
	
	@Test
	public void performIteration_aHeadSize(){
		String testStart = "abc";
		Deque<String> startDeque = processor.convertStringToDeque(testStart);
		int expectedSize = testStart.length() + converter.convertCharacter("a").length() - 2;
			
		assertEquals(expectedSize,objectUnderTest.performIteration(startDeque).size());
	}
	
	@Test
	public void performIteration_bHeadSize(){
		String testStart = "bbc";
		Deque<String> startDeque = processor.convertStringToDeque(testStart);
		int expectedSize = testStart.length() + converter.convertCharacter("b").length() - 2;
			
		assertEquals(expectedSize,objectUnderTest.performIteration(startDeque).size());
	}
	
	@Test
	public void performIteration_cHeadSize(){
		String testStart = "cbc";
		Deque<String> startDeque = processor.convertStringToDeque(testStart);
		int expectedSize = testStart.length() + converter.convertCharacter("c").length() - 2;
			
		assertEquals(expectedSize,objectUnderTest.performIteration(startDeque).size());
	}
	
}
