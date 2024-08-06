package day19;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
//A b = (C) d;
public class TypeCastingObj {

	public static void main(String[] args) {
		
		//Rule 1: Conversion is valid or not (Cat) An
		//The type of 'd' and 'c' must have some relationship (either parent to child or child to parent)
		Animal An = new Dog();
		Cat ct = (Cat) An; //A b C d   Valid as per Rule 1
		
		Dog dg = new Dog();
		Cat ct2 = (Cat) dg; //Invalid as per Rule 1, No relation between (Cat) and dg
		
		//Rule 2: Assignment is valid or not
		// 'C' must be either same or child of 'A'
		Animal an1 = new Dog ();
		Cat ct3 = (Cat) an1;
		
		Animal an2 = new Dog();
		Cat ct4 = (Dog) an2;
		
		//Rule 3: The Underlying object type of 'd' must be either same or child of 'C'
		Animal an3 = new Dog(); //Show Run time Error
		Cat ct5 = (Cat) an3;	//Invalid as per Rule 3
		
		//Rule 1, 2, 3
		Animal an4 = new Dog();
		Dog dg2 = (Dog) an4;  //Rule 1, 2, 3 is satisfied
	}

}
