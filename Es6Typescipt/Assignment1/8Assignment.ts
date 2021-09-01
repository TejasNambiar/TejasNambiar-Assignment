// main account
class Accounts{
    private total_Balance;
    constructor(balance: any){
        this.total_Balance = balance;
    }
    get Balance(){
        return this.total_Balance;
    }
    deposit(amount:any){
        this.total_Balance += amount;
            console.log("Deposited : $"+ amount);
            console.log("Total Balance : $"+ this.Balance);
    }
    withdraw(amount:any){
        if (amount < this.Balance) {
            this.total_Balance -= amount;
                console.log("Withdraw Amount : $"+ amount);
                console.log("Remaining Balance : $"+ this.Balance);
            
        } else {
            return "Less Cash Present";
        }
    }
}

// savings account
class SavingsAccount1 extends Accounts{
    private interest = 0.05;
    getAfterInterest(){
        console.log("After Interest Added : $"+(this.Balance + (this.Balance*this.interest)));
    }
}

// current account
class CurrentAccount1 extends Accounts{
    private cashCreditR = 5.00;
    cashCredit(){
        console.log("After Cash Credited : $"+(this.Balance - ((this.Balance * 0.02) - this.cashCreditR)));
    }
}

// objects 1
let savings = new SavingsAccount1(1000);
savings.deposit(500);
savings.withdraw(100);
savings.getAfterInterest();

let checking = new CurrentAccount1(2000);
checking.deposit(600);
checking.withdraw(100)
checking.cashCredit();