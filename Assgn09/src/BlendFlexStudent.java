/*File: BlendFlexStudent.java
Project: CSIS3101 Assignment 9
Author:  Mathew Doty 
History: Version 2.1 March 17, 2021*/

//This program is a class that will extend from the University Student Superclass
public class BlendFlexStudent extends UniversityStudentMathew {

	//Private variable
	private int noOfOnlineClasses;
	private int noOfBlendflexClasses;
	
	//Default constructor
	BlendFlexStudent(){
		noOfOnlineClasses = 1;
		noOfBlendflexClasses = 1;
	}
	
	//Parameter Constructor
	BlendFlexStudent(String fn, String ln, String ssn, int year, String dep, String code, 
			double fee, int oclass, int bfclass){
		super(fn, ln, ssn, year, dep, code, fee);
		this.noOfOnlineClasses = oclass;
		this.noOfBlendflexClasses = bfclass;
	}

	//Getters and Setters
	public int getNoOfOnlineClasses() {
		return noOfOnlineClasses;
	}

	public void setNoOfOnlineClasses(int noOfOnlineClasses) {
		this.noOfOnlineClasses = noOfOnlineClasses;
	}

	public int getNoOfBlendflexClasses() {
		return noOfBlendflexClasses;
	}

	public void setNoOfBlendflexClasses(int noOfBlendflexClasses) {
		if (noOfBlendflexClasses < 1)
			System.out.println("You need to have at least 1 BlendFlex Class");
		this.noOfBlendflexClasses = noOfBlendflexClasses;
	}
	
	//Function to calculate and return semester fee
	public void calculateSemesterFee() {
		if (noOfBlendflexClasses < 1 || noOfOnlineClasses + noOfBlendflexClasses > 5) {
			if (noOfBlendflexClasses < 1)
				System.out.println("You need to have at least 1 BlendFlex Class");
			if (noOfOnlineClasses + noOfBlendflexClasses > 5)
			System.out.println("You can only have a maximum of 5 Online Classes");
		}
		else {
			double cfee = super.getCoursefee();
			double ofee = noOfOnlineClasses * (cfee - (cfee * 0.25));
			double bffee = noOfBlendflexClasses * cfee *(1 + 20/100);
			double tfee = ofee + bffee;
			System.out.println("Semester Fee = $" + tfee);
		}
	}
	
	//toString
	public String toString() {
		String bfStr = super.toString();
		bfStr += "Number of Online Classes: " + noOfOnlineClasses + "\n";
		bfStr += "Number of BlendFlex Classes: " + noOfBlendflexClasses + "\n";
		return bfStr;	
	}
}
