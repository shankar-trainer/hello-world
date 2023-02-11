import logo from './logo.svg';
import image1 from './images/image1.jpg'
import './App.css';
import './mystyle.css'
var name = 'ram kumar'
var age = 30

function App() {
  return (
    <div className='style1'>
      <img src={logo}></img>
      <h1>hello world</h1>
      <h2>name is {name}</h2>
      <span>age is {age}</span>
      <div>
        <img src={image1}></img>
      </div>
    </div>
  );
}
const User = {
  id: 10001,
  name: {
    fname: 'ravi kant',
    lname: 'varma'
  },
  age: 30
}
const course = {
  cname: 'Btech',
  Fee: 60000,
  address: {
    city: 'hyderabad',
    state: 'telengana',
    country: 'india'
  }
}
function CourseInfo () {
  return (
    <div className='style1'>
      <p>Course Information</p>
      <span>Name is {course.cname}</span><br></br>
      <span>Fee is {course.Fee} </span><br></br>
      <span>Address is  </span><br></br>
      <>City is {course.address.city}</><br></br>
      <>State is {course.address.state}</><br></br>
      <>Country is {course.address.country}</>
    </div>
  )
}
const UserInfo = () => {
  return (
    <div className='style1'>
      <p>User Information</p>
      <span>Id is {User.id}</span><br></br>
      <span>Name is {User.name.fname} {User.name.lname}</span><br></br>
      <span>Age is {User.age}</span><br></br>
    </div>
  )
}
function App1() {
  return (
    <div>
      <img src={logo} width='300' height='210'></img>
      {UserInfo()}
      {CourseInfo()}

    </div>
  )
}

export default App;
//export default App1;
