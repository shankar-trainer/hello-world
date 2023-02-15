import 'bootstrap/dist/css/bootstrap.min.css';
import {FaStar} from 'react-icons/fa';
//import 'boostrap/dist/css/bootstrap.css';
//export default function StartRating()
const StartRating=({totalStars=5})=>
{
    return(
        <div className="m-5 p-5 bg-info text-center" style={{'border':'inset blue 20pt','borderRadius':'30px'}}>
            <h1>Star Rating</h1>
            <FaStar color='red'/>,
            <FaStar color='red'/>,
            <FaStar color='red'/>,
            <FaStar color='red'/>

        </div>
    )
}
export default StartRating;