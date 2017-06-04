package com.bwardweb.tdd.collatz.processors;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeProcessor {
	public Deque<String> convertStringToDeque(String input){
		Deque<String> processedInput = new ArrayDeque<String>();
		if(input !=null && input.length() > 0){
			for(int i=0;i<input.length();i++){
				processedInput.offer(input.substring(i,i+1));
			}
		}
		return processedInput;
	}
	
	public Deque<String> addStringToDeque(Deque<String> currentDeque, String input){
		if(input !=null && input.length() > 0){
			for(int i=0;i<input.length();i++){
				currentDeque.offer(input.substring(i,i+1));
			}
		}
		return currentDeque;
	}
	
	public String convertDequeToString(Deque<String> currentDeque){
		String dequeAsString = "";
		for(String element:currentDeque){
			dequeAsString += element;
		}
		return dequeAsString;
	}
}
