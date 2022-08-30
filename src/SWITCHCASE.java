
public class SWITCHCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		switch(expression) {
//		
//		case value1:
//			System.out.println();
//		
//		case value2:
//			System.out.println();
//		
//		case value3:
//			System.out.println();
//		
//		default:
//			// default statments
//		
//		
//		}
		
		// not using break statement
		
//		String city = "Udaipur";
//		
//		switch(city) {
//		
//		case "Pune":
//			System.out.println("Maharashtra");
//		
//		case "Bhopal":
//			System.out.println("Madhya Pradesh");
//			
//		case "Banglore":
//			System.out.println("Karnataka");
//
//		case "Jaipur":
//			System.out.println("Rajasthan");
//		default:
//			System.out.println("Incorrect city");
//			
//		
//		}
//		
//		
//		
		
		
		// Program 2 (switch with break)

		int weight = 70;
		
		switch(weight) {
		case 50:
			System.out.println("light weight");
			break;
		case 70:
			System.out.println("normal weight");
			break;
		
		case 80:
			System.out.println("heavy weight");
			break;
		default:
			System.out.println("no case match");
		
		}
		
		// Program 3 
		
		
		String citi = "pune";
		
		switch(citi) {
		
		case "pune":
		case "nagpur":
			System.out.println("Maharastra");
			System.out.println("Centre state");
			break;
		
		case "bhopal":
		case "indore":
			System.out.println("Madhya Pradesh");
			break;
		case "jaipur":
		case "udaipur":
			System.out.println("Rajasthan");
			break;
			
		default:
			System.out.println("city does not match");
			
		
		}
		
		
		// loops --- for and while loop
		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
		
		// finite -- 5 tym toss the coin -- for loop
		// keeping tossing until the HEAD comes -- while loop
		
		
		// for 
		
//		for(intialization ; conditionCheck ;increment/decrement) {
//			//statement one 
//			//statment two
//		}
//		
		
		
		for(int i = 0 ; i < 5 ; i++) { //1 // 2 // 3 // 4 // 5
			
			System.out.println(i); // 0 ,1 ,2 , 3 ,4
			
		}
		
		
		for(int i = 0 ; i <= 3 ; i++) { // 1 // 2 // 3
			System.out.println("hello");
		}
		
		
		for(int i = 0 ; i < 3; i++) { //1 // 2 // 3
			System.out.println(i); // 0 ,1 ,2
		}
		
		// 1 -10
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		// table of 2
		
		for(int i = 2 ; i <= 20 ; i = i+2) {
			System.out.println(i);
		}
		
		for(int i = 2 ; i <= 20 ; i+=2) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
