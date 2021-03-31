package springcore.com;

public class BankAccountcontroller {
	private BankAccountServiceImpl bankAccountServiceImpl;
	public BankAccountcontroller() {
		super();
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}
	public double withdraw(int accountId, double balance) {
		return bankAccountServiceImpl.withdraw(accountId, balance);
	}
	public double deposit(int accountId, double balance) {
		return bankAccountServiceImpl.deposit(accountId, balance);
	}
	public double getBalance(int accountId) {
		return bankAccountServiceImpl.getBalance(accountId);
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return bankAccountServiceImpl.fundTransfer(fromAccount, toAccount, toAccount);
	}
}
