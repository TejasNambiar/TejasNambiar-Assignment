package com.SipringCore.Assignment3;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccountRepository bankRepo;

	public BankAccountRepository getBankRepo() {
		return bankRepo;
	}

	public void setBankRepo(BankAccountRepository bankRepo) {
		this.bankRepo = bankRepo;
	}

	/**
	 * Withdrawing Money and calling getBalance() on account id to display new
	 * balance
	 */
	public double withdraw(long accountId, double balance) {
		return bankRepo.updateBalance(accountId, bankRepo.getBalance(accountId) - balance);
	}

	/**
	 * Depositing Money and calling getBalance() on account id to display new
	 * balance *
	 */
	public double deposit(long accountId, double balance) {
		return bankRepo.updateBalance(accountId, bankRepo.getBalance(accountId) + balance);
	}

	// returns balance based on account id
	public double getBalance(long accountId) {
		return bankRepo.getBalance(accountId);
	}

	/**
	 * Transferring Money ( fromAccount -> toAccount ) using updateBalance() by
	 * deducting fromAccount and incrementing toAccount
	 * 
	 */
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		bankRepo.updateBalance(fromAccount, bankRepo.getBalance(fromAccount) - amount);
		bankRepo.updateBalance(toAccount, bankRepo.getBalance(toAccount) + amount);
		return true;
	}

}