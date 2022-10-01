class BankG {
	
	public static String branchName = "kharadi";
	public String fullName;
	public String accountNumber;
	
	public BankG(String fn, String accNO) {
		this.fullName = fn;
		this.accountNumber = accNO;
	}
	
	public static void displayBranchName() {
		System.out.println("The branch name is :"+BankG.branchName);
	}
	
	public void displayNameandNumber() {
		System.out.println(this.fullName + this.accountNumber);
	}
	

} 



public class StaticConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BankG.branchName);
		BankG.displayBranchName();
		
		BankG icicG = new BankG("chinmay deshpande","123");
		//icicG.displayBranchName();
		icicG.displayNameandNumber();
		
		
		

	}

}
