import React, { Component, useEffect, useState } from 'react'
import EmployeeService from './EmployeeService';
import axios from 'axios';

const SearchEmployee1 = () => {
    const [employee, setEmployee] = useState([]);
    useEffect(() => {
        //EmployeeService.getEmployeeById(1).then(res => {
            axios.get("http://localhost:8080/api/v1/employees"+ "/" +1 ).then(res => {
            setEmployee(res.data);
        })
    })

    return (
        <div>
            <br></br>
            <div className="card col-md-6 offset-md-3">
                <h3 className="text-center"> View Employee Details</h3>
                <div className="card-body">
                    <div className="row">
                        <label> Employee First Name: </label>
                        <div> {employee.firstName}</div>
                    </div>
                    <div className="row">
                        <label> Employee Last Name: </label>
                        <div> {employee.lastName}</div>
                    </div>
                    <div className="row">
                        <label> Employee Email ID: </label>
                        <div> {employee.emailId}</div>
                    </div>
                </div>
            </div>
        </div>
    )
}
export default SearchEmployee1;
