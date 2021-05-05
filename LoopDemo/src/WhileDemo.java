import java.util.Scanner;
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 1;
		
		while(counter <= 2) {
			System.out.println("Welcome to Java");
			counter++;
		}

		int x = 1;
		
		do {
			System.out.println("Welcome to JAVA");
			x++;
		} while(x <= 2);
		
		int sum = 0;
		double average = 0;
		int count = 0;
		
		System.out.println("Please enter score as an integer: ");
		Scanner inp = new Scanner(System.in);
		
		int score = inp.nextInt();
		
		
		while(score > 0) {
			count++;
			sum += score;
			System.out.println("Please enter score as an integer: ");
			
			score = inp.nextInt();
		
		}
		
		System.out.println("Total sum of scores: " + sum);
		
		//avoid division by zero
		if(count != 0) {
			average = (double) sum / count;
		}
		
		System.out.println("Average of scores: " + average);
		
	}

}
