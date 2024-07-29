package day18_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Program is Started");
		System.out.println("Program in progress");
		
//		try {
//		Thread.sleep(5000);
//		}
//		catch(InterruptedException e)
//		{
//			
//		}	
		
		Thread.sleep(5000);
		
		FileInputStream file = new FileInputStream("C:\\Text.txt");
		
		System.out.println("Program is finished");
		System.out.println("Program is Exited");

	}

}
