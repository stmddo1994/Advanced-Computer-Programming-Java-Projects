
//Class Rectangle
public class Rectangle {
	
	//Attributes or data
	private double length;
	private double width;
	
	//Constructors
	//No arg constructor
	Rectangle() {
		length = 1.0;
		width = 1.0;
	}
	
	//Argument Constructor
	Rectangle(double l, double w){
		length = l;
		width = w;
	}
	
	//Accessors/Get Methods
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	//Mutators/Set Functions
	public void setLength(double len) {
		length = len;
	}
	
	public void setWidth(double wid) {
		width = wid;
	}
	
	//Operations or Methods on the class
	public double calcArea() {
		double area = length * width;
		return area;
	}
	
	public double calcPerimeter() {
		double peri = 2.0 * (length + width);
		return peri;
	}
	
	public String toString() { //__str__(self)
		
		String rString = "";
		rString += "Length: " + length + "\n";
		rString += "Width: " + width + "\n";
		
		return rString;
	}

}
