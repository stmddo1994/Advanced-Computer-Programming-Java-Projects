// File:    speedFineCountMathew.java
// Project: CSIS3101 Assignment 3
// Author:  Mathew Doty 
// History: Version 2.1 January 24, 2021

import java.util.Scanner;
public class speedFineCalcMathew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This program is meant to calculate the fine of a driver
		//When given the Speed Limit, Vehicle Speed, and Traffic Zone Type
		//And display an appropriate message for the speeder
		Scanner inp = new Scanner(System.in);
		
		//Input for Speed Limit
		System.out.print("Please enter the Speed Limit: ");
		int speedLimitMathew = inp.nextInt();
		
		//Input for Vehicle Speed
		System.out.print("Please enter vehicle speed: ");
		int speedMathew = inp.nextInt();
		
		//Input for Traffic Zone Type
		System.out.print("Please enter Traffic Zone Type (Regular, School, or Construction): ");
		
		String zoneMathew = inp.next();
		
		//While loop for invalid input to Traffic Zone
		while (!zoneMathew.equals("Regular") && !zoneMathew.equals("School") 
				&& !zoneMathew.equals("Construction")) {
			System.out.print("Invalid input; Please enter again (Regular, School, Construction): ");
			zoneMathew = inp.next();
	}
		
		//Calculate the difference between the speed and the speed limit
		int diff = speedMathew - speedLimitMathew;
		//Set display variable
		String display = "";
		
		//Set fine variable
		double fine = 0.00;
		
		//If-else conditions for the differences
		if (diff > 0 && diff < 5) {
			fine = 89.00;
			display = "A";
		}
		else if (diff >= 5 && diff < 15) {
			fine = 119.00;
			display = "B";
		}
		else if (diff >= 15 && diff < 25) {
			fine = 159.00;
			display = "C";
		}
		else if (diff >= 25 && diff < 30) {
			fine = 229.00;
			display = "D";
		}
		else if (diff >= 30) {
			display = "E";
		}
		else {
			display = "F";
		}
		
		//Begin full display
		System.out.println("Speed Limit: " + speedLimitMathew);
		
		System.out.println("Vehicle Speed: " + speedMathew);
		
		System.out.println("Zone: " + zoneMathew);
		
		//Display fine if needed
		if (diff > 0 && diff < 30) {
			//Double fine if in School or Construction zone
			if (!zoneMathew.equals("Regular")) {
				fine *= 2.0;
				System.out.println("Fine is doubled in a School or Construction Zone");
			}
			//Print fine in format with 2 decimal points
			System.out.printf("Fine: $%6.2f", fine);
			System.out.println("");
		}
		
		//Create a switch method for the display message
		switch(display) {
		case("A"):
			System.out.println("Display: \"Slow Down!\"");
			break;
		case("B"):
			System.out.println("Display: \"Drive with Caution!\"");
			break;
		case("C"):
			System.out.println("Display: \"You are overspeeding!\"");
			break;
		case("D"):
			System.out.println("Display: \"You are in the Danger Zone!\"");
			break;
		case("E"):
			System.out.println("Fine: Court Mandatory");
			System.out.println("Display: \"See You in Court!!\"");
			break;
		case("F"):
			System.out.println("Display: \"Good job! You are within the Speed Limit!\"");
			break;
		//Set default in case of error
		default:
			System.out.println("Invalid Speed or Speed Limit");
		}
		
}
}