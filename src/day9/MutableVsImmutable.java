package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		// Mutable can change
		System.out.println("Mutable");
		int a[] = {20,10,40,50,30};		
		System.out.println(Arrays.toString(a));		
		Arrays.sort(a); //Mutable		
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		//Immutable cannot change
		System.out.println("Immutable");
		String s = new String ("Welcome");
		System.out.println(s);
		s.concat("to Java"); //Immutable
		System.out.println(s);
		
		//If a method can change the original values in one variable is called Mutable
		//If a method cannot change the original values in one variable is called Immutable
		//String is Immutable
	}

}
