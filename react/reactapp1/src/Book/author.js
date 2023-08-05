var author={
    name:'shyam kumar',
    age:45,
    location:'new delhi',
    books:['react for dummies','react in action','pro react','react for beginner']
}

export default function Author(){
    return(
       <div className="container">
        <div className="w-100">
        <h1>Author Page</h1>
        <table className='table table-striped bg-light ml-5 w-50'>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Location</th>
                    <th>Books</th>
                </tr>
            </thead>
            
            <tbody>
                    <tr>
                        <td>{author.name}</td>
                        <td>{author.age}</td>
                        <td>{author.location}</td>
                         <td>
                            <ul>
                            {
                            author.books.map(a=>(
                                    <li>{a}</li>
                            ))
                         }
                        
                            </ul></td>
                         
                    </tr>
                </tbody>
        </table>
        </div>
        </div>
    )
}

