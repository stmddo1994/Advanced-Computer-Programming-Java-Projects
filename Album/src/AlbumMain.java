
public class AlbumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object [] Album = {new Child1(), new Child2()};
		
		double price = 100.00;
		
		for(int i = 0; i < Album.length; i++) {
			if (Album[i] instanceof Album) {
				System.out.println("Price of " + ((Album) Album[i]).title() + " by " + ((Album) Album[i]).artist() 
						+ " is $" + price / (double) ((Album) Album[i]).billboardrank());
			}
		}
	}

}
