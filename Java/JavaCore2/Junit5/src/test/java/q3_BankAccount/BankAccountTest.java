package q3_BankAccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Once BankAccountTest is initalized, ")
class BankAccountTest {
	
	BankAccount bankAccount;
	
	@BeforeEach
	void Init() {
		// providing dummy data
		bankAccount = new BankAccount(108734, 2000);
	}

	@Test
	@DisplayName("tests the Withdraw method")
	void testWithdrawMethod(){
		assertThrows(InsufficientFundsException.class, ()-> bankAccount.withdraw(2001));
	}

}
