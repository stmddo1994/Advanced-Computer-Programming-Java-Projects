import java.io.File;
import java.util.Scanner;

public class IOFinal {

	public static ArrayList<String> regnFn( String firstName, String lastName ){
		
		File iFile = new File("Registration.txt");
		if(!iFile.exists()) {
			System.out.println("File DNE");
			System.exit(1);
		}
		Scanner fInp = new Scanner(iFile);
		
		while(fInp.hasNext()) {
			firstName = fInp.next();
			lastName = fInp.next();
			regnFn(firstName, lastName)[] += fInp.next();
			
		}
		
		fInp.close();
	}
}
