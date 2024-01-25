//export default function Person(props)
const Person=(props)=>
{
     return(
        <div className="container border border-primary bg-info text-warning p-5 m-5 w-50">
            <p>Person data</p>
            <p>Id is {props.id}</p>
            <p>Name is {props.name}</p>
            <p>Dob is {props.dob}</p>
        </div>
     )
}
Person.defaultProps={
    'id':5656565,
    'name':'harendra kumar',
    'salary':45000,
    'dob':new Date('2021-10-12').toDateString()
}
export default Person;