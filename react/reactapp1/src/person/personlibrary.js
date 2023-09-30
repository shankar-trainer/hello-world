import MyLibrary from "./MyLibrary";
import Library from "./data/Library";

const PersonLibrary = () => {
    return (
        <MyLibrary data={Library} location="delhi"  ></MyLibrary>
    )

}
export default PersonLibrary;