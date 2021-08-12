var str = '({"firstName":"Bill","lastName":"Gates"})';

var obj = eval(str);
console.log(obj);
console.log(obj.firstName + " " + obj.lastName); 
