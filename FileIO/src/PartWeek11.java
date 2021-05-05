import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
public class PartWeek11 {

	//Read an input file which contains first name, last name. Create a user id. Its first Alphabet of the first
		//Name + Last name(Only 4 alphabets of last name). Username cannot be greater than 5 characters.
		//If Last name is less than 4 alphabets, use the whole line.
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File iFile = new File("newnames.txt");
		if(!iFile.exists()) {
			System.out.println("File DNE");
			System.exit(1);
		}
		Scanner fInp = new Scanner(iFile);
		
		File oFile = new File("idgen.txt");
		if(oFile.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter fOutp = new PrintWriter(oFile);
		
		while(fInp.hasNext()) {
			String fName = fInp.next();
			String lName = fInp.next();
			
			String userId = fName.charAt(0) + "";
			for (int i = 0; i < lName.length() && i < 4; i++)
				userId += lName.charAt(i);
			/*Can also use:
			 if (lName.length() < 4)
			     lName.substring(0,4);
			 userID += lName;*/
			fOutp.println(userId.toLowerCase());
			
		}
		
		fInp.close();
		fOutp.close();
		
		System.out.println("File Complete");
	}
}
