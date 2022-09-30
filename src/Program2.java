class MotherB {
		String firstName;
		String lastName ;
		public MotherB(String firstName , String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public void displayMotherName(){
			System.out.println(this.firstName + this.lastName);
		}	
	}
	
	class SonB1 extends MotherB{
		String SonName;
		public SonB1(String firstName , String lastName,String SonName) {
			super(firstName,lastName);
			this.SonName = SonName;
		}
		
		public void displaySonName() {
			System.out.println(this.SonName + this.lastName);
		}
		
	}
	
	class Daughter1 extends MotherB{
		String DName;
		public Daughter1(String firstName , String lastName,String DName) {
			super(firstName,lastName);
			this.DName = DName;
		}
		
		public void displayDName() {
			System.out.println(this.DName + this.lastName);
		}
		
	}
	
public class Program2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SonB1 chinmayA = new SonB1("kanchan","deshpande","chinmay");
		Daughter1 Gauri = new Daughter1("kanchan","deshpande","gauri");
		chinmayA.displaySonName();
		Gauri.displayDName();
		
	}

}
