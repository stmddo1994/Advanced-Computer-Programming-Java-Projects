
public class FooFoo extends Foo{

	private int Mathew;
	
	FooFoo(){
		Mathew = 0;
	}
	
	FooFoo(int MD, String fS, int fI, double fD){
		super(fS, fI, fD);
		this.Mathew = MD;
	}

	public int getMathew() {
		return Mathew;
	}

	public void setMathew(int mathew) {
		Mathew = mathew;
	}
	
	public double calcFoo() {
		double parent = super.calcFoo();
		if (Mathew == 0)
			return 0;
		else
			return parent / Mathew;
	}
	
	public String toString() {
		String MDStr = "";
		MDStr += super.toString();
		MDStr += "Mathew = " + Mathew + "\n";
		return MDStr;
	}
}
