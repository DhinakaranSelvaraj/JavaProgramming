package day8;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		// Way 1
		String s = "Welcome";

		// Way 2
		String S = new String("Welcome");

		// 1. length() - Return length of the string(number of characters)
		System.out.println();
		System.out.println("Length Method");
		System.out.println(s.length());
		System.out.println("Dhinakaran".length());

		// 2. concat() - Joining Strings
		System.out.println();
		System.out.println("Concat Method");
		String s1 = "Welcome ";
		String s2 = "to Java ";
		String s3 = "Automation";

		// Concat 2 string
		System.out.println(s1.concat(s2));

		// Concat 3 string
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2 + s3));
		System.out.println("Welcome ".concat("to java " + "Automation"));

		// trim() - Remove spaces from right and left side
		System.out.println();
		System.out.println("Trim Method");

		String s4 = "  Welcome  ";

		System.out.println(s4);
		System.out.println("Before Trimming " + s4.length());

		System.out.println(s4.trim());
		System.out.println("After Trimming " + s4.trim().length());

		// charAt() - Returns a character from a string based on index
		System.out.println();
		System.out.println("charAt");
		
		s = "Welcome";
		System.out.println(s.charAt(3));
		
		// contains() - Returns a character from a string based on index
		System.out.println();
		System.out.println("contains");
		
		String a = "Welcome";
		String a1 = "el";
		String a2 = "El";	//Case sensitive
		System.out.println(a.contains(a1));	//True
		System.out.println(a.contains(a2));	//False
		
		//equals() , equalsIgnoreCase() - Compare String
		System.out.println();
		System.out.println("equals() , equalsIgnoreCase()");
		
		String b1 = "Welcome";
		String b2 = "Welcome";
		String b3 = "weLcoMe";
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals("welcome"));
		System.out.println(b1.equalsIgnoreCase(b3));
		
		//replace() - Replace single/multiple(sequence) of characters in a string
		System.out.println();
		System.out.println("Replace()");
		
		S = "Welcome to selenium java selenium pythos selenium c#";
		System.out.println(S.replace('e', 'E'));
		System.out.println(S.replace("selenium", "Test"));
		
		//substring() - Extract substring from the main string
		// Starting index - 0
		// Ending index - 1
		System.out.println();
		System.out.println("substring()");
		
		S = "TESTJAVA";
		System.out.println(S.substring(2, 6));
		
		//toUpperCase() toLowerCase()
		System.out.println();
		System.out.println("toUpperCase() toLowerCase()");
		
		s = "weLcoMe";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split() - Split the string into multiple parts based on delimeter
		System.out.println();
		System.out.println("split()");
		
		s = "abc@gmail.com";
		String st[] = s.split("@");
		System.out.println(Arrays.toString(st));
		System.out.println(st[0]);
		System.out.println(st[1]);
		
		// Ex - 1
		String amount = "$15,20,55";
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		// Ex - 2
		s = "abc,123@xyz";	//abc 123 xyz 
		String arr1[] = s.split(",");
		System.out.println(Arrays.toString(arr1));
		
		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		// Ex - 3
		s = "abc 123";
		String ar[] = s.split(" ");
		System.out.println(Arrays.toString(ar));
		
		// * % ^ & ( ) - you cannot use this as delimeters		
		
		
		//Ex - 4
		String name = "John Kennady";
		System.out.println(name.contains("john")); //case sensitive
		System.out.println(name.replace('J', 'j').contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
	}

}
