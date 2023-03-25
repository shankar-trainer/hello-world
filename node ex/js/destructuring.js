var assert=require('assert')
const arr=['a','b','c'];
const x =arr[0];
const y =arr[1];

console.log(arr)
console.log(x)
console.log(y)


const [p,q,r]=arr
console.log(p,q,r);
console.log(assert.equal(x,p))
console.log(assert.equal('a','a'))
assert.equal(1,1);

