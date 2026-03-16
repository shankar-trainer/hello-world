import React, { useContext, useState } from 'react';
import { EmployeeContext } from './EmployeeContext';
const AddEmployees = () => {
  const { addEmployee } = useContext(EmployeeContext);
  const [name, setName] = useState('');
  const [position, setPosition] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (name && position) {
      addEmployee({ name, position });
      setName('');
      setPosition('');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        placeholder="Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <input
        type="text"
        placeholder="Position"
        value={position}
        onChange={(e) => setPosition(e.target.value)}
      />
      <button type="submit">Add Employee</button>
    </form>
  );
};

export default AddEmployees;
