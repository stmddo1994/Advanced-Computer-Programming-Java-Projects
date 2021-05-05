import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter three integers separated by space ");
		File iFile = new File("yourname.txt"); //Put your first name here.
		Scanner input = new Scanner( System.in);
		try {
		Scanner f = new Scanner( iFile );
		if(!iFile.exists()) {
			System.out.println("File DNE");
			System.exit(1);
		}
		
		while(f.hasNext()) {
		String a = input.next();
		String b = input.next();
		String c = input.next();
		String[] d = new String[4];
		
		d[0] = a;
		d[1] = b;
		d[2] = c;
		
		int i = Integer.parseInt(a) + Integer.parseInt(b)/Integer.parseInt(c);
		d[3] = Integer.toString(i);
		}
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
		//Finally this statement should be displayed even if it runs or errors out
		System.out.println("Program Executed");
		}
		

	}

}
