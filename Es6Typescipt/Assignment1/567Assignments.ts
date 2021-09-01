//5.a question
var add = () => 21; 

//5.b question
function userFriends(username: string, ...friends: Array<string>){
    console.log("username: ",username);
    console.log("friends: ",friends);
}

userFriends('Tony Stark','Natasha Romanoff','Thor','Steve Rogers','Hulk','Hawk Eye');
console.log("----------------------------------------------------");

//5.c question
function capitals(...names: Array<string>){
    console.log();
    for(let i in names)
        console.log(names[i].toUpperCase());
}

capitals('Tony Stark','Natasha Romanoff','Thor','Steve Rogers','Hulk','Hawk Eye');
console.log("----------------------------------------------------");

//6th question
var laptop = "HP", model = "Pavillion", deskno = 123, client='Lewis Hamilton';
var ticket = `hi Sysnet, this is ${client} - deskNo.: ${deskno}, and my laptop: ${laptop}, 
model: ${model}, isn't working. Reques replacement.`;
console.log(ticket);
console.log("----------------------------------------------------");

//7.a question
let array = [1,2,3,4];
let [ele1, ele2, ele3, ele4] = array;
console.log("3rd element: ",ele3);
console.log("----------------------------------------------------");

//7.b question
var organization = {
    nameObj: "Capgemini",
    address: { country: "France", pincode: 75017}
}
let {nameObj, address: a} = organization;
console.log("deep match destructured pincode: ",a.pincode);
console.log("----------------------------------------------------");
class BankAccount{
    id:number;
    name: string;
    balance: number;
    constructor (id: number , name:string , balance:number){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    totalBalance(){
         return this.balance;

    }

}
class SavingsAccount extends BankAccount{
    constructor(id: number , name:string , balance:number, interest: number){
        super(id ,name ,balance= balance+(balance*interest)/100);
    }
}
class CurrentAccount extends BankAccount{
    constructor(id: number , name:string , balance:number , cash_credit: number){
        super(id ,name ,balance= balance+cash_credit);

    }

}
let savingsAccount =new SavingsAccount(9,"Tejas",250000,10);
let currentAccount =new CurrentAccount(27,"Tejas",250000,1000);

console.log(savingsAccount.totalBalance());
console.log(currentAccount.totalBalance());
