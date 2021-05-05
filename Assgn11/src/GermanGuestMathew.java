/*File: GermanGuestMathew.java
Project: CSIS3101 Assignment 11
Author:  Mathew Doty 
History: Version 1.1 March 29, 2021*/

public class GermanGuestMathew extends Guest {

	//German guest greeting
	public GermanGuestMathew(String name) {
		super(name);
		setNightGreeting("Gute Nacht");
		setMorningGreeting("Guten Morgen");
	}

}
