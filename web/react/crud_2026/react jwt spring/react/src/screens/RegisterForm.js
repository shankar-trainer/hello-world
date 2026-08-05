import React, { useState } from "react";
import PropTypes from "prop-types";
import { Link, useNavigate } from "react-router-dom";

const RegisterForm = ({ onRegisterSuccess }) => {
  const [formData, setFormData] = useState({
    username: "",
    password: "",
    roles: ["user"]
  });

  const navigate = useNavigate();
  const [errors, setErrors] = useState({});
  const [serverError, setServerError] = useState("");

  const handleChange = e => {
    const { name, value } = e.target;
    setFormData(prev => ({ ...prev, [name]: value }));
    setErrors(prev => ({ ...prev, [name]: "" })); // clear field error
    setServerError("");
  };

  const validate = () => {
    const newErrors = {};
    if (!formData.username.trim()) newErrors.username = "Username is required";
    if (!formData.password.trim()) newErrors.password = "Password is required";
    else if (formData.password.length < 6)
      newErrors.password = "Password must be at least 6 characters";
    return newErrors;
  };

  const handleSubmit = async e => {
    e.preventDefault();

    const validationErrors = validate();
    if (Object.keys(validationErrors).length > 0) {
      setErrors(validationErrors);
      return;
    }

    try {
      const response = await fetch("http://localhost:8080/api/auth/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
          username: formData.username,
          password: formData.password,
          roles: [formData.role]
        })
      });

      if (!response.ok) {
        const result = await response.json();
        throw new Error(result.message || "Registration failed");
      }

      navigate("/login");
    } catch (err) {
      setServerError(err.message);
    }
  };

  return (
    <div className="container">
      <h2>Register</h2>
      {serverError &&
        <div className="error">
          {serverError}
        </div>}

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="username"
          placeholder="Username"
          className="mt-1 p-2 border rounded w-full"
          value={formData.username}
          onChange={handleChange}
          required
        />
        {errors.username &&
          <div className="error">
            {errors.username}
          </div>}

        <input
          type="password"
          name="password"
          placeholder="Password"
          className="mt-1 p-2 border rounded w-full"
          value={formData.password}
          onChange={handleChange}
          required
        />
        {errors.password &&
          <div className="error">
            {errors.password}
          </div>}

        <select
          name="roles"
          value={formData.roles[0]}
          onChange={e =>
            setFormData(prev => ({ ...prev, roles: [e.target.value] }))}
          required
        >
          <option value="user">User</option>
          <option value="admin">Admin</option>
        </select>

        <button type="submit">Register</button>
      </form>
      <Link to="/login" className="link">
        Already have an account? Login
      </Link>
    </div>
  );
};

RegisterForm.propTypes = {
  onRegisterSuccess: PropTypes.func.isRequired
};

export default RegisterForm;