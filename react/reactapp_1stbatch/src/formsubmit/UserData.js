const UserData=(props)=>{
    return(
         <div class="container">
          <div class="p-5 w-75  bg-info" style={{ marginLeft: '150px',marginTop: '100px', }}>
           <h1 style={{ marginLeft: '250px'}}>User Data </h1>
           <div style={{ marginLeft: '255px'}}>Name is {props.match.params.name}. </div>
          </div>
         </div>
    )
};
export default UserData;