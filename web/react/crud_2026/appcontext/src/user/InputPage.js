import { useContext } from 'react';
import { UserContext } from './UserContext';

function InputPage() {
  const { setName } = useContext(UserContext);

  return (
    <div>
      <input 
        type="text" 
        onChange={(e) => setName(e.target.value)} 
        placeholder="Enter your name"
      />
    </div>
  );
}
export default InputPage;