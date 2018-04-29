
public class AccountDebitTask implements Runnable {
	
	private BankAccount bankAccount;
	
	public AccountDebitTask(BankAccount bankAccount) {
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
			bankAccount.debit(10);
		}
	}

}
