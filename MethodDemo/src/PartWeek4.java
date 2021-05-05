import java.util.Scanner;
public class PartWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take a string as an Input
		//Accepted as valid password if
		/* One lowercase
		 * One uppercase
		 * One digit
		 * At least 8 characters
		 * If all conditions are met, say "Password Accepted"
		 * If not, let user know what's missing
		 */
		
		Scanner inp = new Scanner (System.in);
		
		System.out.println("Password must contain at least one uppercase, one lowercase and"
				+ " one digit and must be at least 8 characters long.");
		System.out.print("Please enter a new Password: ");
		
		String pswd = inp.next();
		
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		
		for (int num = 0; num < pswd.length(); num++) {
			char ch = pswd.charAt(num);
			
			if (Character.isUpperCase(ch))
				upper = true;
			if (Character.isLowerCase(ch))
				lower = true;
			if (Character.isDigit(ch))
				digit = true;
			
		}
			
		if (pswd.length() >= 8 && upper == true && lower == true && digit == true)
			System.out.println("Password Accepted");
		else {
			System.out.println("Invalid Password");
			if (pswd.length() < 8)
				System.out.println("Password must contain at least 8 characters.");
			if (upper == false)
				System.out.println("Password must contain at least one uppercase letter.");
			if (lower == false)
				System.out.println("Password must contain at least one lowercase letter.");
			if (digit == false)
				System.out.println("Password must contain at least one digit.");
		}
		

	}

}
