package day11;

public class Greetings {
	// 1. No Parameter - No Return Value
	void m1() {
		System.out.println("No Parameter - No Return Value");
	}

	// 2. No Parameter - Return Value
	String m2() {
		return "No Parameter - Return Value";
	}

	// 3. Takes Parameter - No Return Value
	void m3(String name, int id) {
		System.out.println("Takes Parameter	- No Return Value " + name + id);
	}

	// 4. Takes Parameter - Return Value
	String m4(String name, String city) {
		return("Takes Parameter - Return Value " + name + city);
	}
}
