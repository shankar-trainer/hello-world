function Address(){
    return(
        <div className="container">
            <h2>Address</h2>
            <table className="table table-bordered table-striped bg-dark text-light">
                 <tr>
                    <th>Address Id</th>
                    <th>City</th>
                    <th>Location</th>
                    <th>State</th>
                 </tr>
                 <tr>
                    <td>{address[0].addressId}</td>
                    <td>{address[0].city}</td>
                    <td>{address[0].location}</td>
                    <td>{address[0].state}</td>
                 </tr>
                 
                 <tr>
                    <td>{address[1].addressId}</td>
                    <td>{address[1].city}</td>
                    <td>{address[1].location}</td>
                    <td>{address[1].state}</td>
                 </tr>
            </table>
        </div>
    )
}

export default Address;

const address=[
    {
       "addressId":1,
       "city":"hyderabad",
       "location":"hitech city",
       "state":"telengana" 
    },
    {
       "addressId":2,
       "city":"banglore",
       "location":"manyta tech park",
       "state":"karnataka" 
    },
]
      

