//1st question
class turn{
    private prevNo = Symbol();
    private currNo = Symbol();
    constructor(){
        this.prevNo = 0;
        this.currNo = 1;
    }
    next(){
        let curr = Symbol();
        curr = this.prevNo + this.currNo;
        this.prevNo = this.currNo;
        this.currNo = curr;

        return {
            current : curr,
            next : this.prevNo + this.currNo
        }
    }
}

let t = new turn();
console.log(t.next());
console.log(t.next());
console.log(t.next());
console.log(t.next());
console.log(t.next());


//2nd Armstrong
    // we can push arms nos into a list and then use this
    // here i have taken predfined list with numbers
    const  listArm=[0,1,2,3,4,5,6,7,8,9,153,370,371];
    const iterator = listArm[Symbol.iterator]();
    function getNextArmstrong(){
        
        return {
            "next value" : iterator.next().value
        }
    }
    console.log(getNextArmstrong());
    console.log(getNextArmstrong());
    console.log(getNextArmstrong());
    console.log(getNextArmstrong());
    console.log(getNextArmstrong());

// 3rd question

const ArmList = [3,4,5,6,7,8,9,153,370,371,407,1634,8208,9474];
const iterator1 = ArmList[Symbol.iterator]();
function getnext(){
    
    return  iterator1.next().value;
}
// generator
function* arms() {
    let current = 1;
    let next = 2;
    while (true) {
      [current, next] = [next, getnext()];
      if (next>1000) {
          current = 1;
          next = 2;
         // arms();
      }
    }
  }
  
  const s = arms();
  console.log(s.next().value); // 1
  console.log(s.next().value); // 2
  console.log(s.next().value); // ...
  console.log(s.next().value);
  console.log(s.next().value);
  console.log(s.next().value);
  console.log(s.next().value);
  console.log(s.next().value);
  console.log(s.next().value); // 9 
 
  // should return next ARMSTRONGs
  console.log(s.next().value);
  console.log(s.next().value); 
  console.log(s.next().value);
  console.log(s.next().value); 
  console.log(s.next().value);
  console.log(s.next().value); 
  console.log(s.next().value);

