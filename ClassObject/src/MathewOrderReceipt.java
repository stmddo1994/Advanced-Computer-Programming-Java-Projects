
public class MathewOrderReceipt {

	public static void main(String[] args) {      
		double dTotalPrice = 0.0;         
		int iTotalWeight = 0;  
		
		// Put the 4 items being ordered in item1 through item 4         
		Item item1 = new Item(24.99, 14, "Wireless Mouse");         
		Item item2 = new Item(22.49, 27, "USB Keyboard");         
		Item item3 = new Item(24.99, 12, "HDMI Cable");         
		Item item4 = new Item(7.99, 7, "Reading Glasses");         
		item4.setQuantity(2);   
		
		// Show the details of the order using show()         
		System.out.println("Here are your shopping cart contents.");         
		System.out.println(item1);         
		System.out.println(item2);
		System.out.println(item3);
		System.out.println(item4);
		
		// Compute the total price and total weight in this section        
		dTotalPrice += item1.getOrderPrice();         
		dTotalPrice += item2.getOrderPrice();         
		dTotalPrice += item3.getOrderPrice();         
		dTotalPrice += item4.getOrderPrice();         
		iTotalWeight += item1.getOrderWeightInOunces();        
		iTotalWeight += item2.getOrderWeightInOunces();         
		iTotalWeight += item3.getOrderWeightInOunces();         
		iTotalWeight += item4.getOrderWeightInOunces();         
		// Here we show the order details        
		System.out.println("The price of your order is $" + dTotalPrice);         
		System.out.println("The shipping weight is " + iTotalWeight / 16  + " pounds " + iTotalWeight %                          
		                                     16 + " ounces");     
	}
}
