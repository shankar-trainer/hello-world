/*
let keyword in the for-loop, it will create a new lexical scope in each iteration. 
In other words, you will have a new index variable in each iteration.
*/

for (let index = 1; index <= 3; index++) {
 	console.log("\t\tindex : "+index)

    setTimeout(function () {
        console.log('after ' + index + ' second(s):' + index);
    }, index * 1000);
}