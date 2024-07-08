package day12;

public class AdderMain {

	public static void main(String[] args) {
		Adder addobj = new Adder();
		addobj.sum();		//1
		addobj.sum(1, 2);	//2
		addobj.sum(3, 4.5);	//3
		addobj.sum(6.5, 5);	//4
		addobj.sum(7, 8, 9);//5
	}

}
