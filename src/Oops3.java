
public class Oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// Creating a object 
		
		Person4 amol = new Person4();
		System.out.println(amol.age);
		System.out.println(amol.rollNo);
		System.out.println(amol.city);
		
		Person4 chinmay = new Person4();
		System.out.println(chinmay.age);
		
		// update the age for age 
		
		chinmay.age = 32;
		System.out.println(chinmay.age);
		System.out.println(amol.age);
		
		
	}
	

}

class Person4 {
		
	int age = 13;
	int rollNo = 23;
	String city = "pune";
	

	public static void walk() {
		System.out.println("Walking");
	}
	
	public static void talk() {
		System.out.println("Talking");
	}
	
}