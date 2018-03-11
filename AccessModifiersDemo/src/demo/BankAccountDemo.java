package demo;

import accessmodifiers.bank.BankAccount;

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount savingsAccount = new BankAccount("Savings Account", "12345", 50);
		savingsAccount.balance = -100;
		savingsAccount.accNo = "12345";
		savingsAccount.name = "Savings A/C";
	}
}
