import java.util.Scanner;
public class CharacterOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a string: ");
		
		Scanner inp = new Scanner(System.in);
		int dCount = 0;
		
		String phrase = inp.next();
		
		for(int i = 0; i < phrase.length(); i++)
			if (Character.isDigit(phrase.charAt(i)))
				dCount++;
		
		System.out.println("Number of digits in the phrase: " + dCount );
		
		System.out.printf("%3d # %2s # %4.2f\n", 1234, "java", 51.6663);
		
		double val = Double.parseDouble(phrase);
		
		System.out.println(val);
		
		print();
		
	}
	
	public static void print() {
		System.out.println("Print method example");
	}

}
