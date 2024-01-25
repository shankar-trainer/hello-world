import Bus from './Bus';
import { Customer } from './Customer_database1';
import { Customer_data } from './Customer_database2';
import Hello, { Greeting, Test1,Test2 } from './Example';
import { Hook1 } from './Hookprg1';
import Leader from './Leader';
import MyCounter from './MyCounter';
import RegistrationForm from './RegistrationForm';
import { Voter } from './data/Voter';
import { Hook_form1 } from './hook_form1';
export  default function Welcome(){
    return(
        <div>
            {/* <Hello></Hello>
            <Greeting></Greeting>
            <Test1></Test1>
            <Test2></Test2> */}
             {/* <Leader voter={Voter}></Leader>  */}
            {/* <MyCounter></MyCounter> */}
            {/* <Bus fare='70' route='noida to delhi'></Bus>
            <Bus fare={data.fare} route={data.route}></Bus> */}
            {/* <Bus></Bus> */}
            {/* <RegistrationForm></RegistrationForm> */}
            {/* <Hook1></Hook1> */}
            {/* <Hook_form1></Hook_form1> */}
             <Customer></Customer> 
            {/* <Customer_data></Customer_data> */}
        </div>
    )
}
const data={
     "fare":40,
     "route":'delhi to gurgaon'
}

