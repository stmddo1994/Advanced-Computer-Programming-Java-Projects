import java.util.Scanner;

public class IEDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Please enter grade of a student: ");
		Scanner inp = new Scanner(System.in);
		
		int score = inp.nextInt();
		boolean lessThan = score < 60;
		if( lessThan == false)
			System.out.println("You pass");
		
		if( score >= 90 && score <= 100 )
			System.out.println("Grade is A");
		else if (score >= 80 && score < 90)
			System.out.println("Grade is B");
		else if (score >= 70 && score < 80)
			System.out.println("Grade is C");
		else if (score >= 60 && score < 70)
			System.out.println("Grade is D");
		else
			//Curly brackets used to keep in one else command
		{
			System.out.println("Grade is F");
		System.out.println("Retake course");
		}
		
		int num;
		System.out.println("Please enter integer: ");
		num = inp.nextInt();
		
		boolean even = (num % 2 == 0);
		
		/*if( num % 2 == 0)
			even = true;
		else
			even = false;*/
		
		if( even )
			System.out.println(num + " is even.");
		else
			System.out.println(num + " is odd.");
		
		//reverse all; "if not even" = !even
		
		int ver = 55;
		
		if (ver == 34)
				System.out.println("Ok");
		else {
			if (ver/5 == 11)
				System.out.println("Huzzah");
			else
				System.out.println("Oh well");
		}
		
	}

}
