package day15;

public class SuperKeyword {

	String color = "White";
	
	void eat() {
		System.out.println("eating....");
	}
}

class Dog extends SuperKeyword {
	String color = "Black";

	void displaycolor() {
		System.out.println(color);
		System.out.println(super.color); //invoke immediate parent class variable
	}
	
	void eat() {
		System.out.println("sleeping...");
		super.eat();
	}

}
