
class Animal {
	// field
	String name;
	
	// method
	public void eat() {
		System.out.println("I can eat all day");
	}
	
}

//  class
class Tiger extends Animal {
	
	
	// method
	public void display() {
		System.out.println("My name is "+name);
	}
	
	
}


public class InheritanceA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger shera = new Tiger();
		shera.name = "shera";
		shera.eat();
		shera.display();
	}
	
}






