public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		int y = 2;
		int z, z1;
		
		//Demo of shorthand operators. 
		
		x += 3; // x = 6
		x *= 3;
		x /= 2; // x = 3
		
		x %= 2; // x = 1
		
		//Increment operators
		x++; // x = 2
		System.out.println( x);
		x--; // x = 1
		
		z = y + x++;
		z1 = y + ++x;
		
		System.out.println( "x = " + x + " y = " + y + " z = " + z + " z1 = " + z1 );
		

	}

}