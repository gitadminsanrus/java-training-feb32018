package accessmodifiers.bank;

public class BankAccount {
	
	public String name;//name variable is visible to all the classes.
	String accNo;//default access => accNo is visible to any class in the current package/folder.
	protected double balance;//is visible to only BankAccount class.
	
	BankAccount(String name, String accNo, double balance) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	void credit(double amount) {
		this.balance += amount;
	}
	
	void debit(double amount) {
		this.balance -= amount;
	}

}
