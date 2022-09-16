abstract class Greet {
	
	// we cannot create object of abstract class
	// We cannot create object of class with abstract method
	
	public void display() {
		System.out.println("Good Morining !");
	}
	
	
}

public class AbstractOne extends Greet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractOne one = new AbstractOne();
		one.display();
				
	
	}

}
