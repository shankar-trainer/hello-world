// src/components/ProtectedRoute.js
import React, { useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import { useAuth } from '../contexts/AuthContext';

const ProtectedRoute = ({ children }) => {
  const { user, loading } = useAuth();
  const navigate = useNavigate();

  useEffect(() => {
    if (loading) {
      // Still checking for auth status, do nothing yet
      return;
    }

    if (!user) {
      // If not authenticated, redirect to the login page
      navigate('/login');
    }
  }, [user, loading, navigate]);

  if (loading) {
    // You can render a loading spinner here
    return <div>Loading...</div>;
  }

  // If user is authenticated, render the children
  return user ? children : null; // Return null while redirecting
};

export default ProtectedRoute;