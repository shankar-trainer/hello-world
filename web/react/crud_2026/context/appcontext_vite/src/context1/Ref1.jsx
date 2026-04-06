import { useState, useEffect } from "react";

export const Ref1 = () => {
  const [c, setCount] = useState(1);

  useEffect(() => {
  setCount((p)=>p+1)
    // 1. Define the interval
    const interval = setInterval(() => {
      setCount((p) => p + 1);
    }, 1000);

    // 2. Cleanup: This stops the timer if the component is removed
    return () => clearInterval(interval);

  }, []); // 3. Empty array means "run only once on mount"

  return (
    <>
      hello world...
      <p>count is .. {c}</p>
    </>
  );
};