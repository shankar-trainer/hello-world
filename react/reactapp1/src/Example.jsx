import React from "react";

export default  function  Hello(){
    return(
        <div>
            <h1> Hello World</h1>
            <h2> Using jsx</h2>
        </div>
    )
}
function Greeting(){
    return (
        <div>
            <h2>Greeting </h2>
        </div>
    )
}
const Test1=()=>{
    return(
        <div>
            <h2>Test application</h2>
        </div>
    )
}

const Test2=()=>{
    return (
       React.createElement('h2','','Test2 App')
    )
}

export {Greeting};
export {Test1};
export {Test2};