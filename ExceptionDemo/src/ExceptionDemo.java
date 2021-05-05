import java.util.Scanner;
import java.util.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter two integers separated by space");
		
		try {
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		
		int q = calcQuotient(num1, num2);
		System.out.println("Quotient " + q);
		
		int [] num = new int[3];
		System.out.println(num[3]);
		
		}
		catch(ArithmeticException ex) {
			System.out.println("Error: Division by zero");
			System.out.println(ex.getMessage());
		}
		catch(InputMismatchException ex) {
			System.out.println("Error: Must be integer");
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("We will now close the program");
		}
	}
	public static int calcQuotient(int n1, int n2) {
		if (n2 == 0) {
			throw new ArithmeticException("Denominator of quotient is zero");
			
			/*Alternative:
			System.out.println("Denominator can't be 0");
			//System exit stops program before reaching return
			System.exit(1);*/
			
		}
		return n1/n2;
	}
}
