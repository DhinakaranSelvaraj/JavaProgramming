package day15;

class bank {
	double roi() {
		return 0;
	}
}

class ICICI extends bank {
	double roi() {		//method is override, same definition different implementation
		return 10.5;
	}
}

class SBI extends bank {
	double roi() {
		return 15;
	}
}

public class OverrdingDemo {

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		System.out.println(ic.roi());
		
		SBI sb = new SBI();
		System.out.println(sb.roi());
	}

}
