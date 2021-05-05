public class CustomExceptionMain{
	
	public static void main(String[] args) throws InvalidInputException{
		// TODO Auto-generated method stub
		try {
			Circle c1 = new Circle();
			Circle c2 = new Circle(1.5);
			Circle c3 = new Circle(-2.0);
	
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c2.calcArea());
	
			System.out.println(c3);
			System.out.println(c3.calcArea());
		}
	
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	
	}
}