package day13;

public class StaticMain {

	public static void main(String[] args) {
		
		//We put class name first for telling this is a static variable and method from one particular class.
		System.out.println(StaticDemo.a);	//1) Static methods can access static stuff directly (without object)
		StaticDemo.m1();
		
		// 2) Static methods can access non static stuff through object.
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		System.out.println();
		sd.m();
		
		

	}

}
