/*File: GuestFactory.java
Project: CSIS3101 Assignment 11
Author:  Mathew Doty 
History: Version 1.3 April 1, 2021*/

//This class provides choices for each class when called and given a name and language
public class GuestFactory {

	//Method with name and language parameters
	public static Guest getGuestInstance(String name, String language){
		//create a new Guest object with the name given using the subclass that corrolates with the language
		if (language == "German")
			return new GermanGuestMathew(name);
		else if (language == "French")
			return new FrenchGuestMathew(name);
		else if (language == "Spanish")
			return new SpanishGuestMathew(name);
		//Default to superclass if language not found
		else 
			return new Guest(name);
		
	}
}
