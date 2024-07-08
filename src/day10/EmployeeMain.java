package day10;
import day10_2.Employee_2;

public class EmployeeMain {

	public static void main(String[] args) {
			Employee emp1 = new Employee(); //Object
			emp1.eid = 101;
			emp1.ename = "John";
			emp1.job = "Manager";
			emp1.sal = 40000;
			emp1.display();
			System.out.println();

			Employee_2 emp2 = new Employee_2(); //Object
			emp2.eid = 102;
			emp2.ename = "Dhina";
			emp2.job = "Test Manager";
			emp2.sal = 45000;
			emp2.place = "Tiruvanmiyur";
			emp2.display();
		

	}

}
