import java.util.Scanner;
public class phoneChargeMathew {

	public static double main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		double p = 0.12;
		System.out.print("Number of minutes on mobile phone: ");
		int min = inp.nextInt();
		double charge = 0.00;
		if (min < 60) {
		charge += (double)min * 0.5;
			if (min > 10) {
				charge += (double)(min - 10) * 0.25;
		}
			if (min > 20) {
				charge += (double)(min - 20) * 0.2;
		}
			if (min > 40) {
				charge += (double)(min - 40) * 0.1;
		}
			return charge;
		}
		else {
			return ((double)min) * p;
			
		}
	}

}
