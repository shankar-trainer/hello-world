import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import User from './user';
import Address from './address';
import Car from './car';
import Employee from './employee';
import Student from './student';
import 'bootstrap/dist/css/bootstrap.min.css';
import Counter from './hook/counter1';
import Book from './book';
import Shopping from './shopping/shopping';
import Product from './shopping/product';
import Survey from './survey';
import SurveyData from './SurevyData';
import Clock1 from './clock1';
import Greeting from './Login/Greeting';
import LoginControl from './Login/LoginControl';
import Map1 from './map1';
import MainPage from './props/MainPage';
import ValidateProps from './props/ValidateProps';
import UserForm from './forms/UserForm';
import PersonForm from './forms/PersonForm ';
import EmployeeForm from './forms/EmployeeForm';
import UserForm1 from './forms/UserForm1';
import MultiplState from './hook/multiplsState';
import UseEffectExample from './hook/UseEffectExample';
//import FriendStatus from './hook/FriendStatus';
import Hello from './hello';
import Table1 from './mytable/table1';
import Table3 from './mytable/table3';
import MyPage from './routing-component/MyPage';
import CustomerForm from './forms/CustomerForm';
import Demo4 from './Demo4';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <User></User>
    <Address city='new delhi' area='laxmi nagar' state='delhi' country='india'></Address>
    <Car></Car>
     */}
    {/* <Employee></Employee> */}
    {/* <Counter></Counter>
<Student></Student> */}
    {/* <Book isbn='7878878' bname='react quickly' author='c kumar' cost='900'></Book> 
 <Book></Book>  */}
    {/* <Product></Product> */}
    {/* <Shopping></Shopping> */}
    {/* <SurveyData></SurveyData>  */}
    {/* <Clock1></Clock1> */}
    {/* <Greeting isLoggedIn='false'></Greeting> */}
          {/* <LoginControl></LoginControl>  */}
    {/* <Map1></Map1> */}
    {/* <Greeting isLoggedIn={false} /> */}
    {/* <MainPage></MainPage> */}
    {/* <ValidateProps></ValidateProps> */}
    {/* <UserForm></UserForm> */}
    {/* <PersonForm></PersonForm>  */}
    {/* <EmployeeForm></EmployeeForm>  */}
   <CustomerForm></CustomerForm> 
    {/* <UserForm1></UserForm1> */}
    {/* <UserForm></UserForm> */}
    {/* <Counter></Counter> */}
    {/* <UseEffectExample></UseEffectExample> */}
    {/* <FriendStatus></FriendStatus> */}
    {/* <Hello></Hello> */}
    {/* <Table1></Table1> */}
    {/* <Table2></Table2> */}
    {/* <Table3></Table3> */}
    {/* <MyPage>
 
</MyPage> */}
    {/* <MultiplState></MultiplState> */}
<Demo4></Demo4>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
