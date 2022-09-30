class WorldB {
	
	// overriding
	public void loan() {
		System.out.println("I am loan from worldBank");
	}
	
	// overriding
	public void save() {
		System.out.println("I am save from worldBank");
	}
	
}

class SBIB extends WorldB {
	
	public void loan() {
		System.out.println("I am loan from SBI");
	}
	public void save() {
		System.out.println("I am save from SBI");
	}
	
}

public class Program4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBIB sbi = new SBIB();
		sbi.loan();
		sbi.save();
		
	}

}
