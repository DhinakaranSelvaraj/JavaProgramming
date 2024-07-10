package Day14;


//One main class only should have the public class modifier

class A{
	int a = 100;
	void display() {
		System.out.println(a);
	}
}


class B extends A{
	int b = 200;
	void show() {
		System.out.println(b);
	}
}

class C extends B{
	int c;
	void print() {
		System.out.println(c);
	}
}




public class InheritanceTypes {

	public static void main(String[] args) {
		B bobj = new B();
		System.out.println("Single Inheritance");
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		bobj.display();
		bobj.show();
		System.out.println();
		
		System.out.println("Multi-level Inheritance");
		C cobj = new C();
		cobj.c = 10;
		int S = cobj.a+cobj.b+cobj.c;
		System.out.println(S);
		cobj.display();
		cobj.show();
		cobj.print();
		System.out.println();
		
		
	}

}
