var ar1=new Array(11,22,33,44,55)
alert(ar1)
alert("popped "+ar1.pop())// pop() remove and return last element
alert("after one element is popped "+ar1)
ar1.push(1000)// push will add element at last position
alert("after push  "+ar1)
alert("shift   "+ar1.shift())// shift() remove and return  first element
alert("after shift  "+ar1)

ar1.unshift(888)// unshift add element at first position

var s=ar1.join(" and ")
alert("after join using and "+s)


