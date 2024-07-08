package day5;

public class WhileVsDoWhileLoop {

	public static void main(String[] args) {
		int i = 10;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		int I = 10;
		do {
			System.out.println(I);
			I++;
		}while(I<5);

	}

}

//If condition is not satisfied in While Loop it will not execute any code. but in Do While if condition is not satisfied it will execute at least one time.
