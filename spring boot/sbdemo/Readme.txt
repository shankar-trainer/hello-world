1. Get All Employees -
URL (GET) http://localhost:8080/api/v1/getallemployee
Response -
{
    "employeeDtoList": [
        {
            "employeeId": 1,
            "firstName": "ram",
            "lastName": "kumar",
            "emailId": "ram@gmail.com",
            "departmentId": 1,
            "departmentName": "New IT"
        },
        {
            "employeeId": 2,
            "firstName": "Shayam",
            "lastName": "kumar",
            "emailId": "shayam@gmail.com",
            "departmentId": 1,
            "departmentName": "New IT"
        },
        {
            "employeeId": 3,
            "firstName": "Suman",
            "lastName": "Singh",
            "emailId": "suman@gmail.com",
            "departmentId": 1,
            "departmentName": "New IT"
        }
    ],
    "error": ""
}

2. get Employee by Id -
URL(GET) - http://localhost:8080/api/v1/getemployee/1
{
    "employeeId": 1,
    "firstName": "ram",
    "lastName": "kumar",
    "emailId": "ram@gmail.com",
    "departmentId": 1,
    "departmentName": "New IT",
    "error": ""
}

3. Create Employee -
URL(POST) - http://localhost:8080/api/v1/addemployee
Request -
{
    "firstName": "ram",
    "lastName": "kumar",
    "emailId": "ram@gmail.com",
    "departmentName": "New IT"
}

Response -
{
    "employeeId": 5,
    "firstName": "ram",
    "lastName": "kumar",
    "emailId": "ram@gmail.com",
    "departmentId": 1,
    "departmentName": "New IT",
    "error": ""
}

4. Update Employee -
URL(PUT) - http://localhost:8080/api/v1/updateemployee
Request -
{
    "employeeId": 5,
    "firstName": "ram",
    "lastName": "kumar",
    "emailId": "ram1@gmail.com",
    "departmentName": "Finance"
}

Response -
{
    "employeeId": 5,
    "firstName": "ram",
    "lastName": "kumar",
    "emailId": "ram1@gmail.com",
    "departmentId": 3,
    "departmentName": "Finance",
    "error": ""
}

5. Delete EMployee -
URL (DELETE) - http://localhost:8080/api/v1/deleteemployee
Request -
{
    "employeeId": 5
}

Response -
{
    "employeeId": 5,
    "firstName": "ram",
    "lastName": "kumar",
    "emailId": "ram1@gmail.com",
    "departmentId": 3,
    "departmentName": "Finance",
    "error": ""
}

Error Response -
{
    "employeeId": null,
    "firstName": null,
    "lastName": null,
    "emailId": null,
    "departmentId": null,
    "departmentName": null,
    "error": "Department does not exists"
}

======================== Department =============
1. get all Employee with deprtment -
URL(GET) - http://localhost:8080/api/v1/getepartmentwithemp

Response -
{
    "responseList": [
        {
            "departmentId": 1,
            "departmentName": "New IT",
            "employees": [
                {
                    "employeeId": 3,
                    "firstName": "Suman",
                    "lastName": "Singh",
                    "emailId": "suman@gmail.com",
                    "departmentId": null,
                    "departmentName": null
                },
                {
                    "employeeId": 1,
                    "firstName": "ram",
                    "lastName": "kumar",
                    "emailId": "ram@gmail.com",
                    "departmentId": null,
                    "departmentName": null
                },
                {
                    "employeeId": 2,
                    "firstName": "Shayam",
                    "lastName": "kumar",
                    "emailId": "shayam@gmail.com",
                    "departmentId": null,
                    "departmentName": null
                }
            ]
        },
        {
            "departmentId": 2,
            "departmentName": "Admin",
            "employees": []
        },
        {
            "departmentId": 3,
            "departmentName": "Finance",
            "employees": []
        },
        {
            "departmentId": 4,
            "departmentName": "Development",
            "employees": []
        }
    ],
    "error": ""
}

2. get all department without employee -
URL (GET) - http://localhost:8080/api/v1/geteallpartment
Response -
{
    "responseList": [
        {
            "departmentId": 1,
            "departmentName": "New IT"
        },
        {
            "departmentId": 2,
            "departmentName": "Admin"
        },
        {
            "departmentId": 3,
            "departmentName": "Finance"
        },
        {
            "departmentId": 4,
            "departmentName": "Development"
        }
    ],
    "error": ""
}

3. get department by ID -
URL(GET) - http://localhost:8080/api/v1/getepartment/1

Response -
{
    "departmentId": 1,
    "departmentName": "New IT",
    "error": ""
}

4. Add new department -
URL(POST) - http://localhost:8080/api/v1/adddepartment
Request -
{
    "departmentName": "Department"
}

Response -
{
    "departmentId": 5,
    "departmentName": "Department",
    "error": ""
}

5. Get department by name -
URL(POST) - http://localhost:8080/api/v1/getepartmentbyname

Request -
{
    "departmentName": "Department"
}

Response -
{
    "departmentId": 5,
    "departmentName": "Department",
    "error": ""
}

6. Update Department -
URL(PUT) - http://localhost:8080/api/v1/updateepartment
Request -
{"departmentId": 5,
    "departmentName": "new Department"
}

Response -
{
    "departmentId": 5,
    "departmentName": "new Department",
    "error": ""
}