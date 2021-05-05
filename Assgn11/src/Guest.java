/*File: Guest.java
Project: CSIS3101 Assignment 11
Author:  Mathew Doty 
History: Version 1.6 March 28, 2021*/

//This is the overarching superclass to print a greeting for a bed and breakfast
public class Guest {
	
	//Private variables
	public String name;
	public String nightGreeting;
	public String morningGreeting;
	
	//Parameter constructor
	Guest(String nm){
		name = nm;
		nightGreeting = "Good Night";
		morningGreeting = "Good Morning";
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNightGreeting() {
		return nightGreeting;
	}

	public void setNightGreeting(String nightGreeting) {
		this.nightGreeting = nightGreeting;
	}

	public String getMorningGreeting() {
		return morningGreeting;
	}

	public void setMorningGreeting(String morningGreeting) {
		this.morningGreeting = morningGreeting;
	}
	
	//String method returning night greeting
	public String greetNight() {
		String gnite = "";
		gnite += nightGreeting + " " + name + ".";
		return gnite;
	}
	
	//String method returning morning greeting
	public String greetMorning() {
		String gmorn = "";
		gmorn += morningGreeting + " " + name + ".";
		return gmorn;
	}
	

}
