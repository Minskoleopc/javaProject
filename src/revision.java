
public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10 ; 
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// relational operator   < , > ,<= , >= , != , == 
		
		
		System.out.println(3 > 2); //true
		System.out.println(2 < 1); // false
		System.out.println(3 == 2); // false
		System.out.println(3 != 2); // true
		System.out.println(3 >= 2); // true
		System.out.println(3 <= 5); // true
		
		// Logical operators
		
		// AND 
		
		//TRUE TRUE   ==>   TRUE
		//TRUE FALSE   ==>  FALSE
		//FALSE TRUE   ==>  FALSE
		//FALSE FALSE   ==> FALSE
		
		
		//OR
		
		//TRUE TRUE   ==>   TRUE
		//TRUE FALSE   ==>  TRUE
		//FALSE TRUE   ==>  TRUE
		//FALSE FALSE   ==> FALSE
				
		
		
		// NOT
		
		//TRUE  FALSE
		//FALSE TRUE
		
		System.out.println( 3 != 2 && 3 == 3);
		System.out.println(2 == 2 && false);
		System.out.println(true && 5 != 5);
		System.out.println(false && false);
		
		
		System.out.println(5 == 5 || 4 != 5);
		System.out.println(6 != 6 || 7 != 9);
		System.out.println(5 == 5 || false);
		System.out.println(7!= 7 || 5 <= 4);
		
		System.out.println(!false);
		System.out.println(!true);
		
		
		// shot hand 
		
		int x = 10;
		x = x+ 1; //11
		x += 1; //12
		x++;
		System.out.println(x);
				
		int x1 = 10;
		x1 = x1 -1;  // 9
		x1 -= 1; // 8
		x1 --; // 7
		System.out.println(x1);
		
		int a11 = 3;
		a11 = a11 * 2;
		System.out.println(a11);
		a11 *= 6;
		System.out.println(a11);
		
		int a12 = 100;
		a12 = a12 / 10;
		System.out.println(a12);
		a12 /= a12;
		System.out.println(a12);
		a12 /= a12;
		System.out.println(a12);
		a12 /= 10;
		System.out.println(a12);
				
	}

}
