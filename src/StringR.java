
public class StringR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// data type
		
		// introvert      extrovert
		//  less social   speaks more
		//  calm          loud
		//  talks less    speaks more (friendly)
		
		
		// boolean -- it can hold only two values true and false
		// int --- 87,-89,78
		// String ---- 'amol' ,'chinmaydeshpande@gmail.com'
		
		// user defined data type
		// Person  -----> amol
		// property -----> height , weight , age , color , gender
		// method - talk() , walk(), sleep()
		
		// Vehicle -- Audi 
		// property - color , model , type , regNo 
		// method - start() , stop()
		
		// Bank - ICICI
		// property - accNO , addressName , accName , accType
		// method - withdrawl()  depoist()
		
		// Data type ---- properties and method
		// method - action and return type
		
		
		// toUpperCase()
		
		String firstName = "amol";  // object is created
		String upperCaseFirstName = firstName.toUpperCase();
		System.out.println(upperCaseFirstName);
		
		// toLowerCase()
		// action - to convert every character to lowerCase 
		// return another
		
		String lastName  = "Rao";
		String lowerCaseLastName = lastName.toLowerCase();
		System.out.println(lowerCaseLastName);
		
		//length()
		//action - counts number of character in string 
		//return - int
		
		String city = "pune";
		System.out.println(city);
		int q1 = city.length();
		System.out.println(q1 + q1);
		System.out.println(q1);
		System.out.println(city.length());
		
		//IT means ---- 4 hr * 5 === > 20 hr * 4 == 80 hr -- 960 -- 1years
		// Method chaining
		
		String country  = "India";
		int q2 = country.toUpperCase().toLowerCase().length();
		System.out.println(q2);
		
		//     "INDIA"
		//                    "india"
		                                  //   5
		
		
		// program 1
		
		// Join two string 
		String firstName1 = "chinmay";
		String lastName1 = "deshpande";
		System.out.println(firstName1.concat(lastName1));
		System.out.println(lastName1.concat(firstName1));
		
		// program 2 
		// compare two string in java
		
		String first = "I am learning java";
		String second = "I am learning java";
		String third = "I am learning python";
		
		
		boolean matchA = first.equals(second); 
		System.out.println(matchA);
		
		boolean matchB = first.equals(third);
		System.out.println(matchB);
		
		
		// program 3 
		// Escape sequence in String 
		
		String fourth = "The quote says \"try try but donot cry\" ";
		System.out.println(fourth);
		
		// Program 4
		
		String city2 = new String("pune");
		String upperCase = city2.toUpperCase();
		System.out.println(upperCase);
		
		// Program 5
		
		String five = "I am learning java and selenium";
		boolean found = five.contains("ava");
		System.out.println(five.contains("ava"));
		System.out.println(found);
		
		// Java is case sensitive --- means java and Java are different string
		
		String fruits = "apple mango banana grapes chikoo papaya";
		String userInput = "cherry";
		
		if(fruits.contains(userInput)){
			System.out.println("Fruit is available");
		}
		else {
			System.out.println("Fruit is not available");
		}
		
		// conditional statement
		
//		if(condition) {
//			// statement
//		}
//		else {
//			// statement
//		}
		
		// program 6
		
		// join()
		
		String str1 = "hello";
		String str2 = "bye";
		String str3 = "hi";
		
		String str4 = String.join("-", str1,str2,str3);
		System.out.println(str4);
		
		String str5 = String.join(" ", str1,str2,str3);
		System.out.println(str5);
		
		String str6 = String.join("@", str1,str2,str3);
		System.out.println(str6);
		
		// replace 
		String str7 = "I am learning javascript and only javascript"; 
		String str8 = str7.replace("j", "a");
		System.out.println(str8);
		
		// replaceAll
		System.out.println(str7.replaceAll("javascript", "java"));
	
		// Program 7
		
		String str9 = "pune";
		
		//                0  1  2  3
		// "pune"  ===>   p  u  n  e
		
		int q11 = str9.indexOf("u");
		System.out.println(q11);
		
		int q12 = str9.indexOf("-1");
		System.out.println(q12);
		
		// "10",10,10.0
		
		fruits = "apple mango banana grapes chikoo papaya";
		int q14 = fruits.indexOf("grapes");
		System.out.println(q14);
		
		// Program 7 
		
		// startsWith()
		// endsWith()
		
		String q15 = "learning java is easy";
		boolean q16 = q15.startsWith("l");
		System.out.println(q16);
		
		boolean q17 = q15.startsWith("learning");
		System.out.println(q17);
		
		boolean q18 = q15.endsWith("y");
		System.out.println(q18);
		
		boolean q19 = q15.endsWith("Easy");
		System.out.println(q19);
		
		// Program 8
		
		//isEmpty
		
		String q20 ="";
		boolean q21 = q20.isEmpty();
		System.out.println(q21);
		if(q21) {
			System.out.println("Email is mandatory");
		}
		
		// program9
		
		// trim 
		
		String q23 = " amol ";
		System.out.println(q23.length());
		String q24 = q23.trim();
		System.out.println(q24.length());
		
		
		
		
		
		
		
		
	
		
			
		
		

	}

}
