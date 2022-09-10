
public class ConstructorP {


	private ConstructorP(){
		System.out.println("private constructor is called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorP  q1 = new ConstructorP();
		Pc q2 = new Pc();

		// constructor  is always there
		// constructor with default parameter 
		// constructor with parameter 
		// we can overload the constructor 
		// constructor  are always similar to class name 
		// constructor explictly does not return anything
		// constructor are used to run code or intialise properties at the time of object creation
	}

}

class Pc {
	
	Pc() {
		System.out.println("constructor is private cannot be called outside class");
	}
	
}
