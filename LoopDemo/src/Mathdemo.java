
public class Mathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i + " Sqrt of i = " + Math.sqrt(i));
			
			//for rounding: ceil(x) (round up); floor(x) (round down); 
			//rint(x) (integer); round(x, #) (decimal place)
			//max(x); min(x); random(x) (Double between 0 to 1)
			
			System.out.println(Math.random());
			
			//How to convert into integer especially within a range
			
			//A dice problem
			int diceSide = (int)(1 + 6 * Math.random());
			
			System.out.println("Side of Dice = " + diceSide);
		}
		
			char p = (int) 98.25;
			System.out.println(p);
			
			int k = (int) 'A';
			System.out.println(k);
	}

}
