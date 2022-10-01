class BankF {
	
	public static int count = 0;
	public String fullName;
	public String accNo;
	
	public BankF(String fn , String accNo) {
		this.fullName = fn;
		this.accNo = accNo;
		BankF.count = BankF.count + 1 ;	
	}
	
	public void displayFullNameAndAcc() {
		System.out.println(this.fullName + this.accNo);
	}
	
	public static int countOfObject() {
		return BankF.count;
	}
	
	
}




public class CountOfObjectCreatedFromClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankF Aperson = new BankF("poorva","1");
		BankF Bperson = new BankF("amol","12");
		BankF Cperson = new BankF("amol","3");
		BankF Dperson = new BankF("amit","1");
		BankF Eperson = new BankF("akash","23");
		
		System.out.println(BankF.countOfObject());
		
		
	}

}
