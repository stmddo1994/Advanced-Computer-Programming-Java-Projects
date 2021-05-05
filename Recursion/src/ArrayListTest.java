
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {11, 23, 18, 8};
		
		int sum = recDoty(arr, arr.length - 1);
		
		System.out.println(sum);
	}
	
	public static int recDoty(int[] a, int ind) {
		if(ind == 0)
			return a[0];
		else {
			return a[ind] + recDoty(a, ind - 1);
		}
		
	}

}
