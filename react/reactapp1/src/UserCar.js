function UserCar(props){
      return(
        <>
        <table className="table table-striped">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                </tr>
            </thead>
            <tbody>
            {props.car.map((c)=>(
               <tr>
                <td>{c.id}</td>
                <td>{c.name}</td>
                <td>{c.cost}</td>
               </tr>
            ))
           }
           </tbody>
        </table>
        </>
      )
}
export default UserCar;