
class Pattern {
	
	public void display() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("*");
		}
	}
	public void display(char symbol) {
		System.out.println("");
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(symbol);
		}
	}
	
}



public class OverLoading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern d1 = new Pattern();
		d1.display();
		d1.display('#');
	
	}

}
