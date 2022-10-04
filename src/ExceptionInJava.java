
public class ExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Invalid user input 
		// Device failure
		// Loss of connection 
		// out of disk memory
		// code errors
		// Trying to open file but no file
		// Run time exception --- programming exception
		// IOException --- check exception (compile)
		
		
//		try {
//			
//		}
//		catch(Exception e) {
//			// code
//		}
//		
	
//		System.out.println(5/0);
//		System.out.println("hello"); // anyhow
		
		try {
			int diveByZero = 5/0;
			//System.out.println("next lines in try block");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("next lines in try block");
		}
		
		
		/*
		 
		 		try {
		 			// code
		 		}
		 		catch(Exception e1){
		 		
		 		
		 		}
		 		finally {
		 		
		 		
		 		}
		
		  */
		
		// program 2
		
		try {
			System.out.println(7/0);
		}
		catch(Exception e){
			System.out.println("Exception message"+e.getMessage());
		}
		finally {
			System.out.println("I will always run .....");
		}
		
		// program3
		

		try {
			System.out.println(7/2);
		}
		catch(Exception e){
			System.out.println("Exception message"+e.getMessage());
		}
		finally {
			System.out.println("I will always run .....");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 
	}

}
