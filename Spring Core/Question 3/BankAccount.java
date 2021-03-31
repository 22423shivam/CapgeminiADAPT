package springcore.com;

public class BankAccount {
	int accountId;
	double accountBalance;
	String accountHolderName, accountType;


	public BankAccount(int accountId, double accountBalance, String accountHolderName, String accountType) {
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}


	public int getAccountId() {
		return accountId;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + "]";
	}

	public void setAccountBalance(double d) {
		this.accountBalance=accountBalance;
		
	}
}
