import java.util.Scanner;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter two integers separated by space: ");
		Scanner inp = new Scanner(System.in);
		
		Integer num1 = inp.nextInt();
		Integer num2 = inp.nextInt();
		
		boolean eq = equals(num1, num2);
		
		if(eq)
			System.out.println(num1 + " equals " + num2);
		else
			System.out.println(num1 + " does not equal " + num2);
		
		System.out.print("Please enter two float or double values separated by space: ");
		
		Double d1 = inp.nextDouble();
		Double d2 = inp.nextDouble();
		
		eq = equals(d1, d2);
		
		if(eq)
			System.out.println(d1 + " equals " + d2);
		else
			System.out.println(d1 + " does not equal " + d2);
		
		String s1 = "CSIS3101";
		String s2 = "CSIS2101";
		eq = equals(s1, s2);
		
		if (eq)
			System.out.println(s1 + " equals " + s2);
		else
			System.out.println(s1 + " does not equal " + s2);
		

	}
	
	public static <E> boolean equals(E a1, E a2) {
		if (a1.equals(a2))
			return true;
		else
			return false;
		
	}
	
}
