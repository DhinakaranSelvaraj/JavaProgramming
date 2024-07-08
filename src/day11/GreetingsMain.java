package day11;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings gr = new Greetings();
		gr.m1(); //m1
		
		//String s = gr.m2(); // If a method is returning some value, we have to hold that in one variable
		System.out.println(gr.m2()); //m2
		
		gr.m3("John Kennady", 21); //m3
		
		String o = gr.m4("Dhina", "Chennai");
		System.out.println(o); //m4
	}

}
