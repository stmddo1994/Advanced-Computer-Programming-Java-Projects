/*File: Item.java
Project: CSIS3101 Assignment 7
Author:  Mathew Doty 
History: Version 1.4 March 3, 2021*/

//This program will create a class for items for a shop to be used with two receipt methods
public class Item {
	
	//Four private variables, each a necessary attribute
	private double price;
	private int weightInOunces;
	private String description;
	private int quantity;
	
	//First constructor with no arguments
	Item(){
		price = 0.0;
		weightInOunces = 0;
		description = "Sample Item";
		quantity = 1;
	}
	
	//Second constructor with arguments
	Item(double pr, int ounces, String dec){
		this.price = pr;
		this.weightInOunces = ounces;
		this.description = dec;
		//Quantity must be added for second constructor, as well
		this.quantity = 1;
	}
	
	//Get and set functions
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWeightInOunces() {
		return weightInOunces;
	}

	public void setWeightInOunces(int weightInOunces) {
		this.weightInOunces = weightInOunces;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Functions to return total price and total weight for each item in the order
	public double getOrderPrice() {
		return price * quantity;
	}
	
	public int getOrderWeightInOunces() {
		return weightInOunces * quantity;
	}
	
	//toString function when item description is printed
	public String toString() {
		
		String iString = "";
		iString += "$" + price + " each for " + quantity + " " + description + "\n";
		
		return iString;
	}

}
