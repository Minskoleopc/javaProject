class Language {
	
	public void displayInfo() {
		System.out.println("Common programming language");
	}
}

class Java extends Language {
	
	@Override
	public void displayInfo() {
		System.out.println("Java language");
		super.displayInfo();
	}
	
}



public class Overiding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java java = new Java();
		java.displayInfo();

	}

}
