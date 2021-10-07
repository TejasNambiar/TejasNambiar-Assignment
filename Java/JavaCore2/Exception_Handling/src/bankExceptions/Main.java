package bankExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		SavingsAccount accountHolder = new SavingsAccount();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		accountHolder = new SavingsAccount(104759374839L, 2000);
		int option =0;
		do {
			try {
				System.out.println("Enter option 1. Withdraw 2.Deposit 3. Exit");
				option = Integer.parseInt(reader.readLine());
				if(option == 1) {	
					System.out.println("enter amount to withdraw: ");
					int amount = Integer.parseInt(reader.readLine());
					System.out.println("Amount Withdrawn: "+accountHolder.withdraw(amount));
				}
				if(option == 2) {	
					System.out.println("enter amount to deposit: ");
					int amount = Integer.parseInt(reader.readLine());
					System.out.println("Amount deposited: "+accountHolder.deposit(amount));
				}
			} catch (Exception e) {
				System.out.println("Account transaction failed");
				System.out.println("Reason for failure: "+e.getMessage());
			}finally {
				System.out.println("Final balance in account: "+accountHolder.getBalance());
			}
		}while(option != 3);
		System.out.println("Thanks for doing business with us.");
	}

}
