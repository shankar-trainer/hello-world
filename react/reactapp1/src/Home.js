import { Link } from "react-router-dom";

function Home() {
  return (
    <div>
      <h1>This is the home page</h1>
      
      <Link to="userform">User Form</Link>
      <Link to="personinfo">Person Info</Link>
      <Link to="counter1">Person Info</Link>
      <Link to="counter2">Person Info</Link>
    </div>
  );
}

export default Home;
