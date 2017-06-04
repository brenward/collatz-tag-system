package com.bwardweb.tdd.collatz;

import com.bwardweb.tdd.collatz.manager.CollatzTagAlgorithmManager;
import com.bwardweb.tdd.collatz.manager.TagAlgorithmManager;

public class Main {

	public static void main(String[] args) {
		TagAlgorithmManager manager = new CollatzTagAlgorithmManager();
		System.out.println("---------- NEW RUN ----------");
		manager.runAlgorithm(2, "aaa");
		System.out.println("---------- NEW RUN ----------");
		manager.runAlgorithm(2, "aaaaaaa");
	}

}
