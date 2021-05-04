
public class AppendArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[10];
		
		int[] arr2 = new int [7];
		
		/* Fill array1 with first 10 odd numbers starting with 1
		 *Fill array2 starting with 10 random numbers between 1 and 99 (including 99)
		 *Create a function appendArray which appends arr2 at the end of arr1.
		 */
		
		for(int j = 0; j < arr1.length; j++)
			arr1[j] = 2 * j + 1;
		
		for(int k = 0; k < arr2.length; k++)
			arr2[k] = (int)(1 + 99 * Math.random());
		
		printArray(arr1);
		printArray(arr2);
		
		int[] appendArray = new int[arr1.length + arr2.length];
		
		/*for(int m = 0; m < arr1.length; m++)
			appendArray[m] = arr1[m];
		
		for(int n = 0; n < arr2.length; n++)
			appendArray[arr1.length + n] = arr2[n];*/
		
		System.arraycopy(arr1, 0, appendArray, 0, arr1.length);
		System.arraycopy(arr2, 0, appendArray, arr1.length, arr2.length);
		
		printArray(appendArray);
		

	}
	
	public static void printArray(int [] arr) {
		for( int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}
