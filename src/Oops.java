
public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String 
		// Array 
		// Int
		// Boolean
		// Object 
		
		
		Person amol = new Person();
		// accessing the fields
		System.out.println(amol.height);
		System.out.println(amol.weight);
		System.out.println(amol.age);
		
//		// calling the method on object
		amol.walk();
		amol.talk();
		
		// Person ---- height weigh age , method walk(), talk()
		
		Person sarika = new Person();
		// access the fields
		System.out.println(sarika.weight);
		System.out.println(sarika.height);
		System.out.println(sarika.age);
//		// methods 
		sarika.walk();
		sarika.talk();
		
		
		System.out.println(sarika.age);
		sarika.age = 30;
		System.out.println(sarika.age);
		System.out.println(amol.age);
		
			
		
	}
	
}

class Person {
	
 // property and methods 
 // fields and method

// fields
 int height = 5;
 int weight =10;
 int age = 20;
 
 // methods 
 
 public static void talk() {
	 System.out.println("Hello I am talking");
 }
 
 public static void walk() {
	 System.out.println("I am walking");
 }
	
	
}