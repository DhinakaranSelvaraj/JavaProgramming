package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program is Started....");

		String s = null;
		try {
			System.out.println(s.length());
		} catch(Exception e) {
			System.out.println("Catch Block Handled Exception ..");
			System.out.println(e.getMessage());
		}
		
//		catch(NumberFormatExcepton e) {
//			System.out.println("Catch Block Handled Exception ..");
//			System.out.println(e.getMessage());
//		}
		
		finally
		{
			System.out.println("You entered into finally block");
		}
		
		System.out.println("Program finished......");

	}

}
