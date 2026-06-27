var x = 12;
promise = new Promise((resolve, reject) => {
    if (x % 2 == 0)
        resolve(x + ' is even no  ')
    else
        reject(x + ' is odd no ')
});

//console.log(promise);
//c chaining of promise 

//using setTimeOut 
promise.then((result) => {
    //console.log('it is even no '+result)
    console.log(result);
}).catch((err) => {
    console.log('it is odd no ')
});

