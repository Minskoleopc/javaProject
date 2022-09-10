
public class Oops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person5 amol = new Person5("amol","pune",23,5345);
		Person5 sarika = new Person5("sarika","sangamner",45,6644);
		sarika.DisplaName();
		
		
	}

}

class Person5 {
	
	String fullName;
	String city ;
	int age ;
	int ssn;
	
	Person5(String fN ,String cty ,int ag ,int sn){
		this.fullName = fN;
		this.city = cty;
		this.age = ag;
		this.ssn = sn;
				
	}
	
	public void DisplaName() {
		System.out.println(this.fullName);
	}
	

}