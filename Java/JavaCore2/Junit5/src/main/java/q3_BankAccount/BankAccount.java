package q3_BankAccount;

public class BankAccount {
	private long id;
	private double balance;
	
	public BankAccount() {}
	
	public BankAccount(long id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public long getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException, IllegalBankTransactionException {
		
		if(getBalance() <amount)
			throw new InsufficientFundsException("Your withdrawal amount exceeds your balance by "+(getBalance() - amount)+"");
		if(amount<0)
			throw new IllegalBankTransactionException("Illegal withdrawal amount requested. Please enter appropriate POSITIVE value ");
		
		this.balance -= amount;
		return this.balance;
	}
	
}
