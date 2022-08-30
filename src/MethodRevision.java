
public class MethodRevision {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// what are functions?
		
		int a = 10;
		int b = 5; 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		int s = 100;
		int t = 50;
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		
		Calculator(12,6);
		Calculator(10,5);
		Calculator(40,20);
		
		
		additionA();
		additionA();
		additionA();
		additionA();
		
		
		additionB(35,35);
		additionB(3,3);
		additionB(12,13);
		
		int q1 = additionC(30,30);
		System.out.println(q1);
		System.out.println(q1+q1);
		System.out.println(q1-5);
		System.out.println(q1 * 0.6);
		
		String q2 = Greet("chinmay");
		System.out.println(q2);
	}
	
	
	public static void Calculator(int x ,int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
	}
	
	// function without parameter and no return type 
	
	public static void additionA() {
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	
	public static void additionB(int x , int y) {
		System.out.println(x+y);
	}
	
	
	// function with parameter and with return type
	
	public static int additionC(int a , int b) {
		return a + b;
	}
	

	public static String Greet(String name) {
		return "welcome" + name ;
	}
	
	
	
	
	
}
