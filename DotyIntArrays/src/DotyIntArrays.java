/*
File: DotyIntArrays.java
Project: CSIS3101 Assignment 8
Author:  Mathew Doty 
History: Version 1.2 March 9, 2021
 */
import java.util.Scanner;

public class DotyIntArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create new buffer array
		IntegerBufferMathew array1 = new IntegerBufferMathew(20);
		
		//Add random int and test by printing to console
		for (int i = 0; i < 7; i++) {
			if(array1.addRandom())
				System.out.println("A random value has been added.");
			else {
				System.out.println("Buffer is full");
				break;
			}
		}
		array1.printToConsole();
		
		TemperatureMathew test = new TemperatureMathew(0.0, "F");
		getTemperatureFromUser(test);
	}

	// Function:  getTemperatureFromUser
		 // Purpose:   Prompt user for a temperature and put it in the argument object
		 // Parameter: temperatureObject is a TemperatureFirstname object 
		// Returns:   nothing 
		public static void getTemperatureFromUser(TemperatureMathew temperatureObject) {
			Scanner inp = new Scanner(System.in);
			//Starting variables
			boolean rightinp = false;
			double usertemp = 0.0;
			String userunit = "F";
			//Validation loop
			while (rightinp == false) {
				System.out.print("I will ask you for a temperature and its units. Use C for Celsius, F for Fahrenheit or K for Kelvin.\n"
						+ "Enter a Temperature followed by the units and seperate them with a space: ");
				usertemp = inp.nextDouble();
				userunit = inp.next();
				if (!userunit.equals("K") && !userunit.equals("F") && !userunit.equals("C"))
					System.out.println("Invalid input");
				else {
					rightinp = true;

					temperatureObject.setUnit(userunit);
					
					if (userunit == "F")
						temperatureObject.setFTemperature(usertemp);
					else if (userunit == "C")
						temperatureObject.setCTemperature(usertemp);
					else if (userunit == "K")
						temperatureObject.setKTemperature(usertemp);
				
				}
				
			}
			
			//Get temperature conversions
			double Fah = temperatureObject.getFTemperature();
			double Cel = temperatureObject.getCTemperature();
			double Kel = temperatureObject.getKTemperature();
			
			System.out.println("The temperature in Celsius is " + Cel + "\n"
					+ "The temperature in Fahrenheit is " + Fah + "\n"
					+ "The temperature in Kelvin is " + Kel);
		}
}
