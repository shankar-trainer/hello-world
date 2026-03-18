import { createContext, useContext, useState } from "react";

const UserContext = createContext();

//Provide the Context: Wrap the components that need access to the data with the Provider component and pass the data via the value prop.

// Top-level App component with Provider
function App2() {
    const [user] = useState({ name: "Ram", age: 24 });

    return (
        <UserContext.Provider value={user}> {/* Providing the context value */}
            <div>
                <h1>Main Component</h1>
                <Parent /> {/* No prop needed here */}
            </div>
        </UserContext.Provider>
    );
}

function GrandChild() {
    const user = useContext(UserContext); // Access data directly
    return(
    <>
        <p>Grand child</p>
        <h4>Hello, {user.name}!</h4>
        <h4>Age, {user.age}!</h4>
    </>);
}

// Child and Parent components no longer need to handle the user prop
function Child() {
    return (
        <div>
            <h3>Child Component</h3>
            <GrandChild />
        </div>
    );
}

function Parent() {
    return (
        <div>
            <h2>Parent Component</h2>
            <Child />
        </div>
    );
}

export default App2;
