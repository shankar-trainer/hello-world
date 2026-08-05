import React, { useState } from 'react';
import ChildComponent from './ChildComponent';

const ParentComponent = () => {
  // State defined in the parent component
  const [count, setCount] = useState(0);

  // Function to update the state in the parent component
  const incrementCount = () => {
    setCount(count + 1);
  };

  return (
    <div>
      <h1>Parent Component</h1>
      <p>Current Count: {count}</p>
      {/* Passing state value and update function as props */}
      <ChildComponent currentCount={count} onIncrement={incrementCount} />
    </div>
  );
};

export default ParentComponent;
 
