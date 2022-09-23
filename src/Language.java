interface Language {
	void getFirstName(String name);
	void getLastName(String name);
	void getCity(String name);
}

class PeronInfo implements Language {
	@Override
	public void getFirstName(String name) {
		// TODO Auto-generated method stub
		System.out.println("FirstName:"+ name);
	}

	@Override
	public void getLastName(String name) {
		// TODO Auto-generated method stub
		System.out.println("LastName:"+ name);
	}
	@Override
	public void getCity(String name) {
		// TODO Auto-generated method stub
		System.out.println("City: "+ name);	
	}
	
		
}





// interface -----> restriction 
// abstraction --- hiding 
// class can be abstract?
// class can be abstract 
// abstract class can have abstract as well no abstract method
// can be create object of abstract class
// if abstract class extends any class ----> implement abstract method