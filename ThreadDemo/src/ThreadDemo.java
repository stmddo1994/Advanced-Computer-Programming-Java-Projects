
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print100 = new PrintNum(100);
		
		Thread t1 = new Thread(printA);
		Thread t2 = new Thread(printB);
		Thread t3 = new Thread(print100);
		
		t3.start();
		t1.start();
		t2.start();
	}

}

class PrintChar implements Runnable{
	private char charToPrint;
	private int times;
	
	PrintChar(char c, int t){
		charToPrint = c;
		times = t;
	}
	
	public void run() {
		for (int i = 0; i < times; i++)
			System.out.print(charToPrint);
	}
}

class PrintNum implements Runnable{
	private int num;
	
	PrintNum(int n){
		num = n;
	}
	
	public void run() {
		for (int i = 1; i <= num; i++)
			System.out.print(i);
	}
}
