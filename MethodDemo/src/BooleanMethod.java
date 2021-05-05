import java.util.Scanner;
public class BooleanMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter integer: ");
		Scanner inp = new Scanner(System.in);
		
		int num = inp.nextInt();
		
		boolean odd = false;
		odd = isOdd(num);
		
		if (odd)
			System.out.println(num + " Is odd.");
		else
			System.out.println(num + " Is even.");

	}
	
	public static boolean isOdd(int n) {
		if(n%2 == 1)
			return true;
		else
			return false;
	}

}
