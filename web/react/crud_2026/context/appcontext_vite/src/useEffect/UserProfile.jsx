import React, { useState, useEffect } from 'react';

function UserProfile({ userId }) {
  const [theme, setTheme] = useState('light');

  // This effect depends on both 'userId' AND 'theme'
  useEffect(() => {
    console.log(`Fetching data for User: ${userId} with ${theme} theme settings.`);
    
    // Logic to fetch user data or update UI based on these two values
    // ...

  }, [userId, theme]); // Effect re-runs if userId OR theme changes

  return (
    <div style={{ background: theme === 'dark' ? '#333' : '#fff' }}>
      <h1>User ID: {userId}</h1>
      <button onClick={() => setTheme(theme === 'light' ? 'dark' : 'light')}>
        Toggle Theme
      </button>
    </div>
  );
}
export default UserProfile;