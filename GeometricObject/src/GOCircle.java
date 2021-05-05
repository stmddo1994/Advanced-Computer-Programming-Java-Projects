
public class GOCircle extends GeometricObject {
	private double radius;
	
	GOCircle(){
		radius = 1.0;
	}
	
	GOCircle(double rad, String clr, double fd){
		super(clr, fd);
		this.radius = rad;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	
	public double calcCircumference() {
		double circumference = Math.PI * 2.0 * radius;
		return circumference;
	}
	
	public String toString() {
		String gocStr = super.toString();
		gocStr += "Radius of Circle: " + radius + "\n";
		return gocStr;
	}
}
