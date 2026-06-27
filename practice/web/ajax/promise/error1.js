var a=10
var b=0;
try{
    if(b==0)
        throw new Error("invalid number ")
    else  
    console.log(10/0)
}
catch(error){
    console.log("error "+error);
    console.log("error "+error.message);
}