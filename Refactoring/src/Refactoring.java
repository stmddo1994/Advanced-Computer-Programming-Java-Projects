/* File: Refactoring.java
Project: CSIS3101 Assignment 5
Author:  Mathew Doty 
History: Version 3.2 February 9, 2021*/
import java.util.Scanner;
public class Refactoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This program will create a step by step procedure to test a number's validation
		//Using a method called factoring
		//There are five different steps each giving a different result when given an invalid number
		
		//getMathewValue_step1();
		//getMathewValue_step2();
		//getMathewValue_step3();
		//getMathewValue_step4();
		getMathewValue_step5();
		
	}
	
	//Method one
	public static void getMathewValue_step1() {
		
		Scanner inp = new Scanner (System.in);
		
		//Message prompt and input
		System.out.print("Please enter a number between 11 and 20: ");
		int num = inp.nextInt();
		
		//Input result
		System.out.println("You entered a " + num);
	}
	
	//Method two
	public static void getMathewValue_step2() {
		
		Scanner inp = new Scanner (System.in);
		
		//Message prompt and input
		System.out.print("Please enter a number between 11 and 20: ");
		int num = inp.nextInt();
		
		//Gives invalidation message if conditions are not met
		if (num < 11 || num > 20)
			System.out.println("The value you entered is not between 11 and 20.");
		//Gives result if conditions are met
		else
			System.out.println("You entered a " + num);
	}
	
	//Method three
	public static void getMathewValue_step3() {
		
		Scanner inp = new Scanner (System.in);
		
		//Message prompt and input
		System.out.print("Please enter a number between 11 and 20: ");
		int num = inp.nextInt();
		
		//Gives invalidation message if conditions are not met
		if (num < 11 || num > 20)
			System.out.println("The value you entered is not between 11 and 20.");
		//Grammatical correction for certain numbers
		else if (num == 11 || num == 18)
			System.out.println("You entered an " + num);
		else
			System.out.println("You entered a " + num);
	}
	
	//Method four
	public static void getMathewValue_step4() {
		
		Scanner inp = new Scanner (System.in);
		
		//Message prompt and input
		System.out.print("Please enter a number between 11 and 20: ");
		//Input is now a string
		String input = inp.next();
		
		//Validation if input is a digit
		boolean digit = true;
		
		//Check for each character in string
		for (int n = 0; n < input.length(); n++) {
			char ch = input.charAt(n);
			
			//If any non-digit characters are found, make validation false
			if (!Character.isDigit(ch))
				digit = false;
		}
		//Invalidation message for non-digit entry
		if (digit == false)
				System.out.println("Idiot! Your input could not be read as a number. Get a life!");
		//Continue if number is a digit
		else {
			//Parse method to convert string into integer data type
			int num = Integer.parseInt(input);
			//Gives invalidation message if numerical conditions are not met
			if (num < 11 || num > 20)
				System.out.println("The value you entered is not between 11 and 20.");
			//Grammatical correction for certain numbers
			else if (num == 11 || num == 18)
				System.out.println("You entered an " + num);
			else
				System.out.println("You entered a " + num);
		}
		
	}
	public static void getMathewValue_step5() {
	
		Scanner inp = new Scanner (System.in);
		
		//Validation condition
		boolean valid = false;
		
		//While-loop to repeat input if invalid
		while (valid == false) {
			
			//Message prompt and input
			System.out.print("Please enter a number between 11 and 20: ");
			String input = inp.next();
			
			//Validation if input is a digit
			boolean digit = true;
			
			//Check for each character in string
			for (int n = 0; n < input.length(); n++) {
				char ch = input.charAt(n);
				
				//If any non-digit characters are found, make validation false
				if (!Character.isDigit(ch))
					digit = false;
			}
			//Invalidation message for non-digit entry
			if (digit == false)
				System.out.println("Idiot! Your input could not be read as a number. Get a life!");
			//Continue if number is a digit
			else {
				//Parse method to convert string into integer data type
				int num = Integer.parseInt(input);
				//Gives invalidation message if numerical conditions are not met
				if (num < 11 || num > 20)
					System.out.println("The value you entered is not between 11 and 20.");
				else {
					//Change condition if input is valid
					valid = true;
					//Grammatical correction for certain numbers
					if (num == 11 || num == 18)
						System.out.println("You entered an " + num);
					else
						System.out.println("You entered a " + num);
		
				}
	
			}
		}
	}
	
}
