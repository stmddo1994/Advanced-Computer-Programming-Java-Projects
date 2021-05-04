/*File: Passw0rd.java
Project: CSIS3101 Assignment 10
Author:  Mathew Doty 
History: Version 1.2 March 23, 2021*/

//Import file reading classes
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PasswordTestMathew {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//Read txt file
		File iFile = new File("passwdin.txt");
		//Exception for input file not existing
		if(!iFile.exists()) {
			System.out.println("File DNE");
			System.exit(1);
		}
		
		Scanner fInp = new Scanner(iFile);
		
		//Create output file to present results
		File oFile = new File("mathewpasswdout.txt");
		//Exception for output file already existing
		if(oFile.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter fOutp = new PrintWriter(oFile);
		
		//loop for each line in input file
		while (fInp.hasNext()) {
			//create temporary object for each line
			Passw0rdMathew pswd = new Passw0rdMathew(fInp.nextLine());
			//Print result of check Password function for current line
			fOutp.println(pswd.checkPassword());
		}
		
		//Close files
		fInp.close();
		fOutp.close();
		
		//Completed file message
		System.out.println("File Complete");
	}

}
