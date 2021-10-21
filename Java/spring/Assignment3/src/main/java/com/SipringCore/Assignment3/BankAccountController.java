package com.SipringCore.Assignment3;

public class BankAccountController {
	
	BankAccountService bankServ;

	public BankAccountService getBankServ() {
		return bankServ;
	}

	public void setBankServ(BankAccountService bankServ) {
		this.bankServ = bankServ;
	}

	public double withdraw(long accountId, double balance) {
		return bankServ.withdraw(accountId, balance);
	}

	public double deposit(long accountId, double balance) {
		
		return bankServ.deposit(accountId, balance);
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return bankServ.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		// TODO Auto-generated method stub
		return bankServ.fundTransfer(fromAccount, toAccount, amount);
	}

	@Override
	public String toString() {
		return "BankAccountController [bankServ=" + bankServ + "]";
	}
	
	
}
