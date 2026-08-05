import React, { useContext } from 'react';
import { EmployeeContext } from './EmployeeContext';

const EmployeeList = () => {
  const { employees } = useContext(EmployeeContext);

  return (
    <div>
      <h2>Employee List</h2>
      <ul>
        {employees.map((emp, index) => (
          <li key={index}>
            {emp.name} - {emp.position}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default EmployeeList;
