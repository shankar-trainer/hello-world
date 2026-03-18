import { useContext } from 'react';
import { UserContext } from './UserContext';

function DisplayPage() {
  const { name } = useContext(UserContext);
  return <h1>Hello, {name }!</h1>;
}

export default DisplayPage;