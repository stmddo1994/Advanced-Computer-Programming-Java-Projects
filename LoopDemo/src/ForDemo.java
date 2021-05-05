
public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i <= 10; i = i + 2) {
			sum += i;
			System.out.println("i = " + i + " Sum: " + sum);
		}
		System.out.println("Sum " + sum);
		
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if (i + j == 5) {
					System.out.print("b");
					break;
				}
				System.out.print(i + j);
			}
			System.out.println("");
		}
	}

}
