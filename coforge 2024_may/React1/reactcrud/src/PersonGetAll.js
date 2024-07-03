import React, { useEffect, useState } from 'react';
//import { Link } from 'react-router-dom';
import axios from 'axios';

export const PersonGetAll = () => {
    const [persons, setPerson] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:9090/allPerson').then(result => {
            setPerson(result.data);
        })
    }, []);

    return (
        <table className="table">
            <thead>
                <tr>
                    <th className="text-center">Id</th>
                    <th className="text-center">Name</th>
                    <th className="text-center">Salary</th>
                </tr>
            </thead>
            <tbody>
                {
                    persons.map(p => (
                        <tr>
                            <td>{p.personId}</td>
                            <td>{p.personName}</td>
                            <td>{p.personSalary}</td>
                        </tr>
                    ))
                }
            </tbody>
        </table>
    );
}

export default PersonGetAll;