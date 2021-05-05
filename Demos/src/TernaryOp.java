
public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 5;
		String comp;
		
		comp = x >= y ? "Greater or Equal": "Lesser";
		
		System.out.println(comp);
		
		int z = x != y ? 0 : 1;
		System.out.println(" z = " + z);

	}

}
