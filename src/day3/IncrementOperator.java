package day3;

public class IncrementOperator {

	public static void main(String[] args) {
		// 3) Increment and Decrement Operators [++ --]
		// ++ is called Increment Operator
		
		//Case 1
		int a = 10;
		System.out.println(a);
		
		a = a+1;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		
		//Case 2 - Post Increment
		int b = 10;
		int res = b++; //First the data assigned to the variable then increment will happen. b assigned to res, then ++ will execute. SO only the result is printed as 10. Assignment -> Increment
		System.out.println(res); //we assigning b value into res and declare res
		System.out.println(b); //We declare the b straightly

		//Case 3 - Pre Increment
		int c =10;
		int resc = ++c; //First increment will happen after assignment will happen. Increment -> Assignment
		System.out.println(resc);
		
		
	}

}
