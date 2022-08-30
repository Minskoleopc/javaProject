
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		
		System.out.println(a+b); // addition
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		int s  = 100;
		int t = 50 ;
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		
		// 10 pairs i have to write 50 lines
		// DRY do not repeat yourself
		// solution - functions
		
		Calculator(10,5);
		Calculator(100,50);
		Calculator(90,45);
		
		// function without parameter and without return type
		
		AdditionA();
		AdditionA();
		AdditionA();
		AdditionA();
		
		// function with parameter and without return type
		AdditionB(12,12);
		AdditionB(1,2);
		AdditionB(1000,200);
		
		// show  you 100 $ 
		// give you 100 $  // $100 + 100 $ 100$ - 50$ $100 *0.10
		// function with parameter and with return type
		
		int v = AdditionC(10,4);
		System.out.println(v);
		System.out.println(v + v);
		System.out.println(v - 5);
		System.out.println(v * 0.10);
		
		// Revision 
		SubtractionA();
		SubtractionA();
		SubtractionA();
		SubtractionA();
		
		SubtractionB(100,50);
		SubtractionB(10,5);
		SubtractionB(100,3);
		
		int q1 = SubtractionC(300,150);
		System.out.println(q1);
		System.out.println(q1 + q1);
		System.out.println(q1 - q1);
		System.out.println(q1 * 0.10);
		
		String q2 = SubtractionD(90,45);
		System.out.println(q2);
		
	}
	
	// Functions
	
	public static void Calculator(int x , int y) {
		// arithmetic operation
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);	
	}
	
	// Three basic type of function
	// function without parameter and without return type
	
	public static void AdditionA() {
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	public static void AdditionB(int x , int y) {
		System.out.println(x+y);
	}
	
	// function with parameter and with return type
	public static int AdditionC(int x ,int y) {
		return x + y ; // (10 + 4)
	}
	
	// revision
	public static void SubtractionA() {
		System.out.println(10-5);
	}
	
	public static void SubtractionB(int a , int b){
		System.out.println(a-b);
	}
	
	public static int SubtractionC(int a , int b) {
		return a - b;
	}
	
	public static String SubtractionD(int a ,int b) {
			System.out.println(a - b); // 45
			return "Subtraction successful";
	}
	
}
