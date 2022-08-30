
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// program 1 Print every char
//		
//		String str1 = "apple";
//		for(int i = 0 ; i < str1.length();i++) {
//			//System.out.println(i);
//			System.out.println(str1.charAt(i));
//		}
//		
//		// Program 2 print the same string in reverse
//		
//		String rev = "";
//		
//		for(int i = 0 ; i < str1.length();i++) {
//			rev = str1.charAt(i) + rev;
//			
//			//        "a" + "" ==> a
//			//         p  + a  ==> pa
//			//         p  + pa  ==> ppa
//			//         l  + ppa ==> lppa
//			//         e  + lppa ==> elppa
//		}
//		System.out.println(rev);
//		String rev2 = "";
//		for(int i = str1.length()-1 ; i >= 0 ; i--) {
//				//System.out.println(i);
//
//				rev2 = rev2 + str1.charAt(i) ;
//				        //"" + e  ==> e
//						// e  + l ==> el
//						// el + p ==> elp
//						// elp + p ==> elpp
//						// elpp + a ===> elppa
//		}
//		
//		System.out.println(rev2);
//		
//		int counter = 0 ;
//		for(int i = 0 ; i < str1.length();i++) {
//			if(str1.charAt(i) == 'p') {
//				counter = counter + 1;
//			}
//		}
//		
//		System.out.println(counter);
//		
//		// vowels "aeiou"
//		
//		String str2 = "I am learning javascript";
//		int counter2 = 0;
//		for(int i = 0 ; i < str2.length(); i++) {
//			if(str2.charAt(i) =='a' || str2.charAt(i) =='e' ||str2.charAt(i) =='i' || str2.charAt(i) =='o' || str2.charAt(i) =='u') {
//				counter2 = counter2 + 1;
//			}
//			
//		}
//		System.out.println(counter2);
		

		// 8 pm ist -- pst 7:30 am
		// 8 pm ist -- cst 9:30 am
		// 8 pm est -- est 10:30am
		
		// program 4
		
		// print every element of array
		
		//                 0  1  2 3  4
		int [] array  =  {11,22,33,44,55};
		System.out.println(array[0]);
		System.out.println(array.length);
		
		for(int i = 0 ; i < array.length ;i++) {
			//System.out.println(i);
			System.out.println(array[i]);
		}
		
		// program
		
		String [] names = {"chinmay","ram","sarika"};
		for(String element:names) {
			System.out.println(element);	
		}
		
		for(int element:array) {
			System.out.println(element);
		}
		
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println(names[i]);
		}
		
		
		
		
	}
	
}
