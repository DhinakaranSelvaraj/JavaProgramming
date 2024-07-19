package day16;

interface shape {
	int length = 10; // final and static variable
	int width = 20;

	void circle(); // Abstract method

	default void square() { // Default method
		System.out.println("This is default method");
	}

	static void rectangle() {	//Static method
		System.out.println("This is static method");
	}
}

public class Interfacedemo implements shape{
	
	public void circle(){	//Should specify PUBLIC access modifier when we implement abstract method into class
		System.out.println("This is Abstract Method");
	}
	
	void triangle() {
		System.out.println(length*width);
	}

	public static void main(String[] args) {
		Interfacedemo idobj = new Interfacedemo();
		idobj.circle();	//abstract
		idobj.square();	//default
		shape.rectangle();	//We have to specify the Interface name. bcz it is static method not created under Class (rectangle()). It is created under interface.  For Static methods, Obj is not needed.
		idobj.triangle();
		
		shape sp = new Interfacedemo();	//Object we cannot create for the interface
		sp.circle();
		sp.square();
		shape.rectangle();	//Static method can directly access from interface
		//sp.triangle()	//we cannot access class methods through Inheritance
		
		System.out.println(shape.length*shape.width);	//Access static variable directly by class or index name, obj is not needed
	
	}

}
