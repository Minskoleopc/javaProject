class FinalMethodDemo{
	
	int numberA = 10;
	
	public final void display() {
		System.out.println("Hello I  from FinalMethodDemo");
	}
		
}

public class FinalB  extends FinalMethodDemo{
	
	// you cannot override the method define with Final keyword
	
//	public void display() {
//		System.out.println("I am FinalB class");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Final Method
		
		FinalB a = new  FinalB();
		a.display();
		System.out.println(a.numberA);
	}

}
