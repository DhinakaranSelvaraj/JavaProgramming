package day11;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student(111, "Bugs", 'O'); //(3) Passing parameter due to constructor
	
		// 1. Storing data using Object reference variables
//		stu.sid = 101;
//		stu.sname = "Dhina";
//		stu.grade = 'S';
//		stu.printStudentData();
		
		
		// 2. Using method we storing the data
//		stu.setStudentData(155, "Karan", 'D');
//		stu.printStudentData();
		
		// 3. Using Constructor - Constructor is a part of a class, it is also a method.
		stu.printStudentData();
	}

}
