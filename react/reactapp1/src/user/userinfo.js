function UserInfo() {
    return (
        <div>
            <h2>User Information</h2>
            <div>
                id is {userinfo.id}
            </div>
            <div>
                name is {userinfo.name}
            </div>
            <div>
                age is {userinfo.age}
            </div>

        </div>
    )
}
export default UserInfo;
const userinfo = {
    "id": 10001, "name": "suresh kumar", "age": 30, "gender": "male"
}