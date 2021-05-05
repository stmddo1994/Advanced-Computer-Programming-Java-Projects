
public class InvalidInputException extends Exception{
	private double input;
	
	InvalidInputException(){
		input = 0;
	}
	
	InvalidInputException(double inp){
		System.out.println("Invalid Input; Input cannot be negative" + inp);
	}
	
	public double getInput() {
		return input;
	}
}
