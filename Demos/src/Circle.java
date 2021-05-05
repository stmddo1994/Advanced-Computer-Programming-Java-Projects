import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		
		int radius, radius2;
		double area;
		
		System.out.println("Please enter the radius as an integer: ");
		Scanner inp = new Scanner( System.in);
		
		radius = 5;
		
		radius2 = inp.nextInt();
		
		area = PI * Math.pow(radius, 2);
		
		System.out.println( "The area of the circle with radius: " +  radius + " is: " + 
		                   area );
		
		double area2 = PI * radius2 * radius2;
		
		System.out.println( "The area of the circle with radius: " +  radius2 + " is: " + 
		                   area2 );
		
		double z = Math.pow(3, 4);
		System.out.println( z );
		
		System.out.println("1.0 / 3.0 is " + 1.0 / 3.0);
		
		System.out.println("1.0 / 3.0 is " + 1.0F / 3.0F );
		
		System.out.println("5 / 2 is " + 5 / 2 );
		
		System.out.println("5.0 / 2 is " + 5.0 /2 );
		
		System.out.println("1.23456e+2 is " + 1.23456e+2);


	}

}
