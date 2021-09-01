//1st question
const pi = 3.14;
//pi = 23; //error as const doesnt allow value change

//2nd question
if(true){
    let a =10;
}
//console.log(a); //error as let: scope=block

//3rd question
var Order = {
    id: 1,
    title: "thin crust",
    price: 500,

    getOrder(){
        return this.id +" "+ this.title;
    },
    getPrice(){
        return this.price;
    }
};

//let copiedObj = Object.assign({}, Order); 

//4th Arrow functions
class Object1{
    name1;
    length1;
    constructor(name1:string){
        this.name1 = name1;
        this.length1 = name1.length;
    }
}

let displayArray = (...objects: Array<object>) =>{
    //console.log("objects array: ",objects);
    for(let i in objects)
    console.log(objects[i]);
}

let names = ['tom', 'ivan', 'Jerry'];
let [name1, name2, name3] = names;
const obj1 = new Object1(name1);
const obj2 = new Object1(name2);
const obj3 = new Object1(name3);

displayArray(obj1,obj2,obj3);



