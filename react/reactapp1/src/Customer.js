const Customer=()=>{
    return(
        <div className="w-50 container bg-info p-5">
        <table className="table table-bordered table-striped">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Salary</th>
            </tr>
            <tr>
                <td>{mycustomer[0].id}</td>
                <td>{mycustomer[0].name}</td>
                <td>{mycustomer[0].salary}</td>
            </tr>
            
                {
                    mycustomer.map(a=>
                        <tr>
                       <td>{a.id}</td>   
                       <td>{a.name}</td>   
                       <td>{a.salary}</td>   
                       </tr>
                    )
                }
        </table>
           
        </div>
    )
}
const mycustomer=[
    {'id':100000,'name':'ram kumar','salary':200000},
    {'id':100001,'name':'suresh kumar','salary':250000},
    {'id':100002,'name':'parmakesh kumar','salary':2030000},
    {'id':100003,'name':'dhiraj kumar','salary':4540000},
    {'id':100004,'name':'suraj kumar','salary':100000},
    {'id':100005,'name':'vimal kumar','salary':340000},
    {'id':100006,'name':'kamal kumar','salary':267000},
]
export default Customer;