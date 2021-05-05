
public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		int j = 4;
		int k = 9;
		
		System.out.println(max(i, j, k));
		
		double x = 3.3;
		double y = 4.4;
		
		System.out.println(Math.max(i, j));
		
		int res1 = add(i,j);
		
		double res2 = add(x,y);
		
		System.out.println("Result 1 Int: " + res1);
		
		System.out.println("Result 1 Doub: " + res2);

	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b;
	}
	public static int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
	
	public static int compare(int i, int j) {
		
		int result = -1;
		
		if(i > j)
			result = 1;
		else if (i < j)
			result = -1;
		else if (i == j)
			result = 0;
		
		return result;
	}
}
