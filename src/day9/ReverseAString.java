package day9;

public class ReverseAString {

	public static void main(String[] args) {

		// Approach 1 - length(), charAt()
		System.out.println("Approach 1");

		String s = "Welcome";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// Approach 2 Converting string to char array type
		System.out.println("Approach 2");
		s = "Welcome";
		rev = "";

		char a[] = s.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
		rev = rev + a[i];	
		}System.out.println(rev);
		
		//Approach 3 Using String Buffer class
		System.out.println("Approach 3");
		StringBuffer s1 = new StringBuffer("Welcome");
		System.out.println(s1.reverse());
		
		//Approach 4 Using String Builder class
		System.out.println("Approach 4");
		StringBuilder s2 = new StringBuilder ("Welcome");
		System.out.println(s2.reverse());
		
	}

}
