import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
public class FileReadDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File iFile = new File("names.txt");
		if(!iFile.exists()) {
			System.out.println("File DNE");
			System.exit(1);
		}
		Scanner fInp = new Scanner(iFile);
		
		File oFile = new File("userID.txt");
		if(oFile.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter fOutp = new PrintWriter(oFile);
		
		while(fInp.hasNext()) {
			String fName = fInp.next();
			String lName = fInp.next();
			int age = fInp.nextInt();
			
			System.out.println("FirstName: "+ fName + " LastName: " + lName);
			String userId = fName.charAt(0) + lName;
			System.out.println(userId);
			
			fOutp.println(userId + age);
		}
		
		fInp.close();
		fOutp.close();
	}

}
