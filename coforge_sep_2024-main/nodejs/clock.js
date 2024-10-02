//setTimeOut -- it calls after interval and stops 
//setInterval -- call repetively with given interval 

setTimeout(() => {
    console.log('alarm is up ')
}, 3000);

setInterval(() => {
    console.log('time --> '+new Date().toLocaleTimeString())
}, 1000);


