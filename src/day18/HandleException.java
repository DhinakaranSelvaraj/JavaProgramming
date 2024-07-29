package day18;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		// Ex:1
		System.out.println("Program is Started");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			System.out.println(100 / num);
		} catch (ArithmeticException e) {
			System.out.println("Invalid Data");
		}
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");

	}

}
