/*File: FrenchGuestMathew.java
Project: CSIS3101 Assignment 11
Author:  Mathew Doty 
History: Version 1.1 March 29, 2021*/

public class FrenchGuestMathew extends Guest {

	//French guest greeting
	public FrenchGuestMathew(String name) {
		super(name);
		setNightGreeting("Bonne nuit");
		setMorningGreeting("Bonjour");
	}
}
