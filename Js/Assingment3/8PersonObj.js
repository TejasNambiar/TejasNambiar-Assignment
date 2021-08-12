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
var person1 = new Person("tejas","nambiar",22,["java"],"28/10/1999",{city:"hyderabad",pincode:"500084"},false,"jr. analyst");
var person2 = new Person("Md","Mosain",23,["java"],"14/07/1998",{city:"hyderabad",pincode:"500084"},false,"sr. analyst");

print = function(){
    console.log(person1);
    console.log(person2);
}();