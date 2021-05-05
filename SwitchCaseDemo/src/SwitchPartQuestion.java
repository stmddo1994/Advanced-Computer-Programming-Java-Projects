import java.util.Scanner;

public class SwitchPartQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Do a switch case to create a simple calculator.
		//Ask user to give two integer inputs.
		//Then ask the user to give an operator +, -, /, *, or %
		//Based on operator given, display result. If invalid, tell user it is an invalid option
		//Use switch and case to do mini calculator
		
		String calculator;
		System.out.print("Please enter an integer: ");
		Scanner inp = new Scanner( System.in);
		int x = inp.nextInt();
		
		System.out.print("Please enter another integer: ");
		int y = inp.nextInt();
		
		System.out.print("Give an operator symbol (+, -, /, *, %): ");
		calculator = inp.next();
		
		switch(calculator) {
		case("+"):
			System.out.println(x + y);
			break;
		case("-"):
			System.out.println(x - y);
			break;
		case("/"):
			System.out.println((double) x / y);
			break;
		case("*"):
			System.out.println(x * y);
			break;
		case("%"):
			System.out.println(x % y);
			break;
		default:
			System.out.println("Invalid Option");
		}
		
		
	}

}
