import java.util.Scanner;

public class RectangleReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter length and width, seperate with space");
		
		double length, width;
		
		Scanner inp = new Scanner(System.in);
		
		length = inp.nextDouble();
		
		width = inp.nextDouble();
		
		double area = calcArea(length, width);
		System.out.println("Area of rectangle: " + area);
		
		double peri = calcPerimeter(length, width);
		System.out.println("Perimeter of rectangle: " + peri);
		
		

	}
	public static double calcArea( double len, double wid) {
		double area = len * wid;
		return area;
	}
	public static double calcPerimeter(double le, double wi) {
		double perimeter = 2.0 * (le + wi);
		return perimeter;
	}

}
