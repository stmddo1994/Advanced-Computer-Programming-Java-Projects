// File:    MathewDotyKT2ET.java
// Project: CSIS3101 Assignment 2
// Author:  Mathew Doty 
// History: Version 1.4 January 18, 2021

import java.util.Scanner;

public class MathewDotyKT2ET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This program will convert temperature from Kryptonian Temperature
		//Into Earth Temperature
		
		//Introduction for users
		System.out.println("Kryptonians, this will convert Temperature for you.");
		//Input Scanner
		Scanner inp = new Scanner( System.in);
		
		//Input prompt
		System.out.print("Please input Kryptonian Temperature: ");
		//Input variable for Kryptonian temperature
		double MathewKT = inp.nextDouble();
		//Result variable and formula for Earth Temperature
		//Fractions made as floating points to avoid being rounded to 0
		int MathewET = (int)((MathewKT - 25 ) * (3.0 / 13.0));
		
		//Result prompt
		System.out.println("The Kryptonian Temperature " + MathewKT + " KT = "
				+ MathewET + " ET in Earth Temperature.");
	}

}
