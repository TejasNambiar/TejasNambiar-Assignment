package bankProblem_Q3;

public class Bank {
	private static int totalCash;
	private long accountNumber;
	
	public Bank() {}

	public Bank(long accountNumber) {
		totalCash = 0;
		this.accountNumber = accountNumber;
	}

	public static int getTotalCash() {
		return totalCash;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return String.format("Bank [totalCash=%s, accountNumber=%s]", totalCash, accountNumber);
	}
	
	public static void transactionAmount(int amount) {
		System.out.println("~~~Inside bank transactionAmount~~~~");
		System.out.println("amount to update: "+amount);
		totalCash +=amount;
		System.out.println("TOTAL amount update: "+getTotalCash());
		System.out.println("~~~exit bank transactionAmount~~~~");
	};	
}
