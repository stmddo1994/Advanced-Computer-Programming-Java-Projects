
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayInt = new int[10];
		
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;
		arrayInt[3] = 4;
		arrayInt[4] = 5;
		arrayInt[5] = 6;
		arrayInt[6] = 7;
		arrayInt[7] = 8;
		arrayInt[9] = 10;
		arrayInt[8] = 9;
		
		printArray(arrayInt);
		int sum1 = sumArray(arrayInt);
		System.out.println("Sum of arrayInt = " + sum1);
		
		int[] arrayInt2 = new int[6];
		for(int j = 0; j < arrayInt2.length; j++)
			arrayInt2[j] = j + 1;
		
		printArray(arrayInt2);
		int sum2 = sumArray(arrayInt2);
		System.out.println("Sum of arrayInt2 = " + sum2);
		
		int[] arrayInt3 = new int [20];
		for(int k = 0; k < arrayInt3.length; k++)
			arrayInt3[k] = (int)(Math.random() * 100);
		
		printArray(arrayInt3);
		int sum3 = sumArray(arrayInt3);
		System.out.println("Sum of arrayInt3 = " + sum3);
		int maxi = maxArray(arrayInt3);
		
		System.out.println("Max of arrayInt3: " + maxi);
		
		double [] dblArray = new double[10];
		for(int k = 0; k < dblArray.length; k++) {
			double val = (int)(Math.random() * 100);
			val = Math.round(val);
			dblArray[k] = val;
		}
		
		for( int i = 0; i < dblArray.length; i++)
			System.out.print(dblArray[i] + " ");
		System.out.println("");
		
		int[] intArray4 = {1,3,5,7,0,0};
		intArray4[4] = 9;
		intArray4[5] = 99;
		
		printArray(intArray4);
		

	}
	
	public static void printArray(int [] arr) {
		for( int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	public static int sumArray(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i ++) {
			total += arr[i];
		}
		return total;
	}
	public static int maxArray(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
