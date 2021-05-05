
public class GOTriangle extends GeometricObject{
	private double s1;
	private double s2;
	private double s3;
	
	GOTriangle(){
		s1 = 1.0;
		s2 = 1.0;
		s3 = 1.0;
	}
	
	GOTriangle(double a, double b, double c, String clr, double fld){
		super(clr, fld);
		this.s1 = a;
		this.s2 = b;
		this.s3 = c;
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}
	
	public double calcPerimeter() {
		double peri = s1 + s2 + s3;
		return peri;
	}
	
	public double calcArea() {
		double s = ((calcPerimeter()) / 2.0);
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		return area;
	}
	
	public String toString() {
		String gotStr = "";
		gotStr += super.toString();
		gotStr += "Length of side a: " + s1 + "\t Length of side b: " + s2 + "\t Length of side c: " + s3 + "\n";
		return gotStr;
	}

}
