package day15_2;

class Test{
	int x = 100;	// final int x = 100;
}

public class FinalKeywordForVariable {

	public static void main(String[] args) {
		Test t = new Test();
		t.x=200;	//we cannot change the x value if it is declared with final x
		System.out.println(t.x);

	}

}
