/*File: Passw0rd.java
Project: CSIS3101 Assignment 10
Author:  Mathew Doty 
History: Version 2.0 March 23, 2021*/

//This class will use a formula to identify if a password is eligible 
//And return a message that shows what is wrong if there is anything wrong
public class Passw0rdMathew {
	private String password;
	
	//Default constructor
	Passw0rdMathew(){
		password = "Default";
	}
	
	//Parameter constructor
	Passw0rdMathew(String pswd){
		this.password = pswd;
	}
	
	//Password validation function
	public String checkPassword() {
		//Make password into a string
		String pswdstr = password;
		//Counters for each character type
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int spec = 0;
		boolean space = false;
		
		//Validation loop
		for (int num = 0; num < password.length(); num++) {
			//Check each character on string
			char ch = password.charAt(num);
			
			//If-else for each type
			if (Character.isUpperCase(ch))
				upper++;
			else if (Character.isLowerCase(ch))
				lower++;
			else if (Character.isDigit(ch))
				digit++;
			//Password only needs one space to be invalid
			else if (Character.isWhitespace(ch))
				space = true;
			else
				spec++;
		}
		
		//If-else for message display
		if (password.length() >= 10 && upper >= 1 && lower >= 3 && digit >= 2 && spec == 1 && space == false)
			//Add message after password
			pswdstr += " - Password Accepted\n";
		else {
			//And all recurring ones displayed beneath
			pswdstr += " - Password Not Accepted\n";
			if (password.length() < 10)
				pswdstr += "Password is not 10 characters long\n";
			if (upper < 1)
				pswdstr += "Password does not have at least one uppercase letter\n";
			if (lower < 3)
				pswdstr += "Password does not have at least three lowercase letters\n";
			if (digit < 2)
				pswdstr += "Password does not have at least two digits\n";
			if (spec != 1)
				pswdstr += "Password does not have exactly one special character\n";
			if (space == true)
				pswdstr += "Password cannot include a space\n";
		}
		
		//Return display message string
		return pswdstr;
	}
}