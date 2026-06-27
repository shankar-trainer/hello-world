var ar=new Array(22,3,1,4,5,2);
console.log(ar);
document.write("array1 elements are "+ar);

var ar1=['dog','cat','cow','camel'];

document.write("<br>array2 elements are "+ar1);
document.write("<br>array2 length "+ar1.length);
document.write("<br>array1 length "+ar.length);

document.write("<br>");
 for(var a=0;a<ar1.length;a++){
    document.write(ar1[a]+",");
 }

// adding elements at last position by push 
ar1.push('sparrow');
document.write("<br>after push array2  are  "+ar1);
// adding elements at first  position by unshift 
ar1.unshift('peacock');
document.write("<br>after unshift array2  are  "+ar1);

// remove element from last position 
document.write("<br>last element removed :"+ar1.pop());
document.write("<br>after pop array2  are  "+ar1);
// remove element from first  position shift method 
 ar1.reverse();

document.write("<br>after reverse  array2  are  "+ar1);

document.write("<br>array1 unsorted   are  "+ar);
ar.sort();

document.write("<br>array1 sorted   are  "+ar);






