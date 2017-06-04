package com.bwardweb.tdd.collatz.processors;

import static org.junit.Assert.*;

import java.util.Deque;

import org.junit.Before;
import org.junit.Test;

import com.bwardweb.tdd.collatz.processors.InputProcessor;

public class InputProcessorTest {
	InputProcessor objectUnderTest;
	
	@Before
	public void setup(){
		objectUnderTest = new InputProcessor();
	}
	
	@Test
	public void convertStringToDeque_notNull(){
		String testInput = "";
		assertNotNull(objectUnderTest.convertStringToDeque(testInput));
	}
	
	@Test
	public void convertStringToDeque_isEmptyAsEmptyInput(){
		String testInput = "";
		assertTrue("Deque should be empty", objectUnderTest.convertStringToDeque(testInput).size() == 0);
	}
	
	@Test
	public void convertStringToDeque_isEmptyAsNullInput(){
		String testInput = null;
		assertTrue("Deque should be empty", objectUnderTest.convertStringToDeque(testInput).size() == 0);
	}
	
	@Test
	public void convertStringToDeque_notEmpty(){
		String testInput = "aaa";
		assertTrue("Deque should be populated", objectUnderTest.convertStringToDeque(testInput).size() > 0);
	}
	
	@Test
	public void convertStringToDeque_dequeAsLongAsInput(){
		String testInput = "aaa";
		assertTrue("Deque length should be equal to input length", objectUnderTest.convertStringToDeque(testInput).size() == testInput.length());
	}
	
	@Test
	public void convertStringToDeque_dequeContainsSameValueAsInput(){
		String testInput = "abc";
		Deque<String> processedInput = objectUnderTest.convertStringToDeque(testInput);
		String testOutput = "";
		for(String element:processedInput){
			testOutput += element;
		}
		assertTrue("Deque contents should match the String", testOutput.equals(testInput));
	}
	
	@Test
	public void addStringToDeque_notNull(){
		String stringToAdd = "";
		String testInput = "abc";
		Deque<String> processedInput = objectUnderTest.convertStringToDeque(testInput);
		assertNotNull(objectUnderTest.addStringToDeque(processedInput,stringToAdd));
	}
	
	@Test
	public void addStringToDeque_notEmpty(){
		String stringToAdd = "";
		String testInput = "abc";
		Deque<String> processedInput = objectUnderTest.convertStringToDeque(testInput);
		assertTrue(objectUnderTest.addStringToDeque(processedInput,stringToAdd).size() > 0);
	}
	
	@Test
	public void addStringToDeque_notSameSizeAsOriginal(){
		String stringToAdd = "a";
		String testInput = "abc";
		Deque<String> processedInput = objectUnderTest.convertStringToDeque(testInput);
		int originalSize = processedInput.size();
		assertTrue(objectUnderTest.addStringToDeque(processedInput,stringToAdd).size() > originalSize);
	}
	
	@Test
	public void addStringToDeque_sizeOfDequeAndString(){
		String stringToAdd = "abv";
		String testInput = "abc";
		Deque<String> processedInput = objectUnderTest.convertStringToDeque(testInput);
		int originalSize = processedInput.size();
		assertEquals(originalSize + stringToAdd.length(), objectUnderTest.addStringToDeque(processedInput,stringToAdd).size());
	}
	
	@Test
	public void addStringToDeque_dequeCorrectlyPopulated(){
		String stringToAdd = "abv";
		String testInput = "abc";
		Deque<String> processedInput = objectUnderTest.convertStringToDeque(testInput);
		
		Deque<String> processedOutput = objectUnderTest.addStringToDeque(processedInput,stringToAdd);
		String testOutput = "";
		for(String element:processedOutput){
			testOutput += element;
		}
		assertEquals(testInput + stringToAdd, testOutput);
	}
}
