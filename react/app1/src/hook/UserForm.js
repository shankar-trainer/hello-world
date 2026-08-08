import React, { useState } from 'react';

function UserForm1() {
    // 1. Define initial form state
    const [formData, setFormData] = useState({
        firstName: '',
        lastName: '',
        age: ''
    });

    // 2. Generic change handler using the spread operator
    const handleChange = (e) => {
        const { name, value } = e.target;

        setFormData((prevData) => ({
            ...prevData,   // Keep all other form fields intact
            [name]: value  // Update only the field that changed
        }));
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log('Submitted Data:', formData);
        alert('Submitted Data:'+ JSON.stringify(formData));
    };

    return (
        <form onSubmit={handleSubmit}>
            <div>
                <label>First Name: </label>
                <input
                    type="text"
                    name="firstName"
                    value={formData.firstName}
                    onChange={handleChange}
                />
            </div>

            <div>
                <label>Last Name: </label>
                <input
                    type="text"
                    name="lastName"
                    value={formData.lastName}
                    onChange={handleChange}
                />
            </div>

            <div>
                <label>Age: </label>
                <input
                    type="number"
                    name="age"
                    value={formData.age}
                    onChange={handleChange}
                />
            </div>

            <button type="submit">Submit</button>
        </form>
    );
}

export default UserForm1;