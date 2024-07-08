package day10;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.sid = 18;
		stu1.sname = "Dhina";
		stu1.sgrade = 'A';
		stu1.sloc = "Pollatchi";
		stu1.printData();
		
		Student stu2 = new Student();
		stu2.sid = 19;
		stu2.sname = "Sunil";
		stu2.sgrade = 'B';
		stu2.printData();
		
		Student stu3 = new Student();
		stu3.sid = 10;
		stu3.sname = "Priya";
		stu3.sgrade = 'A';
		stu3.printData();

	}

}
