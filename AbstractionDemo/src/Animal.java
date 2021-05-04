
public abstract class Animal {
	//You can add all attributes of animal
	public abstract String sound();
	
	

}

class Chicken extends Animal implements Edible{
	public String sound() {
		return "Buck bucaw!";
	}
	
	public String howToEat() {
		return "Fry in oil";
	}
}

class Tiger extends Animal {
	public String sound() {
		return "Roaaaarrr!";
	}
}