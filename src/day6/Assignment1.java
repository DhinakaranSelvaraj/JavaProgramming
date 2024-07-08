package day6;

public class Assignment1 {

	public static void main(String[] args) {
//		1. Find Sum of an Array
//		a={1,2,3,4,5}
//		Sum=15
		
		int a[] = {1,2,3,4,5};
		int n=0;
		for(int i=0; i<a.length;i++) {
		n=n+a[i];
		}
		System.out.println(n);
	}

}
