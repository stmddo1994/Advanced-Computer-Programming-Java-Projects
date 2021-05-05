
public class GoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeometricObject go1 = new GeometricObject();
		System.out.println(go1);
		
		GeometricObject go2 = new GeometricObject("blue", 1.0);
		System.out.println(go2);
		
		GORectangle gor1 = new GORectangle();
		System.out.println(gor1);
		
		GORectangle gor2 = new GORectangle(3.3, 2.2, "red", 0.75);
		System.out.println(gor2);
		
		System.out.println("Area of rectangle: " + gor2.calcArea());
		System.out.println("Perimeter of rectangle: " + gor2.calcPerimeter());
		
		GOCircle goc1 = new GOCircle();
		System.out.println(goc1);
		
		GOCircle goc2 = new GOCircle(1.9, "yellow", 0.5);
		System.out.println(goc2);
		System.out.println("Area: " + goc2.calcArea());
		System.out.println("Circumference: " + goc2.calcCircumference());
		
		GOTriangle got1 = new GOTriangle();
		System.out.println(got1);
		
		GOTriangle got2 = new GOTriangle(2.0, 3.0, 4.0, "purple", 0.81);
		System.out.println(got2);
		System.out.println("Perimeter of triangle: " + got2.calcPerimeter());
		System.out.println("Area of triangle: " + got2.calcArea());
		
		displayArea(go1);
		displayArea(gor2);
		displayArea(goc2);
		displayArea(got2);
		
		int comp = compareArea(new GOCircle(1.0, "Green", 0.0), 
				new GORectangle(3.14159, 1, "Black", 1.0));
		
		if(comp == 0)
			System.out.println("Areas equal");
		else if (comp == 1)
			System.out.println("First object greater");
		else
			System.out.println("First object lesser");
		
		GOSquare gos1 = new GOSquare();
		System.out.println(gos1);
		
		GOSquare gos2 = new GOSquare(3.5, "Pink", 0.5);
		System.out.println(gos2);
		
		System.out.println("Area of square: " + gos2.calcArea());
		System.out.println("Perimeter of square: " + gos2.calcPerimeter());
		
		System.out.println("Same Area? " + equalArea(gor2, got2));
	}
	
	
	public static void displayArea(GeometricObject o1) {
		System.out.println(o1.calcArea());
	}
	
	
	public static int compareArea(GeometricObject o1, GeometricObject o2) {
		System.out.println(o1.calcArea());
		System.out.println(o2.calcArea());
		if(o1.calcArea() > o2.calcArea())
			return 1;
		else if(o1.calcArea() < o2.calcArea())
			return -1;
		else
			return 0;
	}
	
	public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
		return object1.calcArea() == object2.calcArea();
	}

}
