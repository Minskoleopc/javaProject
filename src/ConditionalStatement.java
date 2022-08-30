
public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// NumberOfTicket -- <= 5      ===> 5%
		// NumberofTicket > 5 &&  NumberofTicket <= 10 ====> 10 % 
		// NumberofTicket > 10 =======> 30 %
//		if(condition) {
//			
//		}
		
		// program1
		
		int a = 10;
		if(a >= 10) {
			System.out.println("A is 10");
		}
		
		// program2 (Check whether the number is positive or negative)
		
		int b = -90;
		if(b > 0) {
			System.out.println("Number is positive");
		}
		
		else {
			System.out.println("Number is negative");
		}
		
		// Program 3 (not recommended)
		if(b>0) System.out.println("Number is positive");
		else System.out.println("Number is negative");
	
		
		//Program4 :- program to check the greater number 
		
		int x = 10;
		int y = 20;
		
		if(x > y) {
			System.out.println("x is greater");
		}
		else {
			System.out.println("y is greater");
		}
		
		// program 5
		
		//numberOfTicket > 0 && numberofTicket <= 5 ===> 5 % discount
		//numberofTicket > 5 && numberofTicket <= 10 ===> 10 % discount
		//numberofTicket > 10 ====> 30 % discount 
		
		
		int numberOfTicket = 11;
		
		if(numberOfTicket > 0 && numberOfTicket <= 5) {
			System.out.println("5 % discount");
		}
		
		if(numberOfTicket > 5 && numberOfTicket <= 10) {
			System.out.println("10 % discount");
		}
		
		if(numberOfTicket > 10) {
			System.out.println("30 % discount");
		}
		
		// program 6
		
		numberOfTicket = -10;
		
		if(numberOfTicket > 0 && numberOfTicket <= 5) {
			System.out.println("5 % discount");
		}
		else if(numberOfTicket > 5 && numberOfTicket <= 10) {
			System.out.println("10 % discount");
		}
		else if(numberOfTicket > 10) {
			System.out.println("30 % disocunt");
		}
		else {
			System.out.println("Incorrect input");
		}
		
		//program 7
		
		// if percent is above 90 ---> A grade
		// if percent is above 75 ---> B grade
		// if percent is above 65 ---> C grade
		
		int marks = 65;
		
//		if(marks > 90) {
//			System.out.println("A grade");
//		}
//		if(marks > 75) {
//			System.out.println("B grade");
//		}
//		if(marks > 60) {
//			System.out.println("C grade");
//		}
//		
		
		if(marks > 90) {
			System.out.println("A grade");
		}
		else if(marks > 75) {
			System.out.println("B grade");
		}
		else if(marks > 60) {
			System.out.println("C grade");
		}
		else {
			System.out.println("Fail");
		}
		
		// program 8
		
		
		int x1 = 100;
		int x2 = 230;
		int x3 = 450;
		
		if(x1 > x2) { // x1 is greater
			
			if(x1 > x3) {
				System.out.println("x1 is greater");
			}
			else{
				System.out.println("x3 is greater");
			}
			
		}
		else {
			
			if(x2 > x3) {
				System.out.println("x2 is greater");
			}
			else {
				System.out.println("x3 is greater");
			}
			
			
		}
		
		
		// program 9
		
		x1 = 1000;
		x2 = 200;
		x3 = 400;
		
	
		if(x1 > x2 && x1 > x3){
			System.out.println("x1 is greater");
		}
		else if(x2 > x1 && x2 >x3){
			System.out.println("x2 is greater");
		}
		else {
			System.out.println("x3 is greater");
		}
		
		
		
	}
	
	
	

}
