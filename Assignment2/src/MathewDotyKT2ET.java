import java.util.Scanner;

// File:    MathewDotyKT2ET.java
// Project: CSIS3101 Assignment 2
// Author:  Mathew Doty 
// History: Version 1.4 January 18, 2021
public class MathewDotyKT2ET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This program will convert temperature from Kryptonian Temperature
		//Into Earth Temperature
		
		System.out.println("Kryptonians, this will convert Temperature for you.");
		Scanner inp = new Scanner( System.in);
		
		System.out.print("Please input Kryptonian Temperature: ");
		double MathewKT = inp.nextDouble();
		int MathewET = (int)((MathewKT - 25 ) * (3.0 / 13.0));
		
		System.out.println("The Kryptonian Temperature " + MathewKT + " KT = "
				+ MathewET + " ET in Earth Temperature.");
	}

}
