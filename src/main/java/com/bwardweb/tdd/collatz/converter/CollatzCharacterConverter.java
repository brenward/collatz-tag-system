package com.bwardweb.tdd.collatz.converter;

public class CollatzCharacterConverter implements CharacterConverter{
	public String convertCharacter(String input){

		switch(input){
		case "a":
			return "bc";
		case "b":
			return "a";
		case "c":
			return "aaa";
		default:
			return "";
		}	
	}

}
