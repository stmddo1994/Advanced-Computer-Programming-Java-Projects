
public class Circle {
	
	private double radius;
	
	Circle(){
		radius = 1.0;
	}

	Circle( double rad ) throws InvalidInputException{
		setRadius(rad);
	}
	
	public void setRadius(double rad) throws InvalidInputException{
		if (rad < 0)
			throw new InvalidInputException(rad);
		radius = rad;
	}
	
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return("Radius of Circle " + radius);
	}
}

