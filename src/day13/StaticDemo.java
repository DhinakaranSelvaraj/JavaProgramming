package day13;

public class StaticDemo {

	static int a = 10; // static variable
	int b = 20; // non static

	static void m1() { // static method
		System.out.println("This is m1 static method...");
	}

	void m2() { // non static method
		System.out.println("This is m2 non static method...");
	}
	
	
	void m() {	//3) Non static method can access everything directly
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) { // For static variable and method, we do not need any obj
		System.out.println(a);	//1) Static methods can access static stuff directly (without object)
		m1();

		//System.out.println(b); cannot access, b is non static
		//m2(); cannot access, m2 is non static
		
		
		// 2) Static methods can access non static stuff through object.
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		System.out.println();
		sd.m();
		
		
	}

}
