
public class SwapGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr1 = {44, 33};
		printArr(arr1);
		swapGen(arr1);
		printArr(arr1);
		
		Double [] arr2 = {4.4, 3.3};
		printArr(arr2);
		swapGen(arr2);
		printArr(arr2);
		
		String [] arr3 = {"CSIS3101", "CSIS2101"};
		printArr(arr3);
		swapGen(arr3);
		printArr(arr3);
		
		//Integer[] arr4 = {1,2,3,4,5};
	}
	
	public static <E> void swapGen(E [] arr) {
		E temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	
	public static <E> void printArr(E [] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

}
