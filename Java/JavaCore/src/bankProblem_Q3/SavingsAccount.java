package bankProblem_Q3;

public class SavingsAccount extends  Bank{
	
	private static int fixedDeposit;
	
	public SavingsAccount() {}

	public SavingsAccount(long accountNumber) {
		super(accountNumber);
		fixedDeposit =0;
	}
	
	@Override
	public long getAccountNumber() {
		return super.getAccountNumber();
	}
	
	public int getFixedDeposit() {
		return fixedDeposit;
	}

	public static void transactionAmount(int amount) {
		fixedDeposit = amount;
		Bank.transactionAmount(fixedDeposit);
	}

	@Override
	public String toString() {
		return String.format("SavingsAccount [ AccountNumber = %s, "
				+ "fixedDeposit = %s]", getAccountNumber(), fixedDeposit);
	}
	
	
}