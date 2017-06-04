package com.bwardweb.tdd.collatz.algorithms;

import java.util.Deque;

import com.bwardweb.tdd.collatz.converter.CharacterConverter;
import com.bwardweb.tdd.collatz.processors.InputProcessor;

public class CollatzTagAlgorithm implements TagAlgorithm{
	
	private CharacterConverter characterConverter;
	private InputProcessor processor;
	
	public CollatzTagAlgorithm(CharacterConverter rules, InputProcessor processor){
		characterConverter = rules;
		this.processor = processor;
	}	
	
	public Deque<String> performIteration(Deque<String> stateToProcess){
		String head = stateToProcess.pop();
		stateToProcess.pop();
		processor.addStringToDeque(stateToProcess, characterConverter.convertCharacter(head));
		return stateToProcess;
	}
	
}
