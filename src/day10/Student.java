package day10;

public class Student {
	int sid;
	String sname;
	char sgrade;
	String sloc = "Chennai";
	
	void printData() {
		System.out.println("The Student ID is "+sid+", The Student Name is "+sname+", The Student Grade is "+sgrade+", The student Location is "+sloc);
	}
}
