import React, { useState, useEffect } from 'react';

function UseEffect1() {
  const [count, setCount] = useState(0);

  // Runs after the initial render and every time 'count' changes
  useEffect(() => {
    document.title = `You clicked ${count} times`;
  }, [count]); // Dependency array includes 'count'

  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>
        Click me
      </button>
    </div>
  );
}
export default UseEffect1;