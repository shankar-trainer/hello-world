// AddEmployee.js
import React, { useState } from 'react';
import axios from 'axios'; // Example for API calls

function AddEmployee1() {
  const [employee, setEmployee] = useState({
    name: '',
    dob: '',
  });
  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    setEmployee({ ...employee, [e.target.name]: e.target.value });
  };

  const validateForm = () => {
    let newErrors = {};
    if (!employee.name.trim()) {
      newErrors.name = 'name is required.';
    }

    if (!employee.dob.trim()) {
      newErrors.dob = 'dob is required.';
    }
    setErrors(newErrors);
    console.log(newErrors)
    console.log(employee)
    return Object.keys(newErrors).length === 0; // Return true if no errors
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (validateForm()) {
      try {
        await axios.post('http://localhost:7070/employee', employee);
      } catch (error) {
      }
    }
  };

  return (
    <form onSubmit={handleSubmit} className="form-group bg-primary  p-5 m-5 w-75">
      <div>
          <input
            type="text"
            name="name"
            value={employee.name}
            onChange={handleChange}
            placeholder="Enter Name"
            className="form-control"
          />
      </div>
      <div>
      {errors.name && <span className="danger">{errors.name}</span>}
      </div>
      <div>
          <input
            type="date"
            name="dob"
            value={employee.dob}
            onChange={handleChange}
            placeholder="Select Dob" className="form-control mt-1"
          />
                {/* {errors.firstName && <span className="error">{errors.firstName}</span>} */}
      </div>
      <div>
      {errors.dob && <span className="error">{errors.dob}</span>}
      </div>
      <button type="submit" className="btn btn-info mt-3">Add Employee</button>
    </form>
  );
}

export default AddEmployee1;