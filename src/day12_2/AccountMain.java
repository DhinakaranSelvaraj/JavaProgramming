package day12_2;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccno(101);		
		acc.setAmount(1187687);
		acc.setName("Dhinakaran");
		
		System.out.println("Account Number " + acc.getAccno());
		System.out.println("Balance Mount " + acc.getAmount());
		System.out.println("Account Holder Name " + acc.getName());
		

	}

}
