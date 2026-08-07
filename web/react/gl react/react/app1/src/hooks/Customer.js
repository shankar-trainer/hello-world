function Customer(props){
    return(
        <div className="container">
         <h2>Customer Page</h2>
         <p>Company is {props.company}</p>
        <h3> Cars are</h3>
            <ul>
               {
                props.car.map(a=>
                    <li>
                        {a.carRegno}-
                        {a.model}-
                        {a.cost}-
                    </li>
                )
               } 
            </ul>
            <hr></hr>
            <table className="table table-bordered bg-warning">
                <tr className="bg-info">
                    <th>Car RegNo</th>
                    <th>Model</th>
                    <th>Cost</th>
                </tr>
               {
                props.car.map(a=>
                    <tr>
                        <td>{a.carRegno}</td>
                        <td>{a.model}</td>
                        <td>{a.cost}</td>
                    </tr>
                )
               } 
            </table>
        </div>
    )
}
export default Customer;