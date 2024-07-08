package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Declare an array
		// Add values into array
		// Find length of an array
		// Read single value from an array
		// Read multiple value from an array

		// Declare an Array & Add values into array
		// Approach 1
		int a[][] = new int[3][2]; // a[][], [][]a, []a[]
		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		// Approach 2
		int b[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		// Find length of an array
		System.out.println("Length of row is " + b.length);
		System.out.println("Length of column is " + b[0].length);

		// Read single value from an array
		System.out.println("2nd row and 1st column value is " + a[2][1]);

		// Read multiple value from an array
		System.out.println("Nested For Loop");
		// Nested For Loop
		int i, j;
		for (i = 0; i < b.length; i++) { // 0 1 2
			for (j = 0; j < b[i].length; j++) { // 0 1 0 1 0 1
				System.out.print(b[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("Enhanced For Loop");
		//Enhanced For Loop
		for(int arr[]:a) {  //F6 for next step in debug mode
			//System.out.println(arr[0]+"  "+arr[1]);
			for(int x:arr) {
				System.out.println(x);
			}
		}
		
	}
}
