import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask the user for input in Fahrenheit
		
		System.out.print("Please input temperature in Fahrenheit: ");
		Scanner inp = new Scanner( System.in);
		
		double fahr = inp.nextDouble();
		//avoid fractions that automatically convert to integer (5/9)
		double celsius = (fahr - 32 ) * (5.0/9.0);
		
		System.out.println("Fahrenheit " + fahr + " in Celsius is: " + celsius);
		//integer overflow
		int value = 2147483647 + 1;
		System.out.println(value);
		
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1);
		
		System.out.println(1.0 - 0.9);
		//avoid redundant inputs
		inp.close();
	}

}
