import { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function Login({ onLogin }) {
    const [creds, setCreds] = useState({});
    const navigate = useNavigate();
  
    function handleLogin() {
      // For demonstration purposes only. Never use these checks in production!
      // Use a proper authentication implementation
      if(creds.username === 'admin' && creds.password === '123') {
        onLogin && onLogin({username: creds.username});
        navigate('/stats');
      }
    }
    return (
      <div style={{ padding: 10 }}>
        <br/>
        <span>Username:</span><br/>
        <input
          type="text"
          onChange={(e) => setCreds({...creds, username: e.target.value})}/><br/>
        <span>Password:</span><br/>
        <input
          type="password"
          onChange={(e) => setCreds({...creds, password: e.target.value})}/><br/><br/>
        <button onClick={handleLogin}>Login</button>
      </div>
    );
  }