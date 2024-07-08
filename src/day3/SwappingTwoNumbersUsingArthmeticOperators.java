package day3;

public class SwappingTwoNumbersUsingArthmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		a = a+b; //10+20=30
		b = a-b; //30-20=10
		a = a-b; //30-10=20
		
		System.out.println("A value is:"+a);
		System.out.println("B value is:"+b);
		
		int c = 10;
		int d = 20;
		
		c = c*d; //10*20=200
		d = c/d; //200/20=10
		c = c/d; //200/10=20
		System.out.println("C value is:"+c);
		System.out.println("D value is:"+d);

	}

}
