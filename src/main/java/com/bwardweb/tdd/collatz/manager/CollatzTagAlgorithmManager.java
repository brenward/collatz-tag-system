package com.bwardweb.tdd.collatz.manager;

import java.util.Deque;

import com.bwardweb.tdd.collatz.algorithms.CollatzTagAlgorithm;
import com.bwardweb.tdd.collatz.algorithms.TagAlgorithm;
import com.bwardweb.tdd.collatz.converter.CharacterConverter;
import com.bwardweb.tdd.collatz.converter.CollatzCharacterConverter;
import com.bwardweb.tdd.collatz.processors.DequeProcessor;

public class CollatzTagAlgorithmManager implements TagAlgorithmManager{
	DequeProcessor inputProcessor;
	CharacterConverter characterConverter;
	TagAlgorithm tagAlgorithm;
	
	public CollatzTagAlgorithmManager(){
		inputProcessor = new DequeProcessor();
		characterConverter = new CollatzCharacterConverter();
		tagAlgorithm = new CollatzTagAlgorithm(characterConverter, inputProcessor);		
	}
	
	@Override
	public String runAlgorithm(int lowerLimit, String startString) {
		System.out.println(startString);
		String finalString = "";
		Deque<String> currentState = inputProcessor.convertStringToDeque(startString);
		while(currentState.size() >= lowerLimit){			
			currentState = tagAlgorithm.performIteration(currentState);
			finalString = inputProcessor.convertDequeToString(currentState);
			System.out.println(finalString);
		}
		return finalString;
	}
	

}
