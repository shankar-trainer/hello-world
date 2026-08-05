// src/App.js
import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import { AuthProvider, useAuth } from './contexts/AuthContext';
import ProtectedRoute from './components/ProtectedRoute';
import HomePage from './pages/HomePage';
import LoginPage from './pages/LoginPage';
import DashboardPage from './pages/DashboardPage';
import NotFoundPage from './pages/NotFoundPage';

// A simple navigation component
const Navigation = () => {
  const { user } = useAuth();
  return (
    <nav>
      <Link to="/">Home</Link> | 
      {user ? (
        <>
          <Link to="/dashboard">Dashboard</Link> | 
          <span> (Logged in as {user.name})</span>
        </>
      ) : (
        <Link to="/login">Login</Link>
      )}
    </nav>
  );
};


function App() {
  return (
    <AuthProvider>
      <Router>
        <Navigation />
        <hr />
        <Routes>
          {/* Public Routes */}
          <Route path="/" element={<HomePage />} />
          <Route path="/login" element={<LoginPage />} />
          
          {/* Protected Routes */}
          <Route 
            path="/dashboard" 
            element={
              <ProtectedRoute>
                <DashboardPage />
              </ProtectedRoute>
            } 
          />

          {/* 404 Not Found Route - Must be the last route */}
          <Route path="*" element={<NotFoundPage />} />
        </Routes>
      </Router>
    </AuthProvider>
  );
}

export default App;