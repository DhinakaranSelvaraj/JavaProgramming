package day3;

public class ConditionalOperator {

	public static void main(String[] args) {
		//Conditional/ternary Operator
		//Syntax: var = exp ? result 1 : result 2
		//?: - condition ? if true : if false
		
		//Case 1
		int a = 100, b = 200;
		int x = (a>b) ? a : b;
		System.out.println(x);
		
		//Case 2
		int y = (1==1)?100:200;
		System.out.println(y);
		
		//Case 3
		int z = (1==2)?200:100;
		System.out.println(z);
		
		//Case 4
		int person_age = 30;
		String age = (person_age>=18)? "Eligable" : "Not Eligable";
		System.out.println(age);

	}

}
