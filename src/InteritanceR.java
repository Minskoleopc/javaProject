// program1

class FatherAB {
	
	String firstName;
	String lastName;
	public FatherAB(String firstName , String lastName) {	
		this.firstName = firstName;
		this.lastName  = lastName;		
	}
	public void displayName(){
		System.out.println(this.firstName+ this.lastName);
		
	}
}

class SonBa extends FatherAB{
	String sonName;
	public SonBa(String firstName , String lastName,String sonName) {
		super(firstName,lastName);
		this.sonName = sonName;
	}
	public void displayName(){
		System.out.println(this.sonName+ this.lastName);
		super.displayName();
	}
	
}

class GrandC extends SonBa {
	String Gname;
	
	public GrandC(String firstName , String lastName,String sonName,String Gname) {
		super(firstName,lastName,sonName);
		this.Gname = Gname;
	}
	public void displayName(){
		System.out.println(this.Gname+ this.lastName);
		super.displayName();
	}	
}
public class InteritanceR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mutilevel
		GrandC chinmay = new GrandC("manohar","deshpande","shirish","chinmay");
		chinmay.displayName();
		
	}

}
