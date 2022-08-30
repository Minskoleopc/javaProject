
public class revisionB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		// score --- 0 
		// score --- 100 
		// score ---- - 1
		
		int x  = 10;
		int y = 5;
		
		// + - * / %
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(x*y);
		
		
		// relational operator / comparison
	
		// < , > , <= , >= , == , !=
		
		System.out.println(7 > 4); // true
		System.out.println(7 == 5); // false
		System.out.println(5 < 4); // false
		System.out.println(6 != 7); // true
		System.out.println(5 >= 5); //true
		System.out.println(4 <= 5); // true
		
		// logical operator 
		
		// AND  &&
		System.out.println("Logical operator");
		
		// true   true  ---> true
		System.out.println(5 < 6 && 7 == 7);
		// true   false ---> false
		System.out.println(5 < 6 && 7 != 7);
		// false  true  ---> false
		System.out.println(5 > 6 && 7 != 6);
		// false  false ---> false
		System.out.println(5 > 6 && 7 != 7);
		
		
		// OR  ||
		
		// true   true  ---> true
		System.out.println(5 < 6 || 7 == 7); // true
		// true   false ---> true
		System.out.println(5 < 6 || 7 != 7); // true
		// false  true  ---> true
		System.out.println(5 > 6 || 7 != 6); // true
		// false  false ---> false
		System.out.println(5 > 6 || 7 != 7); // false
				

		// NOT  !
		
		System.out.println(!(7==7));
		System.out.println(!(7!=7));
		
		//false  true
		//true  false
		
		// conditional statements 
		
		// numberT > 0 &&  numberT <= 5 ===>  5% discount
		// numberT > 5 &&  numberT <= 10 ===>  10% discount
		// numberT > 10 ===>  20% discount
		
		// if statement
//		
//		if(condition) {
//			// statement  one
//			// statement  two
//			// statement  three
//		}
		
		
//		int numberT = 5;
//		
//		if(numberT > 0 && numberT <= 5) {
//			System.out.println("5 %discount");
//		}
//		if(numberT > 5 && numberT <= 10) {
//			System.out.println("10 %discount");
//		}
//		if(numberT > 10) {
//			System.out.println("20 %discount");
//		}
			
//		
//		if(numberT > 0 && numberT <= 5) {
//			System.out.println("5 %discount");
//		}
//		else if(numberT > 5 && numberT <= 10) {
//			System.out.println("10 %discount");
//		}
//		else if(numberT > 10) {
//			System.out.println("20 %discount");
//		}
//		else {
//			System.out.println("incorrect input");
//		}
			
		
		//program 7
//		
//		 if percent is above 90 ---> A grade
//		 if percent is above 75 ---> B grade
//		 if percent is above 65 ---> C grade
//		
		int marks = 92;
		
//		if(marks > 90) {
//			System.out.println("A grade");
//		}
//		if(marks > 75) {
//			System.out.println("B grade");
//		}
//		if(marks > 60) {
//			System.out.println("C grade");
//		}
		
		
//		if(marks > 90) {
//			System.out.println("A grade");
//		}
//		else if(marks > 75) {
//			System.out.println("B grade");
//		}
//		else if(marks > 60) {
//			System.out.println("C grade");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
		
		int a1 = 10 ;
		int b1 = 50;

		
		if(a1 > b1) {
			System.out.println("a1 is greater");
		}
		else {
			System.out.println("b1 is greater");
		}
		
		
		int x1 = 10;
		int y1 = 500;
		int z1 = 30;
		
		
		if(x1 > y1) {
			if(x1 > z1) {
				System.out.println("x1 is greater");
			}
			else {
				System.out.println("z1 is greater");
			}
		}
		else {
			if(y1 > z1) {
				System.out.println("y1 is greater");
			}
			else {
				System.out.println("z1 is greater");
			}
			
			
		}
		
		
		if(x1 > y1 && x1 > z1) {
			System.out.println("x1 is greater");
		}
		else if(y1 > x1 && y1 > z1) {
			System.out.println("y1 is greate");
		}
		else {
			System.out.println("z is greater");
		}
		
		
		// switch case
		
		String city = "nagpur";
		
//		switch(city) {
//			case "pune":
//				System.out.println("MH");
//			case "bhopal":
//				System.out.println("MP");
//			case "lucknow":
//				System.out.println("UP");
//			default:
//				System.out.println("Not matching");
//		}
//		
		
		switch(city) {
		case "pune":
		case "nagpur":
			System.out.println("MH");
			break;
		case "bhopal":
		case "indore":
			System.out.println("MP");
			break;
		case "lucknow":
		case "kanpur":
			System.out.println("UP");
			break;
		default:
			System.out.println("Not matching");
}

	
		// loop
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		
		// for 
		
		
//		for(intialization ; conditionCheck ; increment/decrement) {
//			
//			// statement 1
//			// statement 2
//		}
		
		
		// print from 1 to 10
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		
		// print from 10 to 1
		
		for(int i = 10 ; i >= 1 ; i--) {
			System.out.println(i);
		}
		
		
		// break 
		
		for(int i = 10 ; i >= 1 ; i--) {
			if(i == 5) {
				break;
				
			}
			System.out.println(i);
		}
		
		// continue
		
		for(int i = 10 ; i >= 1 ; i--) {
			if(i == 5) {
				continue;	
			}
			System.out.println(i);
		}
		
		
		
		// while 
		
		
		
//		int t1 = 1;
//		
//		while(t1 <= 10) {
//			System.out.println(t1);
//			t1 ++;
//		}
//			
//		int t2 = 10;
//		
//		while(t2 >= 1) {
//			System.out.println(t2);
//			t2 --;
//		}
//		
		int t3 = 1;
		
		while(t3 < 5) {
			
			if(t3 == 2) {
				break;
			}
			System.out.println(t3); // 1
			
			t3++; // 2
		}
		
		// continue
		
		
	int t4 = 1;
		
		while(t4 < 5) {
			if(t4 == 2) {
				t4 ++; // 3
				continue;
			}
			System.out.println(t4);  // 1 ,3 ,4
			
			t4++; // 2 /// 4 // 5
		}
		
		
		

		
		// do while
		
		int t5 = 1;
		do {
			System.out.println("hello");
		}while(t5 == 2);
		
		
		int t6 = 1;
		while(t6 == 6) {
			System.out.println("hello");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
