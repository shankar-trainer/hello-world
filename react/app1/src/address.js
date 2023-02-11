import './css/user.css'
export default function Address(props){
    return(
        <div className='style1' style={{margin:50,border:'double 10px blue',marginLeft:200}}>
          <h1>Address</h1>
             <p>Area is {props.area}</p>
             <p>City is {props.city}</p>
             <p>State is {props.state}</p>
             <p>Country is {props.country}</p>
        </div>
    )
}