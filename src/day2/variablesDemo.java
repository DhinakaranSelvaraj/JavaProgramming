package day2;

public class variablesDemo {

	public static void main(String[] args) {
		/*
		 * int a; // declaration a = 100; // assignment int a1 = 100; //
		 * declaration+assignment
		 * 
		 * System.out.println(a); System.out.println(a1); System.out.println("a");
		 * 
		 * a= 200;
		 * 
		 * System.out.println(a);
		 */

		// Approach 1
		/*
		 * int a = 100; int b = 200; int c = 300; //if all variable are belongs to diff
		 * data type
		 */

		// Approach 2
		/*
		 * int a, b, c; a = 100; b = 200; c = 300;
		 */ // if all variable are belongs to same data type

		// Approach 3
		int a = 100, b = 200, c = 300; // if all variable are belongs to same data type
		System.out.println("the value of A is:"+a); //Concatenation
		System.out.println("the value of B is:"+b);
		System.out.println("the value of C is:"+c);
		
		//Single statement for print all the values
		
		System.out.println(a+b+c); //it will perform addition
		
		//Ans
		System.out.println(a+" "+b+" "+c);
		
	}

}
