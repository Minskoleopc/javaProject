class GrandFatherA{
	String firstName;
	String lastName;
		
	GrandFatherA(String firstName,String lastName){
		this.firstName =firstName;
		this.lastName =lastName;
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}

class FatherB extends GrandFatherA {
	
	String fatherFirstName;
	FatherB(String firstName,String lastName, String fatherFirstName){ 
		super(firstName,lastName);
		this.fatherFirstName = fatherFirstName;
	}
	
	public void displayB() {
		System.out.println(this.fatherFirstName+this.firstName+this.lastName);
		super.displayName();
	}
		
}

class SonB extends FatherB {
	
	String sName;
	SonB(String firstName,String lastName, String fatherFirstName,String sName){ 
		super(firstName,lastName,fatherFirstName);
		this.sName = sName;
	}
	
	public void displayC() {
		System.out.println(this.sName+this.fatherFirstName+this.lastName);
		super.displayB();
	}
		
}

public class InheritanceMutlilevelB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonB chinmay = new SonB("manohar","deshpande","shirish","chinmay");
		chinmay.displayC();

	}

}
