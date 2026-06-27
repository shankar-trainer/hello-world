import { useState } from "react";
import { UserContext } from "./UserContext";

export const UserProvider = ({ children }) => {
  const [name, setName] = useState(""); // This holds the shared data

  return (
    <>   
     <UserContext.Provider value={{ name, setName }}>
      {children}
    </UserContext.Provider>
    </>
  );
};
