import './css/user.css';
import user from './image/user.png'
import user1 from './userdata';
function User() {
    return (
        <div className='style1'>
            <h1>User Page</h1>
            <div style={{marginLeft:50}}>
                <img src={user}></img>

                <h2>User Information</h2>
                <p>Id is {user1.id}</p>
                <p>Name is {user1.name}</p>
                <p>Salary is {user1.salary}</p>
            </div>
        </div>
    )
}
export default User;