//  export const  User=(props)=>{
 export const  User=({id,name})=>{

    return(
    <>
    <h1>hello user</h1>
     <p>id is {id}</p>
     <p>name is {name}</p>
    </>)
 }

export const  User1=(props)=>{
    return(
    <>
    <h1>hello user props</h1>
     <p>id is {props.id}</p>
     <p>name is {props.name}</p>
    </>
    )
 }
 
 export const  User2=(props)=>{
    return(
    <>
    <p>car1 {props[0]}</p>
    <p>car2 {props[1]}</p>
    <p>car3 {props[2]}</p>
    </>
    )
 }



 