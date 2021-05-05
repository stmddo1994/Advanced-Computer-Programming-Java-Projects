/* File: Lotto.java
Project: CSIS3101 Assignment 4
Author:  Mathew Doty 
History: Version 2.5 February 1, 2021*/

import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This program will use two methods to create two lotteries
		//The first will compare a random three digit number to a guessed three digit number
		//And display according to how many numbers match
		//The second will compare a random two digit number to a guessed two digit number as strings
		
		//Call both methods in the main
		lottoNumMathew();
		lottoStrMathew();
		
	}
	
	//Create method for three digit lotto
	public static void lottoNumMathew() {
		
		//Random number created from range 100 - 999
		int lotto = (int)((100 + 899 * Math.random()));

		Scanner inp = new Scanner (System.in);
		
		//Input prompt for 3 digit number
		System.out.print("Please enter three digit number: ");
		//Input for guessed number
		int playernum = inp.nextInt();
		//Validation loop for input
		while (playernum < 100 || playernum > 999) {
			System.out.print("Invalid, Please enter three digit number: ");
			playernum = inp.nextInt();
		}
		
		//Digit separation for comparison in lotto number
		int lot1 = lotto / 100;
		int lot2 = (lotto / 10) - (10 * lot1);
		int lot3 = lotto % 10;
		
		//Sum of lotto number digits
		int sumlot = lot1 + lot2 + lot3;
		
		//Digit separation for comparison in guest number
		int pla1 = playernum / 100;
		int pla2 = (playernum / 10) - (10 * pla1);
		int pla3 = playernum % 10;
		
		//Sum of guess number digits
		int sumpla = pla1 + pla2 + pla3;
		
		//Array for lotto numbers
		int[] lotArray = {lot1, lot2, lot3};
		
		//Match indication
		int pla1match = 0;
		int pla2match = 0;
		int pla3match = 0;
		
		//Loop to identify which of the guess digits match to a lotto digit
		for (int i = 0; i < lotArray.length; i++) {
			if (pla1 == lotArray[i])
				pla1match += 1;
			if (pla2 == lotArray[i])
				pla2match += 1;
			if (pla3 == lotArray[i])
				pla3match += 1;
		}
		
		//Display lotto number
		System.out.println("Today's lucky number is " + lotto);
		
		//If-else function for display
		//If lotto number matches guess, the player wins jackpot
		if (lotto == playernum)
			System.out.println("Jackpot! $10,000 winner!");
		//If lotto digits and guess digits are the same, player wins $7000
		else if (sumlot == sumpla && pla1match >= 1 && pla2match >= 1 && pla3match >= 1)
			System.out.println("$7,000 winner!");
		//If two digits are the same in each, player wins $4000
		else if ((lot1 == pla1 && (lot2 == pla2 || lot2 == pla3 || lot3 == pla2 || lot3 == pla3)) ||
				(lot1 == pla2 && (lot2 == pla1 || lot2 == pla3 || lot3 == pla1 || lot3 == pla3)) ||
				(lot1 == pla3 && (lot2 == pla1 || lot2 == pla3 || lot3 == pla1 || lot3 == pla2)) ||
				(lot2 == pla1 && (lot3 == pla2 || lot3 == pla3)) ||
				(lot2 == pla2 && (lot3 == pla1 || lot3 == pla3)) || 
				(lot2 == pla3 && (lot3 == pla1 || lot3 == pla2)))
				System.out.println("$4,000 winner!");
		//If one digit is the same in each, player wins $1000
		else if (pla1match >= 1 || pla2match >= 1 || pla3match >= 1)
			System.out.println("$1,000 winner!");
		//If no conditions match, the player lost
		else
			System.out.println("Sorry. Play again.");
	}
	
	//Create method for two digit string lotto
	public static void lottoStrMathew() {
		
		Scanner inp = new Scanner (System.in);
		
		//Turn random number between 10 and 99 into a string
		String stlot = "" + (int)(10 + 89 * Math.random());
		
		//Input prompt for two-digit number
		System.out.print("Please enter a two-digit number: ");
		//Input for guessed number in a string
		String stinp = inp.nextLine();
		
		//Validation method
		//Digit count
		int digits = 0;
		
		//For-loop to check characters in string
		for (int num = 0; num < stinp.length(); num++) {
			char ch = stinp.charAt(num);
			
			if (Character.isDigit(ch))
				digits += 1;
		}
		
		//While-loop to ensure valid input
		while (stinp.length() != 2 || digits != 2 || stinp.startsWith("0")) {
			digits = 0;
			System.out.print("Invalid; Please enter a two-digit number: ");
			stinp = inp.nextLine();
			
			for (int num = 0; num < stinp.length(); num++) {
				char ch = stinp.charAt(num);
				
				if (Character.isDigit(ch))
					digits += 1;
			}
		}
		
		//Separate characters for comparison
		char lotd1 = stlot.charAt(0);
		char lotd2 = stlot.charAt(1);
		char inpd1 = stinp.charAt(0);
		char inpd2 = stinp.charAt(1);
		
		//Display lotto number
		System.out.println("The lucky number is: " + stlot);
		
		//If-else function for display
		//If strings match, player wins jackpot
		if (stinp.equals(stlot))
			System.out.println("Big winner! You win $10,000");
		//If both have same characters, player wins $5000
		else if (lotd1 == inpd2 && lotd2 == inpd1)
			System.out.println("You win $5,000");
		//If one character is the same, player wins $1000
		else if (lotd1 == inpd1 || lotd2 == inpd1 || lotd1 == inpd2 || lotd2 == inpd2)
			System.out.println("You win $1,000");
		//If no conditions match, player loses
		else
			System.out.println("Sorry. Play again.");
	}

}
