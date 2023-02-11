const empdata = [
    {
        "id": 100,
        "FIRST_NAME": "Steven",
        "LAST_NAME": "King",
        "EMAIL": "SKING",
        "PHONE_NUMBER": "515.123.4567",
        "HIRE_DATE": "1987-06-17",
        "SALARY": 24000,
        "DEPARTMENT_ID": 90,
        "Image": "https://www.oracle.com/webfolder/technetwork/jet/Images/dvt/10.png"
    },
    {
        "id": 101,
        "FIRST_NAME": "Neena",
        "LAST_NAME": "Kochhar",
        "EMAIL": "NKOCHHAR",
        "PHONE_NUMBER": "515.123.4568",
        "HIRE_DATE": "1989-09-21",
        "SALARY": 17000,
        "DEPARTMENT_ID": 90,
        "Image": "https://www.oracle.com/webfolder/technetwork/jet/Images/dvt/2.png"
    },
    {
        "id": 102,
        "FIRST_NAME": "Lex",
        "LAST_NAME": "De Haan",
        "EMAIL": "LDEHAAN",
        "PHONE_NUMBER": "515.123.4569",
        "HIRE_DATE": "1993-01-13",
        "SALARY": 17000,
        "DEPARTMENT_ID": 90,
        "Image": "https://www.oracle.com/webfolder/technetwork/jet/Images/dvt/3.png"
    },
    {
        "id": 103,
        "FIRST_NAME": "Alexander",
        "LAST_NAME": "Hunold",
        "EMAIL": "AHUNOLD",
        "PHONE_NUMBER": "590.423.4567",
        "HIRE_DATE": "1990-01-03",
        "SALARY": 9000,
        "DEPARTMENT_ID": 60,
        "Image": "https://www.oracle.com/webfolder/technetwork/jet/Images/dvt/15.png"
    }]
//function EmployeeInfo(){

const EmployeeInfo = () => {
    return (
        <div>
            <h1>Employee Page</h1>
            <table>
                <tr>
                    <th>Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Phone No</th>
                    <th>Hire Date</th>
                    <th>Salary</th>
                    <th>Department Id</th>
                    <th>Image</th>
                </tr>
                {
                    empdata.map(emp => (
                        <tr>
                            <td>{emp.id}</td>
                            <td>{emp.FIRST_NAME}</td>
                            <td>{emp.LAST_NAME}</td>
                            <td>{emp.EMAIL}</td>
                            <td>{emp.PHONE_NUMBER}</td>
                            <td>{emp.HIRE_DATE}</td>
                            <td>{emp.SALARY}</td>
                            <td>{emp.DEPARTMENT_ID}</td>
                            <td><img src={emp.Image}></img></td>
                        </tr>
                    ))
                }
            </table>
        </div>
    )
}
export default EmployeeInfo;