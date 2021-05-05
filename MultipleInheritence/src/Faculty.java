
public class Faculty extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Faculty();
		
	}

	Faculty(){
		System.out.println("I am Faculty");
	}
	
		
}

class Employee extends Person {
	Employee(){
		this("Invoke Employees overloaded constructor");
		System.out.println("I am an employee");
	}
	Employee(String s){
		System.out.println(s);
	}
}

class Person{
	Person(){
		System.out.println("I am a person");
	}
}