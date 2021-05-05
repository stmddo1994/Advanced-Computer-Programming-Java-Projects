
public class GeometricObject {

	private String color;
	private double filled; //Varies from 0 through 1
	private java.util.Date dateCreated;
	
	GeometricObject() {
		color = "white";
		filled = 0.0;
		dateCreated = new java.util.Date();
	}
	
	GeometricObject( String clr, double fld){
		dateCreated = new java.util.Date();
		this.color = clr;
		this.filled = fld;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getFilled() {
		return filled;
	}

	public void setFilled(double filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public double calcArea() {
		return 0.0;
	}

	public String toString() {
		String goStr = "created on " + dateCreated + " with color: " + color + " and transparancy: " + filled + "\n";
		return goStr;
	}
}
