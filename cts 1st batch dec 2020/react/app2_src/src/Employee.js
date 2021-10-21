import React from 'react';

const employee = (props) => {
return (
        <div>
                <p onClick={props.click}> Hi I am {props.name} and my employee ID: {props.empId}, email: {props.email}</p>
                <p> {props.children}</p>
        </div>
    )
}

export default employee;
