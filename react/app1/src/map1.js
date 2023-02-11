export default function Map1(props){
    var a=10
    var ar1=[1,2,3,4,5,6]
    var ar2=ar1.map(a=>a*a)

    var ar11=ar1.map(a=> <b>{a},</b>)
    var ar22=ar2.map(a=> <b>{a},</b>)
    

    return(
        <div>
        <h1 style={{border:'transparent'}}>{a}</h1>
        <p>{ar1}</p>
        <p>{ar2}</p>
        {ar11}<br></br>
        {ar22}<br></br>
        </div>
    )
}