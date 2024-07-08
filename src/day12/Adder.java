package day12;

public class Adder {
	
	int a = 10;
	int b = 10;
	
	//Method Overriding
	
	void sum() {	//1
		System.out.println(a+b);
	}
	
	void sum(int x, int y) {	//2 Number of Parameter should be different (1 & 2)
		System.out.println(x+y);
	}
	
	void sum(int x, double y) {	//3 Data type of Parameter should be different (2 & 3)
		System.out.println(x+y);
	}
	 
	void sum(double x, int y) {	//4 Data type of Parameter should be different (3 & 4)
		System.out.println(x+y);
	}
	
	void sum(int a, int b, int c) {	//5		//Definition
		System.out.println(a+b+c);			//Implementation
	}
	
}
