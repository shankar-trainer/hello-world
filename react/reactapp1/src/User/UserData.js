const UserData=(props)=>{
    return(
        <div>
           <h1>User Data </h1>
           Name is {props.match.params.name}. 
        </div>
    )
};
export default UserData;