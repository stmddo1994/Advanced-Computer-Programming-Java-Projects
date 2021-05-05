/*
File: IntegerBufferMathew.java
Project: CSIS3101 Assignment 8
Author:  Mathew Doty 
History: Version 1.5 March 9, 2021
 */
public class IntegerBufferMathew {
	
	//Private variables
	private int[] buffer;
	private int numberOfValues;
	
	IntegerBufferMathew(){
		final int BUFFER_SZ = 20;
		buffer = new int[BUFFER_SZ];
		numberOfValues = 0;
	}
	
	IntegerBufferMathew(int size){
		this.buffer = new int[size];
		this.numberOfValues = 0;
	}
	
	//Keep values
	public boolean addRandom(){
		if (numberOfValues == buffer.length)
			return false;
		int bufEntry = (int)(10 + 90 * Math.random());
		buffer[numberOfValues] = bufEntry;
		numberOfValues++;
		return true;
	}
	
	public int getnumberOfValues() {
		return numberOfValues;
	}
	
	public void setNumberOfValues(int numberOfValues) {
		this.numberOfValues = numberOfValues;
	}

	//Print based on number of values
	public void printToConsole() {
		System.out.print("{");
		for (int i = 0; i < numberOfValues; i++) {
			System.out.print(buffer[i]);
			if (i + 1 != numberOfValues)
				System.out.print(",");
			}
	System.out.println("}");
	}
}
