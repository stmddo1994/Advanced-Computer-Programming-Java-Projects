/*File: MathewOrderReceiptArray.java
Project: CSIS3101 Assignment 7
Author:  Mathew Doty 
History: Version 1.4 March 3, 2021*/
public class MathewOrderReceiptArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dTotalPrice = 0.0;         
		int iTotalWeight = 0;
		
		//Create Array of the Item class that accepts new Items and their parameters
		Item[] itemArray = {new Item(24.99, 14, "Wireless Mouse"), new Item(22.49, 27, "USB Keyboard"),
				new Item(24.99, 12, "HDMI Cable"), new Item(7.99, 7, "Reading Glasses")};
		
		//Set Quantity to item 4 (in Index 3)
		itemArray[3].setQuantity(2);
		
		//Alternative: Was unsure if Item1, 2, 3, and 4 needed to be created first then arranged into arrays
		//Commenting out lines 13 through 17 and putting in the commented lines below will create the same results
		
		/*Item item1 = new Item(24.99, 14, "Wireless Mouse");         
		Item item2 = new Item(22.49, 27, "USB Keyboard");         
		Item item3 = new Item(24.99, 12, "HDMI Cable");         
		Item item4 = new Item(7.99, 7, "Reading Glasses");         
		item4.setQuantity(2);   
		
		Item[] itemArray = {item1, item2, item3, item4};*/
		
		System.out.println("Here are your shopping cart contents.");
		
		//For loop to display each item String output
		for (int i = 0; i < itemArray.length; i++) {
			System.out.println(itemArray[i]);
			dTotalPrice += itemArray[i].getOrderPrice();
			iTotalWeight += itemArray[i].getOrderWeightInOunces();
		}
		
		System.out.println("The price of your order is $" + dTotalPrice);         
		System.out.println("The shipping weight is " + iTotalWeight / 16  + " pounds " + iTotalWeight %                          
		                                     16 + " ounces");
	}
	
}
