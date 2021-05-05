import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter positive int: ");
		Scanner inp = new Scanner(System.in);
		
		int num = inp.nextInt();
		
		int result = factorialNonRecursive(num);
		
		int result2 = factorial(num);
		
		System.out.println(result2);
		
		System.out.println("Factorial of: " + num + " equals: " + result);	
		
		
		
	}
	
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}
	
	public static int factorialNonRecursive(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}
}
