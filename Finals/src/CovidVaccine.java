public abstract class CovidVaccine {
	
	protected String name;
	protected String company;
	protected String type;
	protected int numShots;
	protected int daysApart;
	
	CovidVaccine() {
		name = "Generic";
		company = "Unknown";
		type = "";
		numShots = 1;
		daysApart = 0;
	}
	
	CovidVaccine( String n, String c, String t, int nos ) {
		name = n;
		company = c;
		type = t;
		numShots = nos;
		daysApart = 0;
	}
	
	public int getNumShots() {
		return numShots;
	}
	
	public void setNumShots(int numShots) {
		this.numShots = numShots;
	}
	
	public abstract double priceOfVaccination(  );
	
	public String toString() {
		String covStr = "";
		covStr += name + " Covid Vaccine developed by " + company + "\n" +
				" Inc. uses a vaccine of type " + type + " needs " + numShots + " shot(s) ";
		String daysApartStr = numShots == 1? ".": daysApart + " days Apart.";
		
		return covStr + daysApartStr;
	}	
	
}

class Moderna extends CovidVaccine{
	public double dosage;
	
	Moderna(){
		name = "Moderna";
		company = "Moderna,NIAID";
		type = "mRNA";
		numShots = 2;
		daysApart = 28;
		dosage = 0.5;
	}
	
	Moderna(double dos){
		this.dosage = dos;
	}
	
	public double priceOfVaccination() {
		if (dosage > 0.5) {
			return 100.0 * dosage * numShots;
		}
		else if (dosage < 0.5) {
			return 50.0 * dosage * numShots;
		}
		else
			return 75.0 * dosage * numShots;
	}
	
	public String toString() {
		String covStr = "";
		covStr += name + " Covid Vaccine developed by " + company + "\n" +
				" Inc. uses a vaccine of type " + type + " needs " + numShots + " shot(s) ";
		String daysApartStr = numShots == 1? ".": daysApart + " days Apart.";
		
		return covStr + daysApartStr;
	}
	
}

class Mathew extends CovidVaccine{
	
	public String ageType;
	
	Mathew(){
		name = "Moderna";
		company = "Moderna,NIAID";
		type = "mRNA";
		numShots = 2;
		ageType = "Adult";
	}
	
	Mathew(String age){
		if (age != "Adult" && age != "Teen" && age != "Senior")
			this.ageType = "Adult";
		else
			this.ageType = age;
	}
	
	
	public double priceOfVaccination() {
		if (ageType == "Teen") {
			return 40.0 / ((double)numShots);
		}
		else if (ageType == "Senior") {
			return 20.0 / ((double)numShots);
		}
		else
			return 75.0 / ((double)numShots);
	}
	
	public String toString() {
		String covStr = "";
		covStr += name + " Covid Vaccine developed by " + company + "\n" +
				" Inc. uses a vaccine of type " + type + " needs " + numShots + " shot(s) ";
		String daysApartStr = numShots == 1? ".": daysApart + " days Apart.";
		
		return covStr + daysApartStr;
	}
	
}