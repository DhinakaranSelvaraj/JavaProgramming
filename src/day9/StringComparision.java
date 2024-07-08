package day9;

public class StringComparision {

	public static void main(String[] args) {
		//Case 1: String Comparison 
		System.out.println("Case 1");
		String s1 = "Welcome";
		String s2 = "Welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//Case 2: String Comparison 
		System.out.println("Case 2");
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		System.out.println(s3==s4); //False
		System.out.println(s3.equals(s4)); //True
		
		// == used for compare the object
		// equals used for compare values of object
		
		//Case 3: String Comparison 
		System.out.println("Case 3");
		String ss1 = "abc";
		String ss2 = new String("abc");
		
		System.out.println(ss1==ss2);
		System.out.println(ss1.equals(ss2));
		
		//Case 4: String Comparison 
		System.out.println("Case 4");
		String a1 = "abc";
		String a2 = new String ("abc");
		String a3 = a2;
		
		System.out.println(a1==a2); //Obj are different
		System.out.println(a1.equals(a2)); //Values are same
		
		System.out.println(a2==a3); //Obj are same
		System.out.println(a2.equals(a3)); //Values are same
		System.out.println(a1==a3); //Obj are different
		System.out.println(a1.equals(a3)); //Values are same
		
	}

}
