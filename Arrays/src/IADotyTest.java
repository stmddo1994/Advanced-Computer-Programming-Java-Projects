/*
File: IADotyTest.java
Project: CSIS3101 Assignment 6
Author:  Mathew Doty 
History: Version 1.0 February 17, 2021
 */
import java.util.Scanner;

public class IADotyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr0= { -2,-1 }; 
		int [] arr1= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		int [] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 7, 6, 22, 8, 9, 16, 5, 2, 7, 8, 12, 2, 0, 14, 17, 19, 22 }; 
		IntegerArrayDoty A1 = new IntegerArrayDoty( arr0 );
		IntegerArrayDoty A2 = new IntegerArrayDoty( arr1 );
		IntegerArrayDoty A3 = new IntegerArrayDoty( arr2 );

		testDataBuffer( A1 ); 
		testDataBuffer( A2 ); 
		testDataBuffer( A3 ); 
       }
		 
public static void testDataBuffer(IntegerArrayDoty A) { 
		 
		A.printLiteral(); 
		
		System.out.println("Sum of Array: " + A.sumOfArray());
		System.out.println("Max of Array: " + A.maxInArray());
		System.out.println("Min of Array: " + A.minInArray());
		System.out.println("Range of Array: " + A.rangeInArray());
		System.out.println("Mean value of Array: " + A.mean()); 
		
		Scanner inp = new Scanner( System.in);
		System.out.print("Enter an  integer to clip the array with: ");
		int clipNum = inp.nextInt();
		
		A.clip( clipNum );
        A.printLiteral();
	} 
}
