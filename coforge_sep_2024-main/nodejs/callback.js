function display(name){
    console.log("i am "+name)
}

function welcome(country, callback ){
    console.log('country name is '+country);
    callback('mohan kumar')
}

welcome('india',display)

console.log('alarm will ring after 5 second')
setTimeout(()=>{
    console.log(' alram is ringing ')
}, 5000)