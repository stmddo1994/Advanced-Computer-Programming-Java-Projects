import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
public class FileReadNumbers {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File iFile = new File("numbers.txt");
		if(!iFile.exists()) {
			System.out.println("File DNE");
			System.exit(1);
		}
		Scanner fInp = new Scanner(iFile);
		
		File oFile = new File("Avg.txt");
		if(oFile.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter fOutp = new PrintWriter(oFile);
		int count = 0;
		int sum = 0;
		while(fInp.hasNext()) {
			count++;
			int num = fInp.nextInt();
			sum += num;
		
		}
		System.out.println(sum);
		double average = 0;
		if(count == 0)
			average = 0;
		else
			average = (double)sum/count;
		fOutp.println("Average of numbers is " + average);
		
		fInp.close();
		fOutp.close();
	}
	

}
