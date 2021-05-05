//paricipation for Week 06
public class Triangle {
	private int s1;
	private int s2;
	private int s3;
	
	//Continue with class, write two constructors
	//One with default values
	//Another with passed in values
	//Do gets and sets
	//Do operations calcArea and calcPerimeter and toString
	//Area = sqrt(s(s-a)(s-b)(s-c))
	//s = semi perimeter (s1 + s2 + s3) / 2
	//Or call calcPerimeter function and divide by 2
	//Create main and test your class
	
	Triangle() {
		s1 = 1;
		s2 = 1;
		s3 = 1;
	}
	
	Triangle(int sd1, int sd2, int sd3){
		//validate input
		if ((sd1 + sd2 >= sd3) && (sd1 + sd3 >= sd2) && (sd2 + sd3 >= s1)) {
			this.s1 = sd1;
			this.s2 = sd2;
			this.s3 = sd3;
		}
		else {
			System.out.println("Invalid triangle: Sum of 2 sides must be greater than third.");
			s1 = 1;
			s2 = 1;
			s3 = 1;
		}
	}
	
	public int getS1() {
		return s1;
	}
	
	public int getS2() {
		return s2;
	}
	
	public int getS3() {
		return s3;
	}
	
	public void setS1(int Side1) {
		s1 = Side1;
	}
	
	public void setS2(int Side2) {
		s2 = Side2;
	}
	
	public void setS3(int Side3) {
		s3 = Side3;
	}
	
	public int calcPerimeter() {
		int peri = s1 + s2 + s3;
		return peri;
	}
	
	public double calcArea() {
		double s = (((double)calcPerimeter()) / 2.0);
		double area = Math.sqrt(s * (s - (double)(s1)) * (s - (double)(s2)) * (s - (double)(s3)));
		return area;
	}
	
	public String toString() {
		
		String rString = "";
		rString += "Side a: " + s1 + "\n";
		rString += "Side b: " + s2 + "\n";
		rString += "Side c: " + s3;
		
		return rString;
	}
}
