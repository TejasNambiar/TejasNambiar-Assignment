package bankProblem_Q3;

public class CurrentAccount extends Bank{
	
	private static int cashCredit;
	
	public CurrentAccount() {}
	
	public CurrentAccount(long accountNumber) {
		super(accountNumber);
		cashCredit = 0;
	}
	
	@Override
	public long getAccountNumber() {
		return super.getAccountNumber();
	}
	
	public int getCashCredit() {
		return cashCredit;
	}
	
	public static void transactionAmount(int amount) {
		cashCredit = amount;
		Bank.transactionAmount(-1*cashCredit);
	}

	@Override
	public String toString() {
		return String.format("CurrentAccount [ AccountNumber = %s, cashCredit = %s]", getAccountNumber(), cashCredit);
	}
	
	

}
