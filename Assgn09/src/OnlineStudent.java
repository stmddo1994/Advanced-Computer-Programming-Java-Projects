/*File: OnlineStudent.java
Project: CSIS3101 Assignment 9
Author:  Mathew Doty 
History: Version 2.3 March 16, 2021*/

//This program is a class that will extend from the University Student Superclass
public class OnlineStudent extends UniversityStudentMathew {

	//Private Variables
	private int noOfOnlineClasses;
	private double labfee;
	
	//Default Constructors
	OnlineStudent(){
		noOfOnlineClasses = 2;
		labfee = 0.00;
	}
	
	//Parameter Constructors
	OnlineStudent(String fn, String ln, String ssn, int year, String dep, String code, 
			double fee, int oclasses, double lfee){
		//Include Super
		super(fn, ln, ssn, year, dep, code, fee);
		this.noOfOnlineClasses = oclasses;
		this.labfee = lfee;
	}
	
	//Getters and Setters
	public int getNoOfOnlineClasses() {
		return noOfOnlineClasses;
	}

	public void setNoOfOnlineClasses(int noOfOnlineClasses) {
		this.noOfOnlineClasses = noOfOnlineClasses;
	}

	public double getLabfee() {
		return labfee;
	}

	public void setLabfee(double labfee) {
		this.labfee = labfee;
	}
	
	//Calculate and return Semester Fee
	public void calculateSemesterFee() {
		if (noOfOnlineClasses > 5)
			System.out.println("You can only have a maximum of 5 classes");
		else {
			double cfee = super.getCoursefee();
			double ofee = noOfOnlineClasses * (cfee - (cfee * 0.25) + labfee);
			System.out.println("Semester fee = $" + ofee);
		}
	}
	
	//toString for OnlineStudent class
	public String toString() {
		String osStr = super.toString();
		osStr += "Number of Online Classes: " + noOfOnlineClasses + "\n";
		osStr += "Virtual Lab Fee: " + labfee + "\n";
		return osStr;
	}
	
}
