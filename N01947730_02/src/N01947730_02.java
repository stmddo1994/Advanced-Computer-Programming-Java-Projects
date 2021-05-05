// File:    N01947730_02.java
// Project: CSIS3101 Assignment 2
// Author:  Mathew Doty 
// History: Version 1.2 January 19, 2021

import java.util.Scanner;

public class N01947730_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This program will use an algorithm to receive three integers
		//And give the one with the lowest value
		
		//Input Scanner
		Scanner inp = new Scanner( System.in);
		
		//Introduction prompt to user
		System.out.println("This program will present the lowest number of the ones entered.");
		
		//Input variables
		System.out.print("Please enter the first number: ");
		int a = inp.nextInt();
		System.out.print("Please enter the second number: ");
		int b = inp.nextInt();
		System.out.print("Please enter the third number: ");
		int c = inp.nextInt();
		
		//Results prompt
		System.out.print("The smallest value among " + a + ", " + b + ", and " + c + " is ");
		
		//Statements that will determine the lowest number of the ones input
		//If the first input is lower and/or equal to both the second and third
		//It will be the one given
		if (a <= b && a <= c) 
			System.out.println(a);
		//If the first input is higher than either the second or third
		//The "else if" statement will determine if the second is lower or equal to the third
		//If so, it will be the one given
		else if (b <= c)
			System.out.println(b);
		//If any of the above conditions fail, the last remaining input must be the lowest one
		//Therefore, the last number will be presented
		else
			System.out.println(c);
		
		
	}

}
