
public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month = "Mar";
		
		switch( month )
	     {
	        case "Jan":
	        case "Feb":
	        case "Mar":
	            System.out.println("First Quarter");
	            break;
	        case "Apr":
	        case "May":
	        case "Jun":
	            System.out.println("Second Quarter");
	            break;
	        case "Jul":
	        case "Aug":
	        case "Sep":
	            System.out.println("Third Quarter");
	            break;
	        case "Oct":
	        case "Nov":
	        case "Dec":
	            System.out.println("Fourth Quarter");
	            break;
	        default:
	            System.out.println("Invalid Month");
	        }

	}

}
