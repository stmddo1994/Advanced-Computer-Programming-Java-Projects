
public class EdibleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] frAndAn = {new Tiger(), new Chicken(), new Apple(), new Orange()};
		
		for(int i = 0; i < frAndAn.length; i++) {
			if (frAndAn[i] instanceof Edible) {
				System.out.println(((Edible) frAndAn[i]).howToEat());
			}
			if (frAndAn[i] instanceof Animal) {
				System.out.println(((Animal) frAndAn[i]).sound());
			}
		}

	}

}

