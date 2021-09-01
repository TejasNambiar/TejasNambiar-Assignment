"use strict";
//1st question
var pi = 3.14;
//pi = 23; //error as const doesnt allow value change
//2nd question
if (true) {
    var a_1 = 10;
}
//console.log(a); //error as let: scope=block
//3rd question
var Order = {
    id: 1,
    title: "thin crust",
    price: 500,
    getOrder: function () {
        return this.id + " " + this.title;
    },
    getPrice: function () {
        return this.price;
    }
};
//let copiedObj = Object.assign({}, Order); 
//4th Arrow functions
var Object1 = /** @class */ (function () {
    function Object1(name1) {
        this.name1 = name1;
        this.length1 = name1.length;
    }
    return Object1;
}());
var displayArray = function () {
    var objects = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        objects[_i] = arguments[_i];
    }
    //console.log("objects array: ",objects);
    for (var i in objects)
        console.log(objects[i]);
};
var names = ['tom', 'ivan', 'Jerry'];
var name1 = names[0], name2 = names[1], name3 = names[2];
var obj1 = new Object1(name1);
var obj2 = new Object1(name2);
var obj3 = new Object1(name3);
displayArray(obj1, obj2, obj3);
//# sourceMappingURL=1234Assignments.js.map