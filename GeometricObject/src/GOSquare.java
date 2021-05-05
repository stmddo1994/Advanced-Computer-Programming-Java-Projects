
public class GOSquare extends GORectangle{
	
	GOSquare(){
		super();
	}
	
	GOSquare(double s, String clr, double fld){
		super(s, s, clr, fld);
	}
	
	//Overrides parent object
	public String toString() {
		String gosStr = "";
		gosStr += super.toString();
		return gosStr;
	}

}