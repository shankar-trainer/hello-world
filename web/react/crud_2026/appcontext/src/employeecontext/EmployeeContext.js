import { createContext, useState } from 'react';

// export const EmployeeContext = createContext(null); // Default value is null

// export const EmployeeProvider = ({ children }) => {
//     const [employees, setEmployees] = useState([
//         { id: 1, name: 'Jane Doe', position: 'Developer' }
//     ]);
// }


//== comment down or up 
export const EmployeeContext = createContext();

export const EmployeeProvider = ({ children }) => {
  const [employees, setEmployees] = useState([]);

  // Function to add new employee
  const addEmployee = (employee) => {
    setEmployees([...employees, employee]);
  };

  return (
    <EmployeeContext.Provider value={{ employees, addEmployee }}>
      {children}
    </EmployeeContext.Provider>
  );
};