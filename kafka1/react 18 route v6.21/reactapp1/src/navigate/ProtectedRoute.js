import { Navigate, useNavigate } from "react-router-dom";

export default function ProtectedRoute({ user, children }) {
    const navigate = useNavigate();
  
    if(!user) {
      return (
        <Navigate to="/login" replace/>
      );
    }
  
    return children;
  }
  