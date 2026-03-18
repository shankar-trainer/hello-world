import React from 'react';

// GrandChild component that actually needs the data
function GrandChild({ user }) {
  return<> <p>User name: {user.name}</p>;
   <p>User Email: {user.email}</p></>;
}

// Child component that receives the prop but only passes it down
function Child({ user }) {
  return (
    <div>
      <h2>Child Component</h2>
      <GrandChild user={user} />
    </div>
  );
}

// Parent component that receives the prop but only passes it down
function Parent({ user }) {
  return (
    <div>
      <h1>Parent Component</h1>
      <Child user={user} />
    </div>
  );
}

// App component, the source of the data
function App1() {
  const user = { name: "John Doe", email: "john@example.com" };
  return (
    <div>
      <Parent user={user} />
    </div>
  );
}

export default App1;