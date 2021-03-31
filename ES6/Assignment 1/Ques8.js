class Accounts{
    private total_Balance;
    constructor(balance){
        this.total_Balance = balance;
    }
    get Balance(){
        return this.total_Balance;
    }
    deposit(amount){
        this.total_Balance += amount;
            console.log("Deposited : $"+ amount);
            console.log("Total Balance : $"+ this.Balance);
    }
    withdraw(amount){
        if (amount < this.Balance) {
            this.total_Balance -= amount;
                console.log("Withdraw Amount : $"+ amount);
                console.log("Remaining Balance : $"+ this.Balance);
            
        } else {
            return "Less Cash Present";
        }
    }
}