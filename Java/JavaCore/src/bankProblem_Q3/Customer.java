package bankProblem_Q3;

public class Customer {

	public static void main(String[] args) {
		
		SavingsAccount customer = new SavingsAccount();
		CurrentAccount customer2 = new CurrentAccount();
	
		customer = new SavingsAccount(10384750);
		customer2 = new CurrentAccount(1039848);
		
		System.out.println("Account number: "+customer.getAccountNumber());
		customer.transactionAmount(40000);
		System.out.println("Customer Info : "+customer);
		System.out.println("total amount in bank: "+Bank.getTotalCash());
		
		System.out.println("Account number: "+customer2.getAccountNumber());
		customer2.transactionAmount(4000);
		System.out.println("Customer Info : "+customer2);
		System.out.println("total amount in bank: "+Bank.getTotalCash());
		
	}

}
