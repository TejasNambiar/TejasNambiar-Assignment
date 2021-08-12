class BankAccount{
    constructor(accountNumber, accountHolderName, accountBalance, isSalary){
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.isSalary = isSalary;
    }

    get getAccNumber(){
        return this.accountNumber;
    }
    get getAccBalance(){
        return this.accountBalance;
    }
    get getAccHolder(){
        return this.accountHolderName;
    }
    set setIsSalary(amount){
        this.isSalary = amount;
    }
    set setOdLimit(value){
        this.odLimit = value;
    }
    set setAccBalance(value){
        this.accountBalance = value;
    }
    get getOdLimit(){
        return this.odLimit;
    }

    withdraw(amount) {
        var rmngBalance = this.accountBalance - amount;
        if(Math.abs(rmngBalance) <0 || this.getOdLimit < Math.abs(rmngBalance))
            console.log("not allowed, beyond limit by: "+(Math.abs(rmngBalance) - this.getOdLimit));
        else
            this.setAccBalance = rmngBalance;
        
    }

}

var savings = new BankAccount(112233,"Will Smith", 1000000, 200000);
var current = new BankAccount(445566,"Martin Lawrence", 1000000, 0);
//savings.setIsSalary = 200000;
current.setOdLimit = 10000;
console.log(savings);
console.log(current);
savings.withdraw(10000);
console.log("savings balance: ",savings.getAccBalance);
current.withdraw(2000000);
console.log("current balance: ",current.getAccBalance);

