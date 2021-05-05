
public class PassbyValueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		int b = 4;
		
		System.out.println("a = " + a + " b = " + b);
		
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 5; j++) {
				System.out.println("Java is Good Pl");
			}
		}
		for(int i = 0; i <= 3; i++)
			System.out.println("But different from Python");
		//Can work, since it's a local variable, but a different variable is preferred
		
		swapNums( a, b );
		
		System.out.println("After Swapping - a = " + a + " b = " + b);
		
		

	}
	
	public static void swapNums( int x, int y) {
		int temp = x;
		
		x = y;
		y = temp;
		
		System.out.println("After Swapping - x = " + x + " y = " + y);
	}
}
//lotd1 = lotnum / 100
//(lotd2 = lotnum / 10 - (10 * lotd1))