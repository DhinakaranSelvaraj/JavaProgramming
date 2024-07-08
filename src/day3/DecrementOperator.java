package day3;

public class DecrementOperator {

	public static void main(String[] args) {
		// 3) Increment and Decrement Operators [++ --]
				// -- is called Decrement Operator
				
				//Case 1
				int a = 10;
				System.out.println(a);
				
				a = a-1;
				System.out.println(a);
				
				a--;
				System.out.println(a);
				
				
				//Case 2 - Post Decrement
				int b = 10;
				int res = b--;
				System.out.println(res); 
				System.out.println(b);

				//Case 3 - Pre Decrement
				int c =10;
				int resc = --c; 
				System.out.println(resc);

	}

}
