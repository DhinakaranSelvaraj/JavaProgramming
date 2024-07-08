package day6;

public class ObjectTypeOfAnArray {

	public static void main(String[] args) {
		//int a[] = {100, 10.5,'A', "Welcome", true);
		Object a[] = {100, 10.5,'A', "Welcome", true};
		//Object -> Predefined class in Java just like String.
		System.out.println("Enhanced For loop");
		for(Object x:a) {
			System.out.println(x);
		}
		
		System.out.println("Normal For Loop");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
