
public class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public synchronized void credit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Balance after credit = " + balance);
		}
	}
	
	public synchronized void debit(double amount) {
		if (amount > 0 
				&& balance >= amount) {
			balance -= amount;
			System.out.println("Balance after debit = " + balance);
		}
	}

}
