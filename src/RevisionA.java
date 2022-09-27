
public class RevisionA {
	
	public static void Calculator(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	public static void CalculatorB() {
		System.out.println(1+1);
		
	}
	
	public static void CalculatorC(int x , int y) {
		System.out.println(x+y);
		
	}
	
	public static int CalculatorD(int x , int y) {
		System.out.println(x+y);
		return x + y;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 
		String fullName = "chinmay";
		System.out.println(fullName);
		// Java is object --- property and method
		String a = fullName.toUpperCase();
		System.out.println(a);
		// Method chaining
		int b = fullName.toUpperCase().toLowerCase().length();
		System.out.println(b);
		
		// comparison relational operator
		// < , > , <= , >= , == , !=
		// entity < entity ----- boolean 
		System.out.println(4 < 3); // false
		System.out.println(4 != 3); // true
		System.out.println(4 > 3); // true
		System.out.println(4 >= 3); // true
		System.out.println(4 <= 3); // false
		System.out.println(4 == 3); // false
		// Logical operators
		// AND, OR , NOT
		
		// AND operation
		// True && True ===>  True 
		// True && False ==>  False
		// False && True ==>  False
		// False && False ==> False
		System.out.println(3 != 4 && 6 == 6);
		// OR operator
		// True && True ===>  True 
		// True && False ==>  True
		// False && True ==>  True
		// False && False ==> False
		System.out.println(4 == 5 || 6 > 5);
		// NOT 
		// True -- False
		// False-- True 
		System.out.println(!(6 == 6));
		// Conditional statements 
		// input ---> mutiple outcomes -->
		// numberT > 0 && numberT <= 5 --- 5 %
		// numberT > 5 && numberT < = 10  --- 10 %
		// numberT > 10  ---------- 20 %
		int numberT= 6;
//		if(numberT > 0 && numberT <= 5) {
//			System.out.println("5 % discount");
//		}
//		if(numberT > 5 && numberT <= 10) {
//			System.out.println("10 % discount");
//		}
//		if(numberT > 10) {
//			System.out.println("20 % discount");
//		}
		
		if(numberT > 0 && numberT <= 5) {
			System.out.println("5 % discount");
		}
		else if(numberT > 5 && numberT <= 10) {
			System.out.println("10 % discount");
		}
		else if(numberT > 10) {
			System.out.println("20 % discount");
		}
		
		int marks = 92;
//		if(marks > 90) {
//			System.out.println("Grade A");
//		}
//		if(marks > 70) {
//			System.out.println("Grade B");
//		}
//		if(marks > 60) {
//			System.out.println("Grade C");
//		}
		
		if(marks > 90) {
			System.out.println("Grade A");
		}
		else if(marks > 70) {
			System.out.println("Grade B");
		}
		else if(marks > 60) {
			System.out.println("Grade C");
		}
		
		// Tenary operator
		
		int a1 = 100 ; 
		int b1 = 20;
		
//		if(a1 > b1) {
//			System.out.println("a1 is greater");
//		}
//		else {
//			System.out.println("b1 is greater");
//		}
		
//		int max = (a1 > b1) ? a1 : b1;
//		System.out.println(max);
//		
//		String minval = (a1 < b1)?"a is small":"b is small";
//		System.out.println(minval);
		
		// Switch case
		
		String city = "indore";
		switch(city) {
		case "pune":
		case "nagpur":
			System.out.println("MH");
			break;
		case "indore":
		case "bhopal":
			System.out.println("MP");
			break;
		case "jaipur":
		case "udaipur":
			System.out.println("RJ");
			break;
		default:
			System.out.println("Plese enter correct city");
		}
		
		// Loops
//		for(intiliazation ; conditionCheck; increment) {
//			// statement
//		}
		
		for(int i = 0 ; i < 4 ; i++) { //1 // 2 // 3 // 4
			System.out.println(i); // 0 , 1 , 2 , 3
		}
		
		for(int i = 0 ; i < 4 ; i++) { 
			System.out.println(i); 
			if(i == 2) {
				break;
			}
		}
		for(int i = 0 ; i < 4 ; i++) { 
			if(i == 2) {
				continue;
			}
			System.out.println(i); 
		}
		
		// while 
		
		//intialization ; 
//		while(condition) {
//			// statement 
//			// increment / decremetn
//		}
		
		int i2 = 5;
		
//		while(i2 >= 1) {
//			System.out.println(i2);
//			i2 --;
//		}
//		
		
//		while(i2 >= 1) {
//		System.out.println(i2);
//		if(i2 == 3) {
//			break;
//		}
//		i2 --;
//	}
//	
//		while(i2 >= 1) {
//			if(i2 == 3) {
//				i2 --;
//				continue;
//			}
//			System.out.println(i2);
//			i2 --;
//		}
		
		
		
		// functions 
		
		int a3 = 10;
		int a4 = 5;
		
		System.out.println(a3+a4);
		System.out.println(a3-a4);
		System.out.println(a3*a4);
		System.out.println(a3/a4);
		System.out.println(a3%a4);
		
		int a5 = 200;
		int a6 = 100;
		
		System.out.println(a5+a6);
		System.out.println(a5-a6);
		System.out.println(a5*a6);
		System.out.println(a5/a6);
		System.out.println(a5%a6);
		
		Calculator(22,3);
		Calculator(200,100);
		
		CalculatorB();
		CalculatorB();
		
		CalculatorC(2,3);
		CalculatorC(2,1);
		
		int a77 = CalculatorD(12,3);
		System.out.println(a77);
		System.out.println(a77 + 10);
		
	
	

	}

}
