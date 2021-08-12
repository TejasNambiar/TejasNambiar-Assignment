const text = '{"name":"John", "birth":"1986-12-14", "city":"New York"}';
const obj = JSON.parse(text);
obj.birth = new Date(obj.birth);
console.log();
console.log(obj);
console.log(obj.name + ", " + obj.birth); 
console.log();