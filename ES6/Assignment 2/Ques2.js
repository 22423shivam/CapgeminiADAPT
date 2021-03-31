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
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());