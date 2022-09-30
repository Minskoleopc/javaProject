public interface program7a {
	void loanA();
	void loanB();
}

interface program7ba extends program7a {
	void loanC();
	void loanD();
}

class Wo implements program7ba{

	@Override
	public void loanA() {
		// TODO Auto-generated method stub
		System.out.println("I am from first interface");
	}

	@Override
	public void loanB() {
		// TODO Auto-generated method stub
		System.out.println("I am from first interface");
	}

	@Override
	public void loanC() {
		// TODO Auto-generated method stub
		System.out.println("I am from second interface");
	}

	@Override
	public void loanD() {
		// TODO Auto-generated method stub
		System.out.println("I am from  second interface");
	}
	
}