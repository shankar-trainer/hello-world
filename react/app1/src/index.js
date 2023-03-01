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
import UseEffectExample from './hook/UseEffectExample';
//import FriendStatus from './hook/FriendStatus';
import Hello from './hello';
import Table1 from './mytable/table1';
import Table3 from './mytable/table3';
import MyPage from './routing-component/MyPage';
import CustomerForm from './forms/CustomerForm';
import Demo4 from './Demo4';
import MultipleState from './hook/multipleState';
import Table2 from './mytable/table2';
import Reservation from './forms/ReservationForm';
import CheckBoxApp from './forms/UsingCheckBox';
import EmployeeForm1 from './forms/EmployeeForm1';
import StudentForm from './forms/StudentForm';
import FragmentsExample1 from './fragments/Example1';
import Example2 from './fragments/Example2';
import AnimationExample1 from './animation/AnimationExample1';
import AnimationExample2 from './animation/AnimationExample2';
import AnimationExample3 from './animation/AnimationExample3';
import App22 from './context/App';
import App33 from './context1/App';
import ThemeContext from './context1/ThemeContext';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <User></User>
    <Address city='new delhi' area='laxmi nagar' state='delhi' country='india'></Address>
    <Car></Car>
     */}
    {/* <Employee></Employee> */}

    {/* <Student></Student>  */}
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
    {/* <Reservation></Reservation>   */}
    {/* <CheckBoxApp></CheckBoxApp>
  <EmployeeForm1></EmployeeForm1> */}

    {/* <EmployeeForm></EmployeeForm>  */}
    {/* <CustomerForm></CustomerForm>   */}
    {/* <UserForm1></UserForm1> */}
    {/* <UserForm></UserForm> */}
    {/* <Counter></Counter> */}
    {/* <Hello></Hello> */}
    {/* <Table1></Table1>  */}
    {/* <Table2></Table2> */}
    {/* <Table3></Table3>  */}
    {/* <MyPage>
    </MyPage> */}
    {/* <Demo4></Demo4> */}

    {/* <UseEffectExample></UseEffectExample>  */}
    {/* <FriendStatus></FriendStatus> */}

    {/* <Counter></Counter> */}
    {/* <MultipleState></MultipleState> */}
    {/* <StudentForm></StudentForm> */}
    {/* <FragmentsExample1></FragmentsExample1>
    <Example2></Example2> */}
    <AnimationExample1></AnimationExample1>
    {/* <AnimationExample2></AnimationExample2> */}
    {/* <AnimationExample3></AnimationExample3> */}
    {/* <App22></App22> */}
    {/* <App33></App33> */}
 <ThemeContext.Provider value='green'>
  <App33></App33>
 </ThemeContext.Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
