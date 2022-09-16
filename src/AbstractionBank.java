
abstract class WorldBankC{
	abstract void loan();
	abstract void save();
}

class SBIa extends WorldBankC{
	
	public void loan() {
		System.out.println("I am from loan method");
	}
	public void save() {
		System.out.println("I am from save method");
	}

	public void sbi() {
		System.out.println("sbi method");
	}
}


class PNB extends WorldBankC{
	
	public void loan() {
		System.out.println("I am from loan method PNB");
	}
	public void save() {
		System.out.println("I am from save method PNB");
	}

	public void PNB() {
		System.out.println("PNB method");
	}
}




public class AbstractionBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBIa a = new SBIa();
		a.save();
		a.loan();
		a.sbi();
		
		PNB pnb = new PNB();
		pnb.save();
		pnb.loan();
		pnb.PNB();
		
		
	}

}
