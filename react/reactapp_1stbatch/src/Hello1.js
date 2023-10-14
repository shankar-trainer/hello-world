import logo1 from './logo.svg';
function Hello1() {
    return (
        <div>
            <h1>User Information</h1>
            <table border={5} className='table table-striped bg-light text-dark table-bordered'
             style={{'width':'70%','margin-left':'200px'}}
            >
                <thead>
                    <tr>
                        <th rowSpan={2}>Id</th>
                        <th rowSpan={2}>Name</th>
                        <th rowSpan={2}>Salary</th>
                        <th colSpan={4}>Address</th>
                    </tr>
                    <tr>
                        <th>city</th>
                        <th>state</th>
                        <th>pin</th>
                        <th>country</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>{user.id}</td>
                        <td>{user.name}</td>
                        <td>{user.salary}</td>
                        <td>{user.address.city}</td>
                        <td>{user.address.state}</td>
                        <td>{user.address.pin}</td>
                        <td>{user.address.country}</td>
                    </tr>
                    <tr>
                        <td>{user.id}</td>
                        <td>{user.name}</td>
                        <td>{user.salary}</td>
                        <td>{user.address.city}</td>
                        <td>{user.address.state}</td>
                        <td>{user.address.pin}</td>
                        <td>{user.address.country}</td>
                    </tr>
                    <tr>
                        <td>{user.id}</td>
                        <td>{user.name}</td>
                        <td>{user.salary}</td>
                        <td>{user.address.city}</td>
                        <td>{user.address.state}</td>
                        <td>{user.address.pin}</td>
                        <td>{user.address.country}</td>
                    </tr>
                    <tr>
                        <td>{user.id}</td>
                        <td>{user.name}</td>
                        <td>{user.salary}</td>
                        <td>{user.address.city}</td>
                        <td>{user.address.state}</td>
                        <td>{user.address.pin}</td>
                        <td>{user.address.country}</td>
                    </tr>
                    <tr>
                        <td>{user.id}</td>
                        <td>{user.name}</td>
                        <td>{user.salary}</td>
                        <td>{user.address.city}</td>
                        <td>{user.address.state}</td>
                        <td>{user.address.pin}</td>
                        <td>{user.address.country}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}
const user = {
    'id': 10001,
    'name': 'suman kumar',
    'salary': 2000,
    'address': {
        'city': 'new delhi',
        'state': 'delhi',
        'pin': 788787,
        'country': 'india'
    }
}
export default Hello1;