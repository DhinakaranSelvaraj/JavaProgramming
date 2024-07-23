package day17;

public class DataConversionMethod {

	public static void main(String[] args) {
		
		//Scenario 1:	String ---> int, double, boolean
		//String --> int
		//String s = "Welcome";	//cannot convert to int
		String s = "123";
		int sint = Integer.parseInt(s);
		
		String s1 = "10";
		String s2 = "10";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

		//String --> double
		String a1 = "10.5";
		String a2 = "20.0";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
	
		//String --> boolean Accepts only True and False //Other than true, if you pass any string that will return false
		String S = "false";
		System.out.println(Boolean.parseBoolean(S));
		
		
		//Scenario 2: int, double, boolean, char ---> String
		//int, double, boolean, chat ---> String
		
		int a = 10;
		double d = 10.5;
		char c = 'A';
		boolean boo = true;
		
		String aa = String.valueOf(a);
		System.out.println(aa);
		
		String dd = String.valueOf(d);
		System.out.println(dd);
		
		String cc =String.valueOf(c);
		System.out.println(cc);
		
		String bb = String.valueOf(boo);
		System.out.println(bb);
	}

}
