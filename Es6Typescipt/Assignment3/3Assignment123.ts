const p1 = new Promise((resolve) => {
    console.log('The first promise has resolved');
    resolve(10);
});

const p2 = new Promise((resolve) => {
    console.log('The first promise has resolved');
    resolve(10);
});

Promise.all([p1,p2]).then(results => {
    const total = results.reduce((p,c) => p+c);
    console.log(`Results: ${results}`);
    console.log(`Total: ${total}`);
})

//2nd Question
class Account{
    constructor (public id: number , public name:string ,  public balance:number){

    }
    totalBalance(){
         return this.balance;

    }

}
class SavingsAccount extends Account{
    constructor(id: number , name:string , balance:number, interest: number){
        super(id ,name ,balance= balance+(balance*interest)/100);
    }
}
class CurrentAccount extends Account{
    constructor(id: number , name:string , balance:number , cash_credit: number){
        super(id ,name ,balance= balance+cash_credit);

    }

}
let savingsAccount =new SavingsAccount(9,"Tejas",250000,10);
let currentAccount =new CurrentAccount(27,"Tejas",250000,1000);

console.log(savingsAccount.totalBalance());
console.log(currentAccount.totalBalance());

//3rd Question

interface Printable{
    print():any;
}

let circle: Printable ={
    print(){
        console.log("circle obj");
    }
}
let employee: Printable ={
    print(){
        console.log("employee obj");
    }
}

function printAll(...objArr: Array<any>){
    for(let i in objArr){
        console.log(objArr[i].print())
    }
}

