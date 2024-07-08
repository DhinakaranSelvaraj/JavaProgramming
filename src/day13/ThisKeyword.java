package day13;

public class ThisKeyword {
	int x, y; // Class Variables/instance variables

	ThisKeyword(int x, int y) {
		this.x = x; // Local Variables
		this.y = y; // this represents class
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword(100, 200);
		th.display();
	}

}
