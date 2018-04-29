
public class BankThreadDemo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(100);
		
		AccountCreditTask creditTask = new AccountCreditTask(account);
		AccountDebitTask debitTask = new AccountDebitTask(account);
		
		Thread debitWorker = new Thread(debitTask);
		Thread creditWorker = new Thread(creditTask);
		
		debitWorker.start();
		creditWorker.start();
		
	}
}
