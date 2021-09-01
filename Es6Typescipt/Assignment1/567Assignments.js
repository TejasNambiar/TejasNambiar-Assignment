"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//5.a question
var add = function () { return 21; };
//5.b question
function userFriends(username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log("username: ", username);
    console.log("friends: ", friends);
}
userFriends('Tony Stark', 'Natasha Romanoff', 'Thor', 'Steve Rogers', 'Hulk', 'Hawk Eye');
console.log("----------------------------------------------------");
//5.c question
function capitals() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    console.log();
    for (var i in names)
        console.log(names[i].toUpperCase());
}
capitals('Tony Stark', 'Natasha Romanoff', 'Thor', 'Steve Rogers', 'Hulk', 'Hawk Eye');
console.log("----------------------------------------------------");
//6th question
var laptop = "HP", model = "Pavillion", deskno = 123, client = 'Lewis Hamilton';
var ticket = "hi Sysnet, this is " + client + " - deskNo.: " + deskno + ", and my laptop: " + laptop + ", \nmodel: " + model + ", isn't working. Reques replacement.";
console.log(ticket);
console.log("----------------------------------------------------");
//7.a question
var array = [1, 2, 3, 4];
var ele1 = array[0], ele2 = array[1], ele3 = array[2], ele4 = array[3];
console.log("3rd element: ", ele3);
console.log("----------------------------------------------------");
//7.b question
var organization = {
    nameObj: "Capgemini",
    address: { country: "France", pincode: 75017 }
};
var nameObj = organization.nameObj, a = organization.address;
console.log("deep match destructured pincode: ", a.pincode);
console.log("----------------------------------------------------");
var BankAccount = /** @class */ (function () {
    function BankAccount(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    BankAccount.prototype.totalBalance = function () {
        return this.balance;
    };
    return BankAccount;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount(id, name, balance, interest) {
        return _super.call(this, id, name, balance = balance + (balance * interest) / 100) || this;
    }
    return SavingsAccount;
}(BankAccount));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, balance, cash_credit) {
        return _super.call(this, id, name, balance = balance + cash_credit) || this;
    }
    return CurrentAccount;
}(BankAccount));
var savingsAccount = new SavingsAccount(9, "pallavi", 250000, 10);
var currentAccount = new CurrentAccount(27, "pallavi", 250000, 1000);
console.log(savingsAccount.totalBalance());
console.log(currentAccount.totalBalance());
//# sourceMappingURL=5678Assignments.js.map