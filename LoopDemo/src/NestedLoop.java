
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i = 1; i <= 5; i++) {
			//if (i == 3)
				//continue;	
			for(int j = 1; j <= 10; j++) {	
				//if (j == 3)
					//break;	
				System.out.println("i=" + i + "\t" + "j=" + j + "\t" + "i*j=" + i * j);
			}
	}

}
}