function Hello() {
    return (
        <div className="container m-5 p-5 border border-primary w-50 bg-info">
            <div className="border border-dark p-2 m-2">
                <h1>Employee data</h1>
                <div> id is {emp.id}</div>
                <div> name is {emp.name}</div>
                <div> salary is {emp.salary}</div>
            </div>

            <div className="border border-dark p-2 m-2 bg-primary text-light" style={{ "border-radius": "10pt" }}>
                <h2>Users Data </h2>
                <h3> First Users</h3>
                <div>Id   name   dob</div>
                <div> {users[0].id}  {users[0].name}  {users[0].dob}
                </div>
            </div>
            <div className="border border-dark p-2 m-2 bg-primary text-light" style={{ "border-radius": "10pt" }} >

                <h2>All Users Data  </h2>
                <table className="table table-bordered">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Dob</th>
                    </tr>
                    {
                        users.map(a =>
                            <tr>
                                <td>{a.id}</td>
                                <td>{a.name}</td>
                                <td>{a.dob}</td>
                            </tr>
                        )
                    }
                </table>



            </div>
        </div>
    )
}

var emp = {
    "id": 100001,
    "name": "sumna kumar",
    "salary": 20000
}
var users = [
    { "id": 100001, "name": "amit kumar", "dob": "1999-10-12" },
    { "id": 100002, "name": "vimal kumar", "dob": "1991-1-11" },
    { "id": 100003, "name": "suman kumar", "dob": "1992-2-11" },
    { "id": 100004, "name": "rahul kumar", "dob": "1995-3-1" },
    { "id": 100005, "name": "kamal kumar", "dob": "1999-4-22" },
    { "id": 100006, "name": "hari kumar", "dob": "1998-5-23" },
]

export default Hello;
