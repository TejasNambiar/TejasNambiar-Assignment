package bankExceptions;

public class IllegalBankTransactionException extends Exception {

	private static final long serialVersionUID = 1545062053761056200L;

	public IllegalBankTransactionException() {}

	public IllegalBankTransactionException(String message) {
		super(message);
	}


}
