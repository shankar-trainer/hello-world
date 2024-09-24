//setTimeOut 
// callback function 


function alarm(){
    console.log("alarm will ringing ")
}

setTimeout(alarm,3000);

setTimeout(function(){
    console.log('good morning ')
},6000);

setTimeout(()=>
    console.log('good night ')
,4000);

function clock(){
    console.log(new Date().toLocaleTimeString())
    setTimeout(clock,1000);
}

clock();


