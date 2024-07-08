package day11;

public class Constructor {
	
	int x,y;
	
	Constructor(){ //Default Constructor
		x = 100;
		y = 200;
	}
	
	Constructor(int a, int b){ //Parameterized Constructor
		x = a;
		y = b;	
	}
	
	void sum() {
		System.out.println(x+y);
	}

	
	public static void main(String[] args) {
		
		//Constructor cd = new Constructor(); //invoke Default Constructor
		Constructor cd = new Constructor(10,20); //invoke Parameterized Constructor
		cd.sum();
		

	}

}
