function Hello(){
    return(
        <div>
            <div  style={{"background":"yellow","width":"30%","border":"solid","margin-left":"300pt"}}>
            <h1>Hello world</h1>
            <p>{user.id}</p>
            <p>{user.name}</p>
            <p>{user.salary}</p>
            <p>{user.dob}</p>
            </div>
        </div>
    )
}
const user={
      "id":10001,
      "name":"amit kumar",
      "salary":90000,
      "dob":"11-12-2009"
}

export default Hello;