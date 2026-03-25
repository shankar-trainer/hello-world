import React, { useState } from 'react';
import axios from 'axios';
import PropTypes from 'prop-types';
import { Link, useNavigate } from 'react-router-dom';

export default function Login({ onLogin }) {
  const navigate = useNavigate();
  const [formData, setFormData] = useState({ username: '', password: '' });
  const [error, setError] = useState(null);

  const handleChange = e => {
    const { name, value } = e.target;
    setFormData(prev => ({ ...prev, [name]: value }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const res = await axios.post('http://localhost:8080/api/auth/login', formData);
      console.log('jwt token '+res.data.token)
      localStorage.setItem('token', res.data.token);
      onLogin();
      navigate("/");
    } catch {
      alert('Login failed');
    }
  };

  return (
    <div className="container">
      <h2>Login</h2>
      {error && <p className="text-red-600">{error}</p>}

      <form onSubmit={handleSubmit} className="space-y-4">
        <input
            id="username"
            name="username"
            placeholder="Username"
            type="text"
            value={formData.username}
            onChange={handleChange}
            required
          />

        <input
            id="password"
            name="password"
            placeholder="Password"
            type="password"
            value={formData.password}
            onChange={handleChange}
            required
          />

        <button type="submit">Login</button>
      </form>

      <Link to="/register" className="link">Don't have an account? Register</Link>
    </div>
  );
}

Login.propTypes = {
  onLogin: PropTypes.func.isRequired,
};
