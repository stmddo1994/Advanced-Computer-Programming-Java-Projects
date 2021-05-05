import java.util.Scanner;
public class cookiesWeekMathew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int[] numbersold = new int[weekdays.length];
		int totalsold = 0;
		for (int i = 0; i < weekdays.length; i++) {
			System.out.print("Please enter the number of cookies sold on " + weekdays[i] + ": ");
			int num = inp.nextInt();
			numbersold[i] = num;
			totalsold += num;
		}
		System.out.print("Please enter the price of one packet: $");
		double price = inp.nextDouble();
		System.out.println("Total number of cookies sold is " + totalsold);
		System.out.print("Total sales for week: $" + (totalsold * price));
	}
	
}