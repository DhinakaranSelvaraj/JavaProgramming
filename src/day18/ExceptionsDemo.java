package day18;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		//Ex:1
		System.out.println("Program is Started");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(100/num);	//Arithmetic Exception
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");
		// enter 0
		
		System.out.println();
		
		//EX:2
		int a[] = new int[5];
		System.out.println("Program is Started");
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the position(0-4)..");
		int pos = S.nextInt();
		System.out.println("ENter the value");
		int val = S.nextInt();
		
		a[pos]=val;
		System.out.println(a[pos]);
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");
		// enter 5
		
		System.out.println();
		
		//EX:3
		String s = "12345"; //enter "welcome"
		int number = Integer.parseInt(s);
		System.out.println(number);
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");
		
		System.out.println();
		
		//EX:4
		//NullPointerException
		String s1="Welcome"; //Mention null
		System.out.println(s1.length());
		
	}

}
