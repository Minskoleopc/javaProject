
public class ConstructorS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// what is constructor
		// Creating a object for class
		Add a = new Add();
		a.Addition();

	}

}

class Add{
	
	int a = 10;
	int b = 20;	
	
	public void Addition() {
		System.out.println(this.a + this.b);
	}
		
}
