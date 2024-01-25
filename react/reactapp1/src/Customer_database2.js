import { useEffect, useState } from "react"

export const Customer_data = () => {

    const [data, setData] = useState(null);

    useEffect(() => {
       let url = "http://localhost:8080/customer/all"
        fetch(url)
            .then(result => result.json())
            .then(result => {
                setData(
                   { data: result}
                )
            })
            console.log(data)
    }
    )
    return(
        <div>
        <table className="table table-striped table-bordered bg-warning w-50"
         style={{'border':'solid','marginLeft':'300px','marginTop':'50px'}}
        >
        <h2>Customer Data</h2>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Salary</th>
            </tr>{
            data.map(customer=>
                <tr>
                  <td>{customer.customerId}</td>
                  <td>{customer.customerName}</td>
                  <td>{customer.customerSalary}</td>
                </tr>
            )
        }
        </table>
    </div>
    )
}