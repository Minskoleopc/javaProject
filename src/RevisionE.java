
class PersonO {
//	int age = 10;
//	String fullName = "sarika pansare";
	
	int age;
	String fullName;
	static String country  = "India";
	
	public PersonO(int ag , String fn){
		this.age = ag;
		this.fullName = fn;
	}
	
	public void walk() {
		System.out.println("I am walking");
		System.out.println(this.fullName);
	}
	
	public static void Cal() {
		System.out.println("I can be called without object");
	}
	
	
	
	
}




public class RevisionE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// with constructor
//		PersonO sarikaP = new PersonO();
//		PersonO sarikaK = new PersonO();
		
		// with call constructor
		PersonO sarikaP = new PersonO(34,"Sarika K");
		PersonO sarikaPa = new PersonO(34,"Sarikaa O");
		
		System.out.println(sarikaPa.age);
		System.out.println(sarikaPa.fullName);
		
		sarikaPa.walk();
		PersonO.Cal();
		System.out.println(PersonO.country);
		
		// Inheritance 
		// Polymorphism 
		// Abstraction 
		// Interface 
		// Access modifiers
		
		
	}
	

}
