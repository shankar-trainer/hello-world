export default function Publisher(){
    return(
        <div className="border border-dark w-50 ml-1 p-5" style={{'marginLeft':'100px'}}>
            
        <h1 style={{'marginLeft':'100px'}}>Publisher Page</h1>
           <ul className="ml-5" style={{'marginLeft':'100px'}}>
            <li>Id: {publisher.id}</li>
            <li>Name: {publisher.name}</li>
            <li>Location: {publisher.location}</li>
            <li>State: {publisher.state}</li>
           </ul>
        </div>
    )
}


const publisher={
    id:89879987,
    name:'abc publisher',
    location:'meerut',
    state:'up',
    country:'india'
};