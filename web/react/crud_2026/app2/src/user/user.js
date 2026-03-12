import Address from "./Address";
import Phone from "./Phone";
import logo from "../logo.svg";
import rose from "../image/rose.webp"
import rose1 from "../image/rose.webp"
import rose2 from "../image/rose.webp"
function User() {
    return (
        <div className="container bg-info text-success w-75 p-5 m-5 border-primary">

            <div className="bg-light">
                <img src={logo} width="100pt" height="80pt"></img>
                <img src={rose} width="100pt" height="80pt"></img>
                <img src={rose1} width="100pt" height="80pt"></img>
                <img src={rose2} width="100pt" height="80pt"></img>
            </div>

            <div style={{ 'border': 'solid red', 'padding': '30pt', 'border-radius': '20pt' }}>
                <h1>User Page</h1>
                <div>id is {user1.id}</div>
                <div>name is {user1.name}</div>
                <div>age is {user1.age}</div>
                <Address></Address>
                <Phone country="india" state="tamilnadu"></Phone>
            </div>
        </div>
    )
}

export default User;

var user1 = {
    "id": 100001,
    "name": "jyoti kumari",
    "age": 20
}

