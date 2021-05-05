
public class GORectangle extends GeometricObject {
	
	private double length;
	private double width;
	
	GORectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	GORectangle( double l, double w, String clr, double fld){
		super(clr, fld); //call inherited parent object constructor; Must be first statement in constructor
		this.length = l;
		this.width = w;
		
		/*setColor(clr);
		setFilled(fld);*/
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	//Typically, choose one form or the other
	public double calcArea() {
		return length * width;
	}
	
	public double calcPerimeter() {
		double peri = 2 * (length + width);
		return peri;
	}
	
	//Overrides parent object
	public String toString() {
		String gorStr = "";
		gorStr += super.toString();
		gorStr += "Length of Rectangle: " + length + "\t Width of Rectangle: " + width + "\n";
		return gorStr;
	}

}
//Create a class called GOSquare which incherits from Rectangle.
//You can define your own rules on how attributes and methods are
//Have constructor and toString method
//Use instance in GOMain and calculate area and perimeter of rectangle