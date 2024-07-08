package day6;

public class Assignment2 {

	public static void main(String[] args) {
//		2. Print Even and Odd numbers from array
//		a={1,2,3,4,5,6}
//		Even = 3
//		Odd = 3

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int e = 0;
		int o = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				e++;
			} else {
				o++;
			}
		}
		System.out.println("Even Number count is " + e);
		System.out.println("Odd Number count is " + o);
	}

}
