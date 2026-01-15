        var x = 18;
        promise = new Promise((resolve, reject) => {
            if (x % 2 == 0)
                setTimeout(()=> {
                    resolve(x + ' is even no  ')
                }, 3000)
            else {
                setTimeout(()=> {
                    reject(x + ' is odd no ')
                }, 4000)

            }
        });
console.log(promise)
