// src/pages/HomePage.js
import React from 'react';
import { Link } from 'react-router-dom';
import { useAuth } from '../contexts/AuthContext';

const HomePage = () => {
  // We can still use the useAuth hook here to conditionally render content
  const { user } = useAuth();

  return (
    <div>
      <h1>Welcome to Our Awesome App!</h1>
      <p>This is the public homepage. Anyone can see this page.</p>
      
      <hr />

      {/* Conditional rendering based on authentication status */}
      {user ? (
        <div>
          <h2>Welcome back, {user.name}!</h2>
          <p>You are logged in. You can now access your private dashboard.</p>
          <Link to="/dashboard">
            <button>Go to Dashboard</button>
          </Link>
        </div>
      ) : (
        <div>
          <h2>You are not logged in.</h2>
          <p>Please log in or sign up to access the dashboard and other protected features.</p>
          <Link to="/login">
            <button>Log In</button>
          </Link>
        </div>
      )}
    </div>
  );
};

export default HomePage;