package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// EX:1 Print 1 to 10
		System.out.println("Example 1");
		int i = 1; // Initialization
		while (i <= 10) // Condition
		{
			System.out.println(i);
			i++; // Inc
		}

		// EX:2 To print Hello message 10 times
		System.out.println("Example 2");
		int d = 1;
		while (d <= 10) {
			System.out.println("Hello");
			d++;
		}

		// EX:3 Print even numbers between 1 to 10 (2,4,6,8)
		System.out.println("Example 3");
		System.out.println("Approach 1");
		// Approach 1
		int b = 2;
		while (b <= 10) {
			System.out.println(b);
			b += 2; // i=i+2;
		}

		// Approach 2
		System.out.println("Approach 2");
		int c = 1;
		while (c <= 10) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			c++;
		}

		// EX:4 1 is Odd, 2 is even, 3 is odd (inside the looping statement also we use conditional statement)
		System.out.println("Example 4");
		int e = 1;
		while (e <= 10) {
			if (e % 2 == 0) {
				System.out.println(e + " is a even number");
			} else {
				System.out.println(e + " is a Odd number");
			}
			e++;
		}

		// EX:5 Print 10 to 1 in descending order
		System.out.println("Example 5");
		int f = 10;
		while (f > 0) {
			System.out.println(f);
			f--;
		}
	}

}
