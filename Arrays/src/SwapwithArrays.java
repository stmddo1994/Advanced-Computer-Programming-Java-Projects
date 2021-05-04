import java.util.Scanner;
public class SwapwithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter two integers separated by a space: ");
		
		Scanner inp = new Scanner(System.in);
		
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		
		int [] swapArr = {num1, num2};
		
		printArray(swapArr);
		
		swapArray(swapArr);
		printArray(swapArr);

	}
	public static void printArray(int [] arr) {
		for( int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	public static void swapArray(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
}
