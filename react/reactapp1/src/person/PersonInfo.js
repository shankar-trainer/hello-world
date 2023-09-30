import { Component } from "react";
import Person from "./person";
import Car from "./data/Car";
import MyLibrary from "./MyLibrary";
import Library from "./personlibrary";
import PersonLibrary from "./personlibrary";
import Bus from "./Bus";

export default class PersonInfo extends Component {

    render() {
        return (
            <>
                <Person addr={address} header={Header} mycar={Car}
                    carheader={["Registration No", "Model", "Cost"]} />
                <PersonLibrary></PersonLibrary>
                <Bus></Bus>
                <Bus no='766776' route='delhi to gurgaon'></Bus>
            </>
        )
    }
}
const Header = [
    "Address Id", "City", "State"
]


const address = [
    { addr_id: 91, city: 'jalandhar', state: 'punjab' },
    { addr_id: 92, city: 'ludhiyana', state: 'punjab' },
    { addr_id: 93, city: 'hoshiyarpur', state: 'punjab' },
    { addr_id: 94, city: 'gurudas pur', state: 'punjab' }
]