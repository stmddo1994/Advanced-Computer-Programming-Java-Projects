import java.net.URL;
import java.util.Scanner;
public class URLReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URLString = "http://liveexample.pearsoncmg.com/data/Lincoln.txt";
		
		try {
			URL url = new URL(URLString);
			int count = 0;
			Scanner inp = new Scanner(url.openStream());
			while(inp.hasNext()) {
				String line = inp.nextLine();
				count += line.length();
			}
			System.out.println("File size is " + count + " characters.");
			inp.close();
		}
		
		catch(java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		

	}

}
