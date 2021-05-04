/*File: UniversityStudentMathew.java
Project: CSIS3101 Assignment 9
Author:  Mathew Doty 
History: Version 3.2 March 15, 2021*/

//This program will create a class that will be drawn from subclasses
//and referenced with each student's information
public class UniversityStudentMathew {
	
	//Private Variables
	private String firstname;
	private String lastname;
	private String idnumber;
	private String ssnum;
	private int startyear;
	private String department;
	private String depcode;
	private double coursefee;
	
	//Default Constructor
	UniversityStudentMathew() {
		firstname = "Sue";
		lastname = "Allen";
		startyear = 2021;
		CreateIDNumber();
	}
	
	//Parameter Constructor
	UniversityStudentMathew(String fn, String ln, String ssn, int year, String dep, String code, 
			double fee){
		this.firstname = fn;
		this.lastname = ln;
		ssnum = ssn;
		this.startyear = year;
		department = dep;
		depcode = code;
		coursefee = fee;
		CreateIDNumber();
	}

	//Getters and Setters
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getIdnumber() {
		return idnumber;
	}

	protected String getSsnum() {
		return ssnum;
	}

	protected void setSsnum(String ssnum) {
		this.ssnum = ssnum;
	}

	public int getStartyear() {
		return startyear;
	}

	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepcode() {
		return depcode;
	}

	public void setDepcode(String depcode) {
		this.depcode = depcode;
	}

	public double getCoursefee() {
		return coursefee;
	}

	public void setCoursefee(double coursefee) {
		this.coursefee = coursefee;
	}
	
	//Formula to get ID Number
	private void CreateIDNumber() {
		idnumber = "";
		idnumber += Character.toString(firstname.charAt(firstname.length()-1));
		idnumber += Character.toString(lastname.charAt(lastname.length()-1));
		idnumber = idnumber.toUpperCase();
		String newyear = Integer.toString(startyear);
		idnumber += "-" + newyear.charAt(newyear.length()-2) + newyear.charAt(newyear.length()-1);
		idnumber += Integer.toString((int)(9 * Math.random())) + Integer.toString((int)(9 * Math.random()));
	}
	
	//toString for full class
	public String toString() {
		CreateIDNumber();
		String sString = "";
		sString += "First Name: " + firstname + "\nLast Name: " + lastname + "\n";
		sString += "ID Number: " + idnumber + "\nYear: " + startyear + "\n";
		sString += "Department: " + department + "\nDepartment code: " + depcode + "\n";
		sString += "Fee: $" + coursefee + "\n";
		return sString;
	}
	
}
