import React from "react";

function Hello(){
    return (
       React.createElement('h1',null,'hello world')
    )
}
function User(props){
    return(
        <div>
            id is {props.id} <br/>
            name is {props.name} <br/> 
            age is {props.age} <br/>
        </div>
    )
}

//export default Hello;
export default User;