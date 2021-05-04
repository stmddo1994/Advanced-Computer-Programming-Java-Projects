
public abstract class Fruit implements Edible{

	//Attributes of fruit like shape, taste, type
}

class Orange extends Fruit{
	public String howToEat() {
		return "Make into Juice";
	}
}

class Apple extends Fruit{
	public String howToEat() {
		return "Make into Pie";
	}
}
