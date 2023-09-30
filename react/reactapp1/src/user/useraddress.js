function UserAddress() {
    return (
        <div>
            <h2>Address</h2>
            <table className="table table-bordered table-stripped ">
                <thead>
                    <tr>
                        <th>Address Id</th>
                        <th>Address City</th>
                        <th>Address Location</th>
                        <th>Address State</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>{useraddress[0].addrid}</td>
                        <td>{useraddress[0].city}</td>
                        <td>{useraddress[0].location}</td>
                        <td>{useraddress[0].state}</td>
                    </tr>
                    {
                        useraddress.map((user) =>
                            <tr>
                                <td>{user.addrid}</td>
                                <td>{user.city}</td>
                                <td>{user.location}</td>
                                <td>{user.state}</td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}
export default UserAddress;
const useraddress = [
    { "addrid": 1, "city": "greater noida", "location": "sector 1", "state": "up" },
    { "addrid": 2, "city": "gurgaon", "location": "krishna puri", "state": "haryana" },
    { "addrid": 3, "city": "chandigarh", "location": "ganesh nagar", "state": "punjab" },
]


