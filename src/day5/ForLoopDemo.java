package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		// EX:1 Print 1 to 10
		System.out.println("Example 1");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// EX:2 Print 1 to 10 Even numbers
		System.out.println("Example 2");

		for (int I = 2; I <= 10; I += 2) {

			System.out.println(I);

		}
		
		// EX:3 Print 1 to 10 Odd and Even numbers
		System.out.println("Example 3");
		
		for(int a=1; a<=10; a++) {
			if(a%2==0) {
				System.out.println(a+" is Even");
			}else
			{
				System.out.println(a+" is Odd");
			}
		}
		
		// EX:4 Print 10 to 1 in descending order
		System.out.println("Example 4");

		for(int b = 10; b>0; b--) {
			System.out.println(b);
		}
	}

}
