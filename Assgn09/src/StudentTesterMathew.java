/*File: StudentTesterMathew.java
Project: CSIS3101 Assignment 9
Author:  Mathew Doty 
History: Version 1.1 March 17, 2021*/

public class StudentTesterMathew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityStudentMathew Sue = new UniversityStudentMathew();
		System.out.println(Sue);
		
		BlendFlexStudent Mathew = new BlendFlexStudent("Mathew", "Doty", "123-45-6789", 2020, "Computer Science",
				"TW-83", 183.23, 2, 2);
		System.out.println(Mathew);
		Mathew.calculateSemesterFee();
		
		OnlineStudent Amanda = new OnlineStudent("Amanda", "Doty", "987-65-4321", 2018, "Film Studies",
				"FE-41", 220.12, 4, 39.20);
		System.out.println(Amanda);
		Amanda.calculateSemesterFee();
		
		BlendFlexStudent Kyan = new BlendFlexStudent("Kyan", "Reynalds", "555-55-5555", 2018, "Criminal Investigation",
				"CR-29", 200.25, 6, 0);
		System.out.println(Kyan);
		Kyan.calculateSemesterFee();
	}
	

}
