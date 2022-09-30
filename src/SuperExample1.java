class AnimalBa {
	
	public void display() {
		System.out.println("I am an animal class");
	}
	

}

class Dogaa extends AnimalBa{
	
	public void display() {
		System.out.println("I am from Dog class");
	}
	
	public void printMessage() {
		display();
		super.display();
	}
		
}


public class SuperExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dogaa a = new Dogaa();
		a.printMessage();
	}

}
