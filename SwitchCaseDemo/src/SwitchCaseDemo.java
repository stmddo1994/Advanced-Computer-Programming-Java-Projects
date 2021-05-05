import java.util.Scanner;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dayOfWeek;
		System.out.print("Please enter a Weekday: ");
		Scanner inp = new Scanner(System.in);
		
		dayOfWeek = inp.next();
		
		switch( dayOfWeek) {
		case("Monday"):
		case("monday"):
		case("Mon"):
			System.out.println("First day of the Week");
			break;
		case("Tuesday"):
			System.out.println("Second day of the Week");
			break;
		case("Wednesday"):
			System.out.println("Third day of the Week");
			break;
		case("Thursday"):
			System.out.println("Fourth day of the Week");
			break;
		case("Friday"):
			System.out.println("Weekend is almost here");
			break;
		case("Saturday"):
			System.out.println("First day of the Weekend");
			break;
		case("Sunday"):
			System.out.println("Phew, where did the weekend go?");
			break;
		default:
			System.out.println("This is not a valid day");
		}	
		
		int choice = inp.nextInt();
		switch( choice ) {
		case(1):
			//find volume of cube
			break;
		case(2):
			//find volume of sphere
			break;
		default:
			System.out.println("Invalid option");
			break;
			
		}
		//Do a switch case to create a simple calculator.
		//Ask user to give two integer inputs.
		//Then ask the user to give an operator +, -, /, *, or %
		//Based on operator given, display result. If invalid, tell user it is an invalid option

	}

}
