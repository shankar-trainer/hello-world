import { useEffect, useState } from "react"
import PersonService from "./service/PersonService"

export const PersonForm1 = (props) => {

    const [id, setId] = useState('')
    const [err_id, setErrId] = useState('')
    const [name, setName] = useState('')
    const [err_name, setErrName] = useState('')
    const [salary, setSalary] = useState('')
    const [err_salary, setErrSalary] = useState('')

    const savePerson = () => {
        let person = { personId: id, personName: name, personSalary: salary }
        let p = PersonService.createPerson(person)
        alert("person added")
    }

    return (
        <>
            <div style={{ 'marginLeft': '200', 'marginTop': '50' }}>
                <form className="w-50 bg-info text-primary p-5">
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" value={id} onChange={(e) => {
                            setId(e.target.value)
                            if (e.target.value == '' || e.target.value.length == 0)
                                // alert('id is blank')
                                setErrId('id is blank')
                        }}></input>
                        <span className="text-danger">{err_id}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" value={name}
                            onChange={(e) => {
                                setName(e.target.value)
                                if (e.target.value == '')
                                    setErrName('name is blank')
                            }}
                        ></input>
                        <span className="text-danger">{err_name}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Salary</label>
                        <input className="form-control" value={salary}
                            onChange={(e) => {
                                setSalary(e.target.value)
                                if (e.target.value == '')
                                    //alert('name is blank')
                                    setErrSalary('salary is blank')
                            }}
                        ></input>
                        <span className="text-danger">{err_salary}</span>
                    </div>
                    <div className="form-group">
                        <button type="button" className="form-control btn btn-primary mt-3 w-25"
                            onClick={savePerson}  >save Person
                        </button>
                    </div>
                </form>
            </div>
        </>
    )
}