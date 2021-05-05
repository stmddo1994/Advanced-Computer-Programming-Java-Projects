
public class Album {

	private String artist;
	private String title;
	private int billboardrank;
	private String date;
	private String genre;
	
	Album(){
		artist = "John";
		title = "jd1234";
		billboardrank = 5;
		date = "2020 December";
		genre = "holiday";
	}
	
/*	Album A1 = new Album;
	artist = "Mathew";
	title = "md2689";
	system.out.println(A1);*/
	
public String toString() { 
		
		String rString = artist + "released an album called " + title + 
				" in " + date + " as a " + genre + " album and was Number " + billboardrank + " on the Billboard Chart";
		return rString;
}

public double calcSpotifyprice(double pr) {
	double price = pr/(double) billboardrank;
	return price;
}
}
