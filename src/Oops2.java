class Person2 {
	
	int weight;
	int age;
	int height;
	String country = "India";
	
	// constructor
	Person2(int ag , int wi , int hi){
		this.age = ag;
		this.weight = wi;
		this.height = hi;	
	}
	
	public static void talk() {
		System.out.println("Hello");
	}
	
	public static void Sleep() {
		System.out.println("Good Night");
	}
	
	
}
public class Oops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person2 amol = new Person2(12,34,5);
		System.out.println(amol.age);
		System.out.println(amol.weight);
		System.out.println(amol.height);
		
		Person2 sarika = new Person2(23,45,6);
		System.out.println(sarika.age);
		System.out.println(sarika.weight);
		System.out.println(sarika.height);
		
		System.out.println(sarika.country);
		System.out.println(amol.country);
		
		
		
		
		

	}

}
