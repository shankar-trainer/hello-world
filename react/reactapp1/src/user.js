import UserAddress from "./user/useraddress";
import UserInfo from "./user/userinfo";

function User() {
    return (
        <div className="container">
            <div className="border border-primary p-5 m-5 bg-secondary text-light">
                <h1>User Data </h1>
                <UserInfo></UserInfo>
                <UserAddress></UserAddress>
            </div>
        </div>

    )
}
export default User;