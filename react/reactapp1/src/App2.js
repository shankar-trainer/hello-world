import './css/Hello.css';
import emp1 from './image/emp1.jpg'
import emp20 from './image/emp2.jpg'
export default function App2() {
    return (
        <div className='style1'>
            <h2>Reactjs Example</h2>
            <h3>Employee Detail</h3>
            <p>id is {emp.id}</p>
            <p>name is {emp.name}</p>
            <p>salary is {emp.salary}</p>
            <div>
                <img src={emp1}></img>
            </div>

            <div>
                <img src={emp20}></img>
            </div>
        </div>
    )
}
let emp = {
    "id": 10001,
    "name": "suresh kumar",
    "salary": 20000,
}