package bankExceptions;

public class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 4458831360947178711L;
	
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
