const { createContext, useContext, useState } = require("react");

const AuthContext = createContext();
export const AuthProvider1 = ({ children }) => {
   const [user, setUser] = useState(null);

   const login = (userData) => {
      setUser(userData);
      localStorage.setItem('user', JSON.stringify(userData))
   }
   const logout = () => {
      setUser(null);
      localStorage.removeItem('user');
   }

   return (
      <AuthContext.Provider value={{ user, login, logout }}>
         { children }
      </AuthContext.Provider>
   )
};
export const useAuth = () => useContext(AuthContext);

