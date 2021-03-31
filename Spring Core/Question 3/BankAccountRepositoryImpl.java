package springcore.com;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository{
List<BankAccount> accounts=null;
	
	public BankAccountRepositoryImpl(){
		
	} 
	
	
	
	public BankAccountRepositoryImpl(List<BankAccount> accounts) {
		super();
		this.accounts = accounts;
	}

	
	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	


	private BankAccount getBeanofBankAccount(double accountId){
		if(accounts!=null){
			for(BankAccount account:accounts ){
				if(account.getAccountId()==accountId){
					return account;
				}
			}
		}
		
		
		return null;
		
	}



	@Override
	public double updateBalance(int accountId, double newBalance,String type) {
		BankAccount account=getBeanofBankAccount(accountId);
		if(account!=null){
			
			if(type.equals("withdraw")){
				account.setAccountBalance(account.getAccountBalance()-newBalance);
			}
			else if(type.equals("deposit"))
				account.setAccountBalance(account.getAccountBalance()+newBalance);
			return account.getAccountBalance();
			
		}
		return 0;
		
	}



	@Override
	public double getBalance(int accountId) {
		BankAccount account=getBeanofBankAccount(accountId);
		if(account!=null)
			return account.getAccountBalance();
		return 0;
	}



	

	
	
}
