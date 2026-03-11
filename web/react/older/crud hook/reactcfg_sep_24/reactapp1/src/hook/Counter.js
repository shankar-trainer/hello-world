import { useState } from "react"
import { Clock1 } from "./Clock1";
import { useNavigate } from "react-router";

//export default function Counter(){
//const Counter = () => {
export const Counter = (props) => {
    const [c, increment] = useState(0);
    const [user1, setUser] = useState(user);
    const navigate = useNavigate()

    const myincrement = () => {
        increment(c + 1)
    }

    return (
        <>
            <div className="container p-5 m-5 w-75 bg-success text-light">
               <div className="mb-5">
                <Clock1></Clock1>
                </div>
                <h3> This is counter Program</h3>
                <div>Count is {c}</div>
                <button type="button" onClick={myincrement} className="btn btn-info">increment</button>
                <button type="button" onClick={() => increment(c - 1)} className="btn btn-info" style={{ 'margin-left': '5pt' }}>decrement</button>

                <div>
                    <button onClick={() => increment(c + 10)} className="btn btn-info"
                        style={{ 'margin-top': '5pt' }}
                    >increment by 10 ==> {c}</button>
                </div>

                <div className="mt-3">
                    <h2>User </h2>
                    <div> id :   {user1.id}</div>
                    <div> name :   {user1.name}</div>
                    <div> salary :   {user1.salary}</div>
                    <div>
                        <button className="btn btn-primary"
                            onClick={() => setUser({ id: 9999, name: "anil kumar", salary: 90000 })}>Change User </button>
                    </div>
                    <input type="button" onClick={() => navigate('/empform_hook')} value="Employee Form"  className="btn btn-primary m-3"/>

                    <div className="border p-5 m-5">
                    <h2>Address</h2>
                        <div>Id :{props.myaddress.addr_id}</div>
                        <div>Location :{props.myaddress.location}</div>
                        <div>City :{props.myaddress.city}</div>
                        <div>State :{props.myaddress.state}</div>
                    </div>
                    <h2>Phone</h2>
                    <div className="border p-5 m-5">
                        <table className="table table-striped table-bordered">
                            {
                                props.myphone.map(a =>
                                    <tr style={{ 'border': 'solid' }}>
                                        <td>{a.regno}</td>
                                        <td>{a.model}</td>
                                        <td>{a.cost}</td>
                                    </tr>
                                )
                            }
                        </table>
                    </div>
                </div>
            <input type="button" onClick={() => navigate('/empform_hook')} value="Employee Form"  className="btn btn-primary m-3"/>


            </div>
        </>
    )
}

//export default Counter;

var user = {
    "id": 100001,
    "name": "suresh parsad",
    "salary": 20000
}