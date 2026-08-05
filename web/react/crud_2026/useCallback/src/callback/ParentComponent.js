import React, { useState, useCallback } from 'react';

function ParentComponent() {
  const [count, setCount] = useState(0);

  // The 'increment' function is memoized.
  // It only changes when the dependency array values change.

  const increment = useCallback(() => {
    setCount(prevCount => prevCount + 1);
  }, []); // Empty dependency array means the function is created only once.

  return (
    <div>
      <p>Count: {count}</p>
      {/* Pass the stable function reference to a memoized child component */}
      <ChildComponent onClick={increment} /> 
    </div>
  );
}

// ChildComponent should be wrapped in React.memo for the optimization to be effective.
const ChildComponent = React.memo(({ onClick }) => {
  console.log('Child Component rendered'); // This will only log on initial render if 'onClick' is stable
  return <button onClick={onClick}>Increment Count</button>;
});

export default ParentComponent;
