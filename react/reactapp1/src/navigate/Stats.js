import { Navigate, useNavigate } from "react-router-dom";

export default function Stats({ user }) {
    const navigate = useNavigate();
  
    if(!user) {
      return (
        <Navigate to="/login" replace/>
      );
    }
  
    return (
      <div style={{ padding: 20 }}>
        <h2>Stats View</h2>
      </div>
    );
  }