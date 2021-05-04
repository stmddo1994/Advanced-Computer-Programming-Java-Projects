/*
File: IntegerArrayDoty.java
Project: CSIS3101 Assignment 6
Author:  Mathew Doty 
History: Version 2.3 February 16, 2021
 */

//This program will create a class that will take an array of integers
//And calculate the sum, max, min, range, and mean and clip a certain maximum number

//Create class for integer arrays
public class IntegerArrayDoty {

	//Set private variable as an array
	private int[] arr;
	
	//No argument constructor
	IntegerArrayDoty(){
		arr = new int [1];
	}
	
	//Length argument constructor
	IntegerArrayDoty(int len) {
		arr = new int [len];
	}
	
	//Array argument constructor
	IntegerArrayDoty(int[] num) {
		arr = num;
	}
	
	//Literal Display
	public void printLiteral() {
		System.out.print("{");
		if (arr.length >= 1) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				//If item in array isn't the last, add a comma
				if (i + 1 != arr.length)
					System.out.print(",");
			}
		}
		System.out.println("}");
	}
	
	//Sum of array given
	public int sumOfArray() {
		int sum = 0;
		for(int i = 0; i < arr.length; i ++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//Max number in array
	public int maxInArray() {
		//Give answer as 0 if the length of the array is 0.
		int max = 0;
		if (arr.length != 0) {
			max = arr[0];
			for(int i = 1; i < arr.length; i++) {
				if (arr[i] > max)
					max = arr[i];
		}
		}
		return max;
	}
	
	//Min number in array
	public int minInArray() {
		int min = 0;
		if (arr.length != 0) {
			min = arr[0];
			for(int i = 1; i < arr.length; i++) {
				if (arr[i] < min)
					min = arr[i];
		}
		}
		return min;
	}
	
	//Range of numbers in array
	public int rangeInArray() {
		int range = maxInArray() - minInArray();
		return range;
	}
	
	//Average of items in array
	public double mean() {
		if (arr.length == 0)
			return 0.0;
		else
			return ((double)sumOfArray())/((double)arr.length);
	}
	
	//Clip to replace number higher than the input number with said input
	public void clip(int clip) {
		for (int i = 0; i < arr.length; i++) {
			if (clip < arr[i])
				arr[i] = clip;
		}
	}
	
	}

