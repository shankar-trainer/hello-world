import React from 'react';

// Receiving props from the parent
const ChildComponent = ({ currentCount, onIncrement }) => {
  return (
    <div>
      <h2>Child Component</h2>
      <p>Count from Parent: {currentCount}</p>
      {/* Calling the parent's function to update its state */}
      <button onClick={onIncrement}>
        Increment Count in Parent
      </button>
    </div>
  );
};

export default ChildComponent;
 