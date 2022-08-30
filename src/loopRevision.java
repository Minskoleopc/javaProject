
public class loopRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// loop revision
		
		// for loop 
		
//		for(initialization ; conditionCheck ; increment/decrement) {
//		}
		
		// print from  0 - 2
		
		for(int i = 0 ; i < 3 ;i++) { // i- 1 , 2 , 3
			//System.out.println(i); // 0 , 1 , 2
			System.out.println("hello"); // "hello" , "hello" ,"hello"
		}
		
		
		// print 1 - 10
		
		for(int i = 1 ; i < 11 ; i++) {
			System.out.println(i);
		}
		
		// print 10 -1
		
		for(int i = 10 ; i >= 1;i--) {
			System.out.println(i);
		}
		
		// print table of 2
		
		for(int i = 2 ; i <= 20 ; i = i + 2) { // 4 // 6 // 8 ------ 20 // 22
			System.out.println(i); // 2 , 4 , 6 ------ 20
		}
		
		// break statement with for loop
		
		for(int i = 0 ; i < 5 ; i++) {   //1 //2
			if(i == 2) {
				break;
			}
			System.out.println(i); //0 ,1 
		} 
		
		for(int i = 0 ; i < 5 ; i++) {  //1 // 2
			System.out.println(i); // 0 ,1 ,2
			if(i == 2) {
				break;
			}
			
		} 
		
		// continue 
		
		for(int i = 0 ; i < 5 ; i++) { //1 //2 //3 // 4 //5
				if(i == 2) {
					continue;
			}
				System.out.println(i); // 0 ,1 ,3 ,4
		} 
		
		
		
		// while loop
		
		
		
		
		
		
		
		
		

		
		// while loop
		
		
		int t1 = 0;
		while(t1 < 5) {
			System.out.println(t1); // 0 ,1 , 2 , 3 , 4
			t1++; // 1 // 2 // 3 // 4 // 5
		}
		
		// print 1 to 10
		
		int t2 = 1;
		while(t2 <= 10) {
			System.out.println(t2);
			t2++;
		}
		
		// print 10 -1 
		
		int t3 = 10;	
		while(t3 >= 1) {
			System.out.println(t3);
			t3 --;
		}
			
		// table of 2
		int t4 = 2;
		while(t4 <= 20) {
			System.out.println(t4);
			t4 = t4 + 2;
		}
		
		// break with while loop 
		
		int t5 = 5;
		
		while(t5 >= 1) {
			System.out.println(t5); // 5 ,4 ,3
			if(t5 == 3) {
				break;
			}
			t5 --; // 4 , 3
		}
		
		// continue with while
		
		int t6 = 0;
		
		while(t6 < 5) {
			if(t6 == 2) {
				t6 ++; // 3
				continue;
			}
			System.out.println(t6); // 0  ,1 ,3 , 4
			t6 ++; // 1  // 2 // 4 // 5
		}
				
		
		
		
		
		
		
		
				
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
	}

}
