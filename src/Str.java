
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// type 
		// type  object --- property and method
		// method - action and return type
		
		String name = "chinmay";
		System.out.println(name);
		
		String city = "pune";
		System.out.println(city);
		
		// string + string ===> string 
		// number + string ===> string 
		// string + number ===> string 
		// number + number ===> number
		
		int a = 10;
		int b = 5;
		String c = "hello";
		
		System.out.println(a+b+c);
		// number + number + string ===> string
	
		System.out.println(c+b+a); 
		// string + number + number ===>  string
		
		System.out.println(c+c); 
		///string + string ===> "string"
		
		System.out.println(a + b);
		// number + number ==> number
		
		String x  = "5";
		String y = "10";
		System.out.println(x+y);
		
		
		// Methods 
		
		// length()
		
		String country = "Nepal";
		int  q22 = country.length();
		System.out.println(q22);
		
		// toUpperCase()
		
		String city2 = "Banglore";
		String q33 = city2.toUpperCase();
		System.out.println(q33);
		System.out.println("Welcome to "+q33);
		
		//toLowerCase()
		
		String q44 = city2.toLowerCase();
		System.out.println(q44);
		System.out.println("Welcome to "+q44);
		
		// concat()
		String fruit = "Apple";
		String s = "I like ";
		String joinedString = s.concat(fruit);
		System.out.println(joinedString);
		
		String q55 = fruit.concat(s);
		System.out.println(q55);
		
		
		// method chaining 
		
		
		String vegetable = "tomato";
		System.out.println(vegetable);
		
		String q66 = vegetable.toUpperCase();
		System.out.println(q66);
		
		int q77 =  q66.length();
		System.out.println(q77);
		
		int q88 = vegetable.toUpperCase().toLowerCase().length();
					//"TOMATO".toLowerCase().length()
					// "tomato".length()
					// 6
		System.out.println(q88);
		String [] q888 = vegetable.toUpperCase().toLowerCase().split("e");
		
		
		// equal
		
		String first = "hello";
		String second = "hello";
		boolean result = first.equals(second);
		System.out.println(result);
		
		
		// contains 
		
		String jkl = "I am new to java learning";
		boolean result1 = jkl.contains("learning");
		System.out.println(result1);
		
		// substring() city3.substring(startIndex , End index(not included))
	
		String city3 = "chandrapur";
		
		// 0 1 2 3 4 5 6 7 8 9
		// c h a n d r a p u r
		
		String result3 = city3.substring(2);
		System.out.println(result3);
		
		String result4 = city3.substring(2,7);
		System.out.println(result4);
		
		String result5 = city3.substring(6,10);
		System.out.println(result5);
		
		// join()
		
		String str1 = "I am";
		String str2 = "learning";
		String str3 = "javascript";
		
		String result6 = String.join(" ", str1,str2,str3);
		System.out.println(result6);
		
		
		String str = "amol";
		String email = String.join("@", str,"gmail.com");	
		System.out.println(email);
		
		// replace() - can work with character also
		
		//"chinmay" , "i" "chinmay.replace('i','e')
		//"chinmay is new city , chinmay cooks his own food".replaceAll("chinmay","amol")
		
		
		String str5  = "I am learning javascript!";
		String str6 = str5.replace("javascript", "java");
		System.out.println(str6);
		
		
		String str7  = "I am learning javascript! and javascript is fun";
		String str8 = str7.replace("i", "m");
		System.out.println(str8);
		
		// replaceAll()
		String str9  = "I am learning javascript! and javascript is fun";
		str9 = "I am learning python";
		System.out.println(str9);
		String str10 = str9.replaceAll("javascript", "java");
		System.out.println(str10);
		
		// replaceFirst()
		
		String str11  = "I am learning javascript! and javascript is fun";
		String str12 = str11.replaceFirst("javascript", "java");
		System.out.println(str12);
		
		// charAt()
		
		String str13 = "punep";
		// 0 1 2 3 4
		// p u n e p
		char result11 = str13.charAt(2);
		System.out.println(result11);
		
		// indexOf()
		
		int result16 = str13.indexOf("p");
		System.out.println(result16);
		
		// trim()
		
		String str14 = " pune ";
		System.out.println(str14.length());
		String str15 = str14.trim();
		System.out.println(str15.length());
		
		// split()
		
		String str16 = "chinmay-deshpande-7709192441";
		String [] result17 = str16.split("-");
		// chinmay-deshpande-7709192441 on "-" // ["chinmay","deshpande","7709192441"]
		System.out.println(result17[0]);
		System.out.println(result17[1]);
		System.out.println(result17[2]);
		
		String [] result18 = "chinmay-deshpande-7709192441".split("c");
		// ["chinmay-deshpande-770919" ,"441"]
		
		System.out.println(result18[0]);
		System.out.println(result18[1]);
		//System.out.println(result18[2]);
		
		String str18 = "I am new to zorba";
		boolean result19 = str18.startsWith("I am");
		System.out.println(result19);
		
		
		String str19 = "I am new to zorba";
		boolean result20 = str19.endsWith("zorba");
		System.out.println(result20);
		
		String str20 = "nagpur";
		
		// 0 1 2 3 4 5
		// n a g p u r
		
		for(int i = 0 ; i < str20.length(); i++) { //1 //2  ----- // 6
				//System.out.println(i); // 0,1,2,3,4,5
				System.out.println(str20.charAt(i));
		}	
		
		for(int i = str20.length()-1 ;  i >= 0 ;i--) {
			System.out.println(str20.charAt(i));
		}
		
		
		String str21 = "hello";
		String rev = "";
		
		// "olleh"
		
		for(int i = 0 ; i < str21.length();i++) {
			rev =  str21.charAt(i) + rev;
			          // h+""  ===> h
					  // e  + h ===> eh
			          // l  + eh ==> leh
			          // l  + leh ===>lleh
					  // o  + lleh ===> olleh
			
		}
		
		System.out.println(rev);
		
		String str22 = "pune";
		String rev2 = "";
		
		// 0 1 2 3
		// p u n e
		
		for(int i = 0 ; i < 4;i++) {
			//System.out.println(i);
			//System.out.println(str22.charAt(i));
			
			rev2 = str22.charAt(i) + rev2 ;
			           // p +  "" ==> p
					   // u + p  ==> up
					   // n + up ==> nup
					   // e + nup ==> enup
			
		}
		System.out.println(rev2);
		
		String str23 = "pune";
		String rev3 = "";
		// 0 1 2 3
		// p u n e
		
		for(int i = str23.length()-1 ; i >=0 ; i--) {
			//System.out.println(i);
			//System.out.println(str23.charAt(i));
			rev3 = rev3 + str23.charAt(i);
			//      ""  + e  == >e
			//       e  + n  == >en
			//       en + u  == >enu
			//       enu + p ==> enup 
		}
		
		System.out.println(rev3);
		
		String str24 = "hello";
		int counter = 0;
		//  0 1 2 3 4
		//  h e l l o
		
		for(int i = 0 ; i < str24.length();i++) {
			char a1 = str24.charAt(i);
			if(a1 == 'l') {
				counter = counter + 1;
			}
					
		}
		
		System.out.println(counter);
		
		
		
		
		
		
		
		
		
		
			
		
	}

}
