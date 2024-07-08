package day4;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=100, b=20, c=30;
		if(a>b && a>c) {
			System.out.println(a+" is greater then "+b+", "+c);
		}
		else if(b>a && b>c) {
			System.out.println(b+" is greater then "+a+", "+c);
		}
		else {
			System.out.println(c+" is greater then "+a+", "+b);
		}

	}

}
