import EmployeeBook from "./EmployeeBook";
import Product from "./Product";
import data from './bookdata';
import Train from "./Train";
import Counter from "./Counter1";

function Employee(props) {
    return (
        <div className="w-75 mt-5 p-5 bg-info"
            style={{ 'marginLeft': '500pt' }}>
            <div className="border border-dark bg-dark text-light ml-5 p-5 w-50" style={{ 'height': '770pt', 'color': 'blue' }}>
                <Counter></Counter>
            </div>
            Id is {props.id}<br></br>
            Name is {props.name}<br></br>
            <Product id='1980908' name='garments' cost='12000'></Product>
            <h2>Employee Book </h2>
            <EmployeeBook book={data} ></EmployeeBook>
            <p>Train ....</p>
            <Train></Train>
        </div>
    )
}



export default Employee;