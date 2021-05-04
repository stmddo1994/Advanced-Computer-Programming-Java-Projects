// File:    nestedMathew.java
// Project: CSIS3101 Assignment 3
// Author:  Mathew Doty 
// History: Version 1.4 January 24, 2021

import java.util.Scanner;
public class nestedMathew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program will create a pattern when given an input from a number of rows
		//Giving an incrimenting number of asterisks and leaving exclamation points
		//In the spaces to be filled
		
		//Scanner input command
		Scanner inp = new Scanner(System.in);
		
		//Input command display
		System.out.print("Please enter the number of rows: ");
		//Input for number of rows
		int sym = inp.nextInt();
		
		//For loop for each row
		//Starts at one, increments upwards so long as it is less than or equal to the input number
		for (int r = 1; r <= sym; r++) {
			//Starts at one, increments upwards so long as it is less than or equal to
			//The current number of r
			for (int s = 1; s <= r; s++) {
				System.out.print("*");
			}
			//Increments downwards from the number of rows so long as it is greater than
			//The current number of r
			for (int t = sym; t > r; --t) {
				System.out.print("!");
			}
			//Given to send pattern to the next line
			System.out.println();
		}
	}

}
