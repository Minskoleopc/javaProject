
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// When to use array ??
		// Datatype [] arrayName = new Datatye[3]
		
		// Program 1
		
		String [] names = new String[3];
		// Array stores the value by index
		names[0] = "chinmay";
		names[1]= "poorva";
		names[2] = "sarika";
		
		// Another way to initialize array 
		//                    0          1          2
		String [] names2 = {"chinmay","poorva","sarika"}; 
		
		
		// Program 2 (Array of integers)
		
		
		int [] numbers = new int[3];
		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		
		int [] numbers2 = {11,22,33};
		
		//  0  1  2
		// [11,22,33]
		
		
		// Program3
		
		
		// How to access the element from array 
		//                    0         1         2          3        
		String [] cities = {"pune","banglore","kolkalta","jaipur"};
		System.out.println(cities[0]);
		System.out.println(cities[2]);
		
		// Total number of elements in array
		
		int a = cities.length;
		System.out.println(a);
		System.out.println(cities[cities.length-1]);
		
		
		// program 4 (print every element of array)
		
		//                    0        1         2       3
		String [] fruits = {"apple","mango", "banana","chikoo"};
		//System.out.println(fruits[3]);
		
		for(int i = 0 ; i < 3 ; i++) {  // 1 // 2 // 3
			System.out.println(i); // 0 , 1 , 2
		}
		
		for(int i = 0 ; i < fruits.length ; i++) {
			System.out.println(fruits[i]);
			// i ---  0
			// i ---  1
			// i ---  2
			// i ---  3
		}
		//                 0  1  2  3  4
		int [] numbers3 = {11,22,33,44,55};
		
		for(int i = 0 ; i < numbers3.length ; i++) {
			//System.out.println(i);
			System.out.println(numbers3[i]);
		}
		
		// print all the values of array in reverse 
	   //                         0         1         2        3
		String [] vegetables = {"Tomato","Potato","Brinjal","Cabbage"};
		
		for(int i = vegetables.length-1 ; i >= 0; i--) { // 2 // 1 // 0 // -1
			//System.out.println(i); // 3 , 2 , 1 , 0
			System.out.println(vegetables[i]);
		}
		
		// Program 6
		// Using for each loop
		
		int [] age = {22,33,44};
		
		for(int ag:age) {
			System.out.println(ag);
		}
		
		String [] countries = {"India","Nepal","Bangladesh","Srilanka"};
		for(String country:countries) {
			System.out.println(country);
		}
		
		// Program 7
		
		int [] numbers4 = {11,22,33};
		int sum = 0;  // 66
		
		for(int i = 0 ; i <numbers4.length ; i++) {
			//System.out.println(numbers4[i]);
			sum = sum + numbers4[i];
			
			//     0  +   11    ==> 11
			//     11 +   22    ==> 33
			//     33 +   33    ==> 66 
		}
		
		System.out.println(sum);
		
		
		// Program 8 
		
		// Average of all elements of array
		
		int [] ages2 = {22,24,26,28,30};
		int total = 0;
		// sum of all elements / totalNumberofElement
		
		for(int i = 0 ; i < ages2.length ; i++) {
			//System.out.println(i);
			total = total + ages2[i];
			
		//            0   +   22   ====>  22
		//            22  +   24   ====>  46
		//            46  +   26   ====>  72
        //            72  +   28   ====>  100
		//            100  +  30   ====>  130	
			
		}
		System.out.println(total/ages2.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Object -->
		// Human ====> amol 
		// Property - weight , height , color
		// Method - walk(), talk()
		
		// Vehicle ====> Audi
		// Property - Color ,ModelNumber ,RegNo
		// Method - Start() , Stop()
		
		// Bank - ICICI
		// Property - accNo , AccName ,Address
		// Method -  deposit() , withdrawl()
		
		// birthYear - 1989  
		// calculateAge()   // 2022 - 1989
		
		// Method ---> action and return type 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
