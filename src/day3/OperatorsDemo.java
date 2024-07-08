package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		// 1) Arithmetic Operators [+ - * / %] Numeric type of data
		int A = 30, B = 20;
		System.out.println("Arithmetic Operators");
		System.out.println("Sum of A and B is: " + (A + B));
		int result = A+B;
		System.out.println("Sum of A and B is: " + result);
		
		System.out.println("Diff of A and B is: " + (A - B));
		System.out.println("Multiplication of A and B is: " + (A * B));
		System.out.println("Division of A and B is: " + (A / B));
		System.out.println("Modulo division of A and B is: " + (A % B));
		
		// 2) Relational/Comparison operators [> >= < <= != ==] Used to compare the values, used in Conditional statement and looping statement.
		// It is used between two variables, these two variables can be any data type.
		// Always return the boolean value - True/False
		System.out.println("Relational/Comparison operators");
		System.out.println(A>B); //True
		System.out.println(A<B); //False
		System.out.println(A>=B); //True
		System.out.println(A<=B); //False
		System.out.println(A!=B); //True
		System.out.println(A==B); //False
		
		B = 30;
		System.out.println(A==B); //True
		System.out.println(A!=B); //False
		
		boolean res = A>B;
		System.out.println(res); //False
		
		String S = "STR";
		String G = "GANGA";
		System.out.println(S==G); //False
		
		// 3) Logical Operators [&& || !]
		// It works between two boolean data type only.
		// Always return the boolean value - True/False 
		
		boolean x = true;
		boolean y = false;
		System.out.println("Logical Operators");
		System.out.println(x&&y); //False
		System.out.println(x||y); //False
		System.out.println(!x); //False
		System.out.println(!y); //True
		
		boolean b1 = 10>20; //False
		boolean b2 = 20>10; //True
		System.out.println(b1&&b2); //False
		System.out.println(b1||b2); //True
		System.out.println(!b1); //True
		System.out.println((10<20) && (20>10)); //True
		
	}

}
