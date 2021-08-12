class Person {
    constructor(fname, lname, age, skills, dob, address, married, profession) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.skills = skills;
        this.dob = dob;
        this.address = address;
        this.married = married;
        this.profession = profession;
    }
    get getlname(){
        return this.lname;
    }
    get getfname(){
        return this.fname;
    }
    get getage(){
        return this.age ;
    }
    get getskills(){
        return this.skills;
    }
    get getaddress(){
        return this.address;
    }
    get getmarried(){
        return this.maegetmarried;
    }
    get getdob(){
        return this.dob;
    }
    get getprofession(){
        return this.profession;
    }
}
var amitab = new Person("amitab","bachan",22,["java"],"24/10/1996",{city:"hyderabad",pincode:"521185"},false,"sr. analyst");
var abhishek = new Person("abhishek",amitab.getlname,21,"HTML","08/06/1997",amitab.getaddress,false,"jr. analyst");
var Aaradhya = new Person("Aaradhya",amitab.getlname,amitab.age,"C++","21/10/1997",amitab.getaddress,abhishek.getmarried,abhishek.getprofession);
var object = abhishek;
object = Object.create(amitab);

print = function(){
    console.log(amitab);
    console.log();
    console.log(abhishek);
    console.log();
    console.log(Aaradhya);
}();