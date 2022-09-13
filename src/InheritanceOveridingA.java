
class WorldBank {
	
	String country = "India";
	public void loan(int x) {
		System.out.println("I am loan method from worldbank " + x);
	}
	public void save(int x) {
		System.out.println("I am save method from worldbank " + x);
	}	
	
	public void currentCountry() {
		System.out.println("Current country "+this.country);
	}
}

class SBI extends WorldBank {
	@Override
	public void loan(int x) {
		System.out.println("I am loan method from sbi "+x);
	}
	@Override
	public void save(int x) {
		System.out.println("I am save method from sbi " + x);
	}	
	
}
class BOI extends WorldBank {
	
	@Override
	public void loan(int x) {
		System.out.println("I am loan method from boi "+x);
	}
	@Override
	public void save(int x) {
		System.out.println("I am save method from boi " + x);
	}	
	
	
}
class ICICI extends WorldBank {	
	
	@Override
	public void loan(int x) {
		System.out.println("I am loan method from icici "+x);
	}
	@Override
	public void save(int x) {
		System.out.println("I am save method from icici " + x);
	}	
	
}





public class InheritanceOveridingA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI sbi = new SBI();
		BOI boi = new BOI();
		ICICI icici = new ICICI();
		
		sbi.loan(8);
		sbi.save(7);
		
		sbi.currentCountry();
		boi.currentCountry();
		icici.currentCountry();

	}
	
	
	

}
