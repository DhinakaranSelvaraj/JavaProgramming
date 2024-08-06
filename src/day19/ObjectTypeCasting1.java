package day19;

class Parent{
	String name = "John";
	void m1() {
		System.out.println("This is M1 from Parent Class");
	}
}

class Child extends Parent{
	int id = 101;
	void m2() {
		System.out.println("This is M2 from Child Class");
	}
}


public class ObjectTypeCasting1 {

	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		Parent p = new Child();	//upcasting.... Parent Class reference variable can hold child class object
		System.out.println(p.name);	//Parent
		p.m1();	//Parent
		//System.out.println(p.id); We cannot access
		//p.m2; We cannot access
		
		
		//Not Possible
		Parent p1 = new Parent();
		
		Child c1 = (Child) p1; //Downcasting
		System.out.println(c1.name);
		System.out.println(c1.id);
		c1.m1();
		c1.m2();
		
	}

}
