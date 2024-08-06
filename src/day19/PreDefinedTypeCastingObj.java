package day19;
//A b = (C) d;
public class PreDefinedTypeCastingObj {

	public static void main(String[] args) {
		//Ex:1
		Object o = new String("WELCOME");
		StringBuffer sb = (StringBuffer) o;	//Rule 1, 2 -> Pass. Rule 3 -> Fail
		
		//Ex:2
		String s = new String ("Welcome");
		StringBuffer sb1 = (StringBuffer) s;	//Rule 1 is fail
		
		//EX:3
		Object o1 = new String("Welcome");
		StringBuffer sb2 = (String) o1; //Rule 1-> Pass, Rule 2 -> Fail
		
		//Ex:4 
		String s1 = new String("Welcome");
		StringBuffer sb3 = (String) s1; //Rule 1-> Pass, Rule 2 -> Fail
		
		//Ex:5
		Object o3 = new String("Welcome");
		StringBuffer sb4 = (StringBuffer) o3; //Rule 1, 2 -> Pass. Rule 3 -> Fail
		
		//Ex:6
		Object o4 = new String ("Welcome");//Rule 1, 2, 3 -> Pass
		String s2 = (String) o4; 
		System.out.println(s2);
		
	}

}
