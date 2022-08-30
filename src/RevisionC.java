
public class RevisionC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		// DRY - Don't repeat yourself
				
		Calculator(12,6);	
		Calculator(100,50);
		
		add();
		add();
		add();
		
		addB(12,14);
		addB(120,140);
		addB(1200,1400);
		
		
		int q1 = addC(12,4);
		System.out.println(q1);
		System.out.println(q1+q1);
		System.out.println(q1-q1);
		System.out.println(q1 * 0.10);
		
		
		// string
		
		String city = "pune";
		System.out.println(city);
		
		// string + string ===> string
		// string + number ===> string 
		// number + number ===> number
		// number + string ===>string
		
		
		int a1 = 10;
		int b1 = 20;
		String c1 = "hello";
		String c2 = "hi";
		
		System.out.println(a1+b1); // 30
		System.out.println(c1+c2);
		System.out.println(a1+c2);
		System.out.println(c2+b1);
		
		System.out.println("-----");
		
		
		// type -----objects ---- property and method
		// method will have  action and return 
		
		
		//Vehicle -- audi
		//property - color , type , model , regNo
		//method - start() , stop()
		
		// Human - amol
		// property - height , weight , age
		// method = talk(), walk()
		
		// Bank -saving acc
		// property - accNo , accName, address , bal
		// method - deposit and withdrawl
		
		
		// Method -- action  - excercise
		// return - muscles
		
		
		String fruit = "apple";
		String upper = fruit.toUpperCase();
		System.out.println(upper);
		
		
		String fruit2 = "Banana";
		String lower = fruit2.toLowerCase();
		System.out.println(lower);
		
		
		String city2 = "nagpur";
		int e = city2.length();
		System.out.println(e);
		
		String firstName = "chinmay ";
		String lastName = "deshpande";
		
		String a22 = firstName.concat(lastName);
		System.out.println(a22);
		
		
		//firstName.toUpperCase().toLowerCase().length().toLowerCase() incorrect
		// we can only string method change if the previous method return string
		
		int rr = firstName.toUpperCase().toLowerCase().length();
		//         8
		System.out.println(rr);
		
		// Loops
		
		
		for(int i = 0 ; i < 6 ; i++) { //1 // 2 // 3 // 4 // 5 // 6
			System.out.println(i); // 0 , 1 , 2 ,3,4 , 5
		}
		
		for(int i = 5 ; i >= 1;i--) { // 4 // 3 // 2 // 1 // 0
			System.out.println(i); // 5 , 4 , 3 ,2 ,1
		}
		
		// while
		
		int t1 = 0 ;
		
		while(t1 < 6) {
			System.out.println(t1);
			t1 ++;
		}
		
		int t2 = 5 ;
	
		while(t2 >= 1) {
			System.out.println(t2);
			t2 --;
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public static void Calculator(int x, int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	
	// function without parameter and without return 
	
	public static void add() {
		System.out.println(9+9);
	}
	
	
	// function with parameter and without return type
	public static void addB(int x,int y) {
		System.out.println(x+y);
	}
	

	// function with parameter and with return type
	
	public static int addC(int x , int y) {
		return x + y;
	}
	
	
	
	
	
}
