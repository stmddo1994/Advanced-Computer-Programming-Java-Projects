
public class Circle {
	
	private double radius;
	
	Circle(){
		radius = 1.0;
	}

	Circle( double rad ){
		setRadius(rad);
	}
	
	public void setRadius(double rad) throws IllegalArgumentException{
		if (rad < 0)
			throw new IllegalArgumentException("Radius cannot be zero");
		else
			radius = rad;
	}
	
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return("Radius of Circle " + radius);
	}
}


/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
	Circle c1 = new Circle();
	Circle c2 = new Circle(1.5);
	Circle c3 = new Circle(-2.0);
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c2.calcArea());
	
	//System.out.println(c3);
	//System.out.println(c3.calcArea());
	}
	
	catch(IllegalArgumentException ex) {
		System.out.println(ex.getMessage());
	}
	
}*/
