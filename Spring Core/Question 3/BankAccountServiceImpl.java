package springcore.com;

public class BankAccountServiceImpl implements BankAccountService {
BankAccountRepositoryImpl bankAccountRepositoryImpl=null;

	
	public BankAccountServiceImpl(
			BankAccountRepositoryImpl bankAccountRepositoryImpl) {
		super();
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}


	@Override
	public double withdraw(int accountId, double balance) {
		return bankAccountRepositoryImpl.updateBalance(accountId, balance, "withdraw");
	}


	@Override
	public double deposit(int accountId, double balance) {
		return bankAccountRepositoryImpl.updateBalance(accountId, balance, "deposit");
	}


	@Override
	public double getBalance(int accountId) {
		return bankAccountRepositoryImpl.getBalance(accountId);
	}


	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		double account1=withdraw((int) fromAccount, amount);
		if(account1!=0){
			double account2=deposit((int) toAccount, amount);
			if(account2!=0){
				return true;
			}
			deposit((int) fromAccount, amount);
		}

		return false;
	}

	




}
