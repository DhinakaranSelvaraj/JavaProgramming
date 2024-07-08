package day5_2;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i == 5 || i == 9) {
				continue; // Continue will execute increment part if it is true, it will not print the value.
			}	//Continue is a Jumping statement
			System.out.println(i);

		}

	}
}
