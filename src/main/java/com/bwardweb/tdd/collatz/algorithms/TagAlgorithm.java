package com.bwardweb.tdd.collatz.algorithms;

import java.util.Deque;

public interface TagAlgorithm {
	public Deque<String> performIteration(final Deque<String> stateToProcess);	

}
