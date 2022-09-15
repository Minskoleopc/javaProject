
public class PolymorphismMOL {
	
	// overloading  -- same methodName , Same class , different Signature
	// overriding  - same methodName , differentclass , same signature
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		int a = c1.Addition(12, 12);
		System.out.println(a);
		int b = c1.Addition(12, 12,45);
		System.out.println(b);
		int c= c1.Addition(12, 13,45,45);
		System.out.println(c);
	}

}

class Calculator {
	
	// method A
	public int Addition(int a , int b) {
		return a + b ;
	}
	// method B
	
	public int Addition(int a , int b , int c) {
		return a + b + c ;
	}
	// method C
	public int Addition(int a , int b , int c,int d) {
		return a + b + c + d;
	}
	
	
}
