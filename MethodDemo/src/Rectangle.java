import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter length and width, seperate with space");
		
		double length, width;
		
		Scanner inp = new Scanner(System.in);
		
		length = inp.nextDouble();
		
		width = inp.nextDouble();
		
		calcArea(length, width);
		calcPerimeter(length, width);
		
		

	}
	public static void calcArea( double len, double wid) {
		double area = len * wid;
		System.out.println("Area of rectangle: " + area);
	}
	public static void calcPerimeter(double le, double wi) {
		double perimeter = 2.0 * (le + wi);
		System.out.println("Perimeter of rectangle: " + perimeter);
	}

}
