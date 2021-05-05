
public class InvalidInputException extends Exception{
	private String input;
	
	InvalidInputException(){
		input = "";
	}
	
	InvalidInputException(String inp){
		System.out.println("Invalid Input; You must put Yes, Y, No or N");
	}
	
	public String getInput() {
		return input;
	}
}
