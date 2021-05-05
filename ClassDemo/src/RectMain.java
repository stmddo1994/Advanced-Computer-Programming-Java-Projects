
public class RectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating first rectangle object R1 using the no-arg constructor
		Rectangle R1 = new Rectangle();
		
		System.out.println("Length of R1: " + R1.getLength());
		System.out.println("Width of R1: " + R1.getWidth());
		
		R1.setLength(9.99);
		System.out.println("Length of R1: " + R1.getLength());
		
		System.out.println("Area of R1: " + R1.calcArea());
		System.out.println("Perimeter of R1: " + R1.calcPerimeter());
		
		//Creating second rectangle object R2 using the regular constructor
		Rectangle R2 = new Rectangle(1.5, 3.3);
				
		System.out.println("Length of R2: " + R2.getLength());
		System.out.println("Width of R2: " + R2.getWidth());
		
		System.out.println("Area of R1: " + R2.calcArea());
		System.out.println("Perimeter of R1: " + R2.calcPerimeter());
		
		System.out.println(R1);
		System.out.println(R2);
	}

}
