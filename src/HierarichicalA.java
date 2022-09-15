class FatherC {
		String fN;
		String lN;
		
		FatherC(String fN,String lN){
			this.fN = fN;
			this.lN = lN;
		}

		public void displayName(String greet){
				System.out.println(greet + this.fN + this.lN);
		}
		
}

class SonC extends FatherC {
	String sN;
	
	SonC(String fN,String lN, String sN){
		super(fN,lN);
		this.sN = sN;
	}

	public void displayName(String greet){
			System.out.println(greet + this.sN + this.lN);
	}
	
}

class Daughter extends FatherC {
	String dN;
	
	Daughter(String fN,String lN, String dN){
		super(fN,lN);
		this.dN = dN;
	}

	public void displayName(String greet){
			System.out.println(greet + this.dN + this.lN);
	}
	
}

public class HierarichicalA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonC chinmay = new SonC("Shirish","Deshpande","Chinmay");
		Daughter gauri = new Daughter("Shirish","Deshpande","Gauri");
		chinmay.displayName("Good Morning !");
		gauri.displayName("Good Evening !");
	}

}
