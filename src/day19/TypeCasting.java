package day19;

//Upcasting - Converting value from smaller to larger - Automatic Process
// int --> long
//float --> double

//downcasting - Converting value from larger to smaller - Manual Process
//long -->int
//double --float


public class TypeCasting {

	public static void main(String[] args) {
		//upcasting - automatic process
		int intval=100;
		long longval=intval;
		System.out.println(longval);
		
		float f = 10.5f;
		double d = f;
		System.out.println(d);
		
		//downcasting - Manual Process
		long lo = 1000000;
		int iv = (int)lo;
		
		double dd = 125.55;
		float fv = (float)dd;
		
		//EX:1
		int i1 = 100;
		double d1 = i1;
		System.out.println(d1);
		
		//Ex:2
		double d2 =10.5;
		int i2 = (int)d2; //disadvantage: double to int, leave decimal number
		System.out.println(i2);
		
		
	}
}
