package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		//Declare an array
		//Add values into array
		//Find length of an array
		//Read single value from an array
		//Read multiple value from an array

		// Declare an Array & Add values into array
		// Approach 1 - Criteria ->Already know how many data we have to store and we
		// don't add any data in future, we can use this approach.
		int a[] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		// Approach 2 - Criteria -> We don't know how many data we are going to store
		// and how many data we will add in future, we can go with 2nd approach. It is
		// more dynamic.
		int b[] = { 100, 200, 300, 400, 500 };
		
		//Find length of an Array - > a.length
		System.out.println("Length of an Array a is "+a.length+", Length of an Array b is "+b.length);
		
		//Read single value from an array
		System.out.println(a[4]); //4 is index number
		
		System.out.println("Normal For Loop");
		//Read multiple value from an array
		//For Loop  - Normal for loop
		for(int i=0; i<a.length; i++) {    //Initialization -> Index[0], Incrementation -> ++, Condition -> a.length means a[4]...for(int i=0; i<=a.length-1; i++)
			System.out.println(a[i]);	  // i<=4, i<5, i<=a.length-1, i<a.length
		}
		
		System.out.println("Enhanced For Loop");
		//Enhanced For loop or For each loop -> Use this in Array and Collection Concepts
		for(int x:a) {
			System.out.println(x);
		}
		
	}
}
