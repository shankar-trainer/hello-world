import React, { useEffect, useState } from "react";
import api from "../axiosConfig";
import { useNavigate } from "react-router-dom";

export default function Home() {
  const [message, setMessage] = useState("");
  const navigate = useNavigate();

  useEffect(() => {
    api.get("/hello")
      .then(res => setMessage(res.data))
      .catch(() => setMessage("Not authorized"));
  }, []);

  const handleLogout = () => {
    localStorage.removeItem("token"); // Clear the token
    navigate("/login"); // Redirect to login
  };

  return (
    <div className="container">
      <h2>Home</h2>
      <p>
        {message}
      </p>
      <button onClick={handleLogout}>Logout</button>
    </div>
  );
}
