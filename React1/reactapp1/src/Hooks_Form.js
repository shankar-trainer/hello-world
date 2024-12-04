import { useEffect, useState } from "react"

export const Hooks_Forms = (props) => {

    const [id, setId] = useState('')
    const [err_id, setErrId] = useState('')
    const [name, setName] = useState('')
    const [err_name, setErrName] = useState('')

    useEffect(()=>{
        document.title='hooks react form'
       // setName('ram kumar')
       // setId('1001')
    })

    return (
        <>
            <div style={{ 'marginLeft': '200', 'marginTop': '50' }}>
                <form className="w-50 bg-info text-primary p-5">
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" value={id} onChange={(e)=>{
                                   setId(e.target.value)
                                   if(e.target.value=='' || e.target.value.length==0)
                                       // alert('id is blank')
                                    setErrId('id is blank')
                        }}></input>
                        <span className="text-danger">{err_id}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" value={name}
                        onChange={(e)=>{
                            setName(e.target.value)
                            if(e.target.value=='')
                                //alert('name is blank')
                            setErrName('name is blank')
                        }}                        
                        ></input>
                        <span className="text-danger">{err_name}</span>
                    </div>

                </form>
                <h2>Address</h2>
                <table>
                    <tr>
                        <th>Id</th>
                        <th>Location</th>
                        <th>City</th>
                    </tr>
                </table>
                {
                    props.addr.map(a =>
                        <tr>
                            <td>{a.addr_id}</td>
                            <td>{a.location}</td>
                            <td>{a.city}</td>
                        </tr>
                    )
                }
            </div>
        </>
    )

}