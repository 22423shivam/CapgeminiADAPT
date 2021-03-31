package springcore.com;

public interface BankAccountService {
	public double withdraw(int accountId, double balance);
	public double deposit(int accountId, double balance); 
	public double getBalance(int accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amount);
		
}
