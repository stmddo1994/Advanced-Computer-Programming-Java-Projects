//Create an abstract album class based on your midterm exam
//Two concrete child classes created from album; Make price comparison in main
//You can have both child classes in same file as Album

public abstract class Album {
	public abstract String artist();
	public abstract String title();
	public abstract int billboardrank();
	public abstract String date();
	public abstract String genre();
}

class Child1 extends Album{
	public String artist() {
		return "Elton John";
	}
	public String title() {
		return "Rocket Man";
	}
	public int billboardrank() {
		return 6;
	}
	public String date() {
		return "1972 April";
	}
	public String genre() {
		return "Rock";
	}
}

class Child2 extends Album{
	public String artist() {
		return "Coolio";
	}
	public String title() {
		return "Gangsta's Paradise";
	}
	public int billboardrank() {
		return 2;
	}
	public String date() {
		return "1995 September";
	}
	public String genre() {
		return "Rap/Hip Hop";
	}
}