const listArm = [3,4,5,6,7,8,9,153,370,371,407,1634,8208,9474];
const iterator = listArm[Symbol.iterator]();
function getnext(){
    
    return  iterator.next().value;
}
// generator
function* arms() {
    let current = 1;
    let next = 2;
    while (true) {
      let reset = yield current;
      [current, next] = [next, getnext(next)];
      if (reset) {
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

   // reset generator
  console.log(s.next(true).value);

  console.log(s.next().value); // 1
  console.log(s.next().value); // 2