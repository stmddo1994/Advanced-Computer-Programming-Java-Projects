import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
public class Replace {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File iFile = new File("source.txt");
		if(!iFile.exists()) {
			System.out.println("File DNE");
			System.exit(1);
		}
		Scanner fInp = new Scanner(iFile);
		
		File oFile = new File("target.txt");
		if(oFile.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter fOutp = new PrintWriter(oFile);
		
		while(fInp.hasNext()) {
			String s1 = fInp.nextLine();
			String s2 = s1.replaceAll("the", "a");
			fOutp.write(s2 + "\n");
		}
		
		
		fInp.close();
		fOutp.close();
	}

}
