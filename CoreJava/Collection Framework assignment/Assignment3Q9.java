
package CapgeminiAssignment;
import java.util.*;  
class Account implements Comparable<Account>{  
	private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private String isSalaryAccount;  
public Account(int acc_ID, double acc_balance, String accountHolderName, String isSalaryAccount) {  
	this.setAcc_balance(acc_balance);
    this.setAcc_ID(acc_ID);
    this.setAccountHolderName(accountHolderName) ;
    this.setIsSalaryAccount(isSalaryAccount);
}  
public int compareTo(Account b) {  
    if(getAcc_ID()>b.getAcc_ID()){  
        return 1;  
    }else if(getAcc_ID()<b.getAcc_ID()){  
        return -1;  
    }else{  
    return 0;  
    }  
}
public int getAcc_ID() {
	return acc_ID;
}
public void setAcc_ID(int acc_ID) {
	this.acc_ID = acc_ID;
}
public double getAcc_balance() {
	return acc_balance;
}
public void setAcc_balance(double acc_balance) {
	this.acc_balance = acc_balance;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public String getIsSalaryAccount() {
	return isSalaryAccount;
}
public void setIsSalaryAccount(String isSalaryAccount) {
	this.isSalaryAccount = isSalaryAccount;
}  
}  
public class Assignment3Q9{  
public static void main(String[] args) {  
    Set<Account> set=new TreeSet<Account>();  
    //Creating Books  
    Account b1=new Account(1,1594545,"William","Yes");  
    Account b2=new Account(3,100000,"Akash","Yes");  
    Account b3=new Account(5,300000,"Rameshwar","Yes");  
    Account b4=new Account(2,50000,"Hardik","Yes");
    Account b5=new Account(4,90000,"Akshansh","No");
    //Adding Books to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3); 
    set.add(b4); 
    set.add(b5); 
    //Traversing TreeSet  
    for(Account b:set){  
    System.out.println("Account Id is : "+b.getAcc_ID()+"\n"+"Bank balance : "+b.getAcc_balance()+"Account holder name : "+b.getAccountHolderName()+"Is it salary acount? : "+b.getIsSalaryAccount());  
    }  
}  
}  
