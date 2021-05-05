
public class TriMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle T1 = new Triangle();
		
		System.out.println(T1);
		
		System.out.println("Perimeter of T1: " + T1.calcPerimeter());
		System.out.println("Area of T1: " + T1.calcArea());

		T1.setS2(4);
		T1.setS3(4);
		
		System.out.println(T1);
		
		System.out.println("Perimeter of T1: " + T1.calcPerimeter());
		System.out.println("Area of T1: " + T1.calcArea());
		
		Triangle T2 = new Triangle(3, 4, 5);
		
		System.out.println(T2);
		
		System.out.println("Perimeter of T2: " + T2.calcPerimeter());
		System.out.println("Area of T2: " + T2.calcArea());
		
		Triangle T3 = new Triangle(3, 4, 8);
		
		System.out.println(T3);
		
		System.out.println("Perimeter of T3: " + T3.calcPerimeter());
		System.out.println("Area of T3: " + T3.calcArea());
		
		java.util.Date date = new java.util.Date();
		System.out.println(date.toString());
		
		Triangle[] TArray = {T1, T2, T3};
		
		for (int i = 0; i < TArray.length; i++)
			System.out.println(TArray[i].calcArea());
	}

}
