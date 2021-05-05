import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter positive int: ");
		Scanner inp = new Scanner(System.in);
		
		int num = inp.nextInt();
		
		int result = fibonacci(num);
		
		System.out.println("Fibonacci of: " + num + " equals: " + result);
		
		int result2 = fibonacciNR(num);
		
		System.out.println("Non-recursive result: " + result2);
		
		
	}
	
	public static int fibonacci(int k) {
		if(k == 0)
			return 0;
		else if(k == 1)
			return 1;
		else
			return fibonacci(k - 1) + fibonacci(k - 2);
	}
//Find non-recursive solution to fibonacci problem
	public static int fibonacciNR(int k) {
		if (k == 0)
			return 0;
		else {
			int start = 0;
			int mid = 1;
			int finish = start + mid;
			for (int j = 2; j < k; j++) {
				start = mid;
				mid = finish;
				finish = start + mid;
			}
			return finish;
		}
	}
}
