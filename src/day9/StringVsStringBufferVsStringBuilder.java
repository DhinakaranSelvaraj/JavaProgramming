package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String - Immutable
		String s = "Welcome";
		s.concat("To String");
		System.out.println(s); //We cannot change the original value of the variable
		
		//StringBuffer - Mutable
		StringBuffer sbf = new StringBuffer("Welcome");
		sbf.append(" To Java");
		System.out.println(sbf); //We can change the original value of the variable
		
		//StringBuilder - Mutable
		StringBuilder sb = new StringBuilder("Welcome");
		sb.append(" To Java");
		System.out.println(sb); //We can change the original value of the variable
	}

}
