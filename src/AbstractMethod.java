abstract class Plants {
	
	// abstract method , they will not have body 
	// a simple  class can have abstract as will as normal method
	// make class abstract if there is one abstract method
	
		// abstract 
		abstract void eat();
		
		// normal method
		public void gives() {
			System.out.println("Gives us oxygen");
		}
	
}

class Bamboo extends Plants {
	
	public void eat() {
		System.out.println("I eat sun light ");
	}
	
	
}

public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bamboo b = new Bamboo();
		b.gives();
		b.eat();

	}

}
