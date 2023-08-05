import EmployeeBook from "./EmployeeBook";
import Product from "./Product";
import data from './bookdata';

 function Employee(props){
    return(
        <div className="w-75 mt-5 p-5 bg-info" 
        style={{'marginLeft':'200pt'}}>
           Id is {props.id}<br></br>
           Name is {props.name}<br></br>
          <Product id='1980908' name='garments' cost='12000'></Product>
          <h2>Employee Book </h2>
          <EmployeeBook book={data} ></EmployeeBook>
        </div>
    )
}



export default Employee;