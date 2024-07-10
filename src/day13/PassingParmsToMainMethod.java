package day13;

public class PassingParmsToMainMethod {

	public static void main(String[] args) {
		
		
		System.out.println(args.length);
		
		for(String value:args) {
			System.out.println(value);
		}
		// Run -> Run in configuration, Pass parameters in arguments

	}

}
