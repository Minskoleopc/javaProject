
public class MethodsR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10 ;
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
		// 10 pair 50 lines   .. breaking the DRY
		
		// calling the function
		
		Calculator(80,40);
		Calculator(140,70);
		
		add();
		add();
		add();
		add();
		add();
		
		addA(10,30);
		addA(10,34);
		addA(100,3);
		
		
		int sum = addB(12,6);
		System.out.println(sum);
		System.out.println(sum + sum );
		System.out.println(sum -4);
		System.out.println(sum * 0.10);
		
		String sentence = Greet("chinmay");
		System.out.println(sentence);
		
		String sentence2 = Greet("sahadev");
		System.out.println(sentence2);
		
		boolean a1 = isMarried(true);
		System.out.println(a1);
	}
	
	
	
	public static void Calculator(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	// function with no parameter and without return type
	
	public static void add() {
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	
	public static void addA(int x , int y) {
		System.out.println(x+y);
	}
	
	// $100 show
	// $100 given
	
	// function with parameter and with return type 
	
	public static int addB(int a , int b) {
		System.out.println(a+b); // 18
		return a + b ; // 18
	}
	
	// function passing string as a parameter and return type is also string 
	
	public static String Greet(String word) {
		//System.out.println("Welcome "+ word);
		return "Welcome "+word;
	}
	
	// function passing boolean as parameter and return boolean value
	
	public static boolean isMarried(boolean b) {
		return b; // true
	}
	
	
	
	
	
	
	

}
