package bankExceptions;

public class SavingsAccount {
	private long id;
	private double balance;
	
	public SavingsAccount() {}
	
	public SavingsAccount(long id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public long getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	
	public double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
		
		if(getBalance() <amount)
			throw new InsufficientBalanceException("Your withdrawal amount exceeds your balance by "+(getBalance() - amount)+"");
		if(amount<0)
			throw new IllegalBankTransactionException("Illegal withdrawal amount requested. Please enter appropriate POSITIVE value ");
		
		this.balance -= amount;
		return this.balance;
	}
	
	public double deposit(double amount)throws IllegalBankTransactionException {
		
		if(amount<0)
			throw new IllegalBankTransactionException("Illegal withdrawal amount requested. Please enter appropriate POSITIVE value ");
		
		this.balance += amount;
		return this.balance;
	}
	
}
