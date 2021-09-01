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
var p1 = new Promise(function (resolve) {
    console.log('The first promise has resolved');
    resolve(10);
});
var p2 = new Promise(function (resolve) {
    console.log('The first promise has resolved');
    resolve(10);
});
Promise.all([p1, p2]).then(function (results) {
    var total = results.reduce(function (p, c) { return p + c; });
    console.log("Results: " + results);
    console.log("Total: " + total);
});
//2nd Question
var Account = /** @class */ (function () {
    function Account(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    Account.prototype.totalBalance = function () {
        return this.balance;
    };
    return Account;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount(id, name, balance, interest) {
        return _super.call(this, id, name, balance = balance + (balance * interest) / 100) || this;
    }
    return SavingsAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, balance, cash_credit) {
        return _super.call(this, id, name, balance = balance + cash_credit) || this;
    }
    return CurrentAccount;
}(Account));
var savingsAccount = new SavingsAccount(9, "Tejas", 250000, 10);
var currentAccount = new CurrentAccount(27, "Tejas", 250000, 1000);
console.log(savingsAccount.totalBalance());
console.log(currentAccount.totalBalance());
var circle = {
    print: function () {
        console.log("circle obj");
    }
};
var employee = {
    print: function () {
        console.log("employee obj");
    }
};
function printAll() {
    var objArr = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        objArr[_i] = arguments[_i];
    }
    for (var i in objArr) {
        console.log(objArr[i].print());
    }
}
//# sourceMappingURL=3Assignment123.js.map