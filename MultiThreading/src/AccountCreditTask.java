
public class AccountCreditTask implements Runnable {
	
	private BankAccount bankAccount;
	
	public AccountCreditTask(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			bankAccount.credit(10);
		}
	}
	
}
