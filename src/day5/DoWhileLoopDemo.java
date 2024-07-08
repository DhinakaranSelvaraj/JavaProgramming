package day5;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		//EX:- 1 Print 1 to 10 numbers
		System.out.println("Example 1");
		int i = 1;
		do {
			System.out.println(i);
			i++;			
		}while(i<=10);
		
		//EX:- 2 Print 10 to 1 numbers
		System.out.println("Example 2");
		int a = 10;
		do {
			System.out.println(a);
			a--;
		}while(a>0);

	}

}
