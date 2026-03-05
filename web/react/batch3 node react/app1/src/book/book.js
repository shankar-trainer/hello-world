// import './book.css'
function Book() {
    return (
        <div className='container bg-secondary p-5 m-5 text-primary'>
            <h2>Book Page</h2>
        <table className="table table-striped table-bordered text-light bg-dark" 
        style={{'border-radius':'20pt'}}>
                <tr>
                    <th>isbn</th>
                    <th>name</th>
                    <th>cost</th>
                    <th>author</th>
                </tr>
                <tr>
                    <td>{mybook.isbn}</td>
                    <td>{mybook.name}</td>
                    <td>{mybook.cost}</td>
                    <td>{mybook.author}</td>
                </tr>
                {
                    mybook1.map(bk =>
                        <tr>
                            <td>{bk.isbn}</td>
                            <td>{bk.name}</td>
                            <td>{bk.cost}</td>
                            <td>{bk.author}</td>
                        </tr>
                    )
                }
            </table>
        </div>
    )
}
export default Book;

var mybook = {
    "isbn": 1000001,
    "name": 'react for beginner',
    "cost": 12000,
    "author": "ram kumar"
}
var mybook1 = [
    {
        "isbn": 1000002,
        "name": 'react for beginner',
        "cost": 13000,
        "author": "ram kumar"
    },
    {
        "isbn": 1000003,
        "name": 'react for beginner',
        "cost": 12000,
        "author": "ram kumar"
    },
    {
        "isbn": 1000004,
        "name": 'react for beginner',
        "cost": 12000,
        "author": "ram kumar"
    },
    {
        "isbn": 1000005,
        "name": 'react for beginner',
        "cost": 12000,
        "author": "ram kumar"
    },
    {
        "isbn": 1000006,
        "name": 'react for beginner',
        "cost": 12000,
        "author": "ram kumar"
    },
    {
        "isbn": 1000006,
        "name": 'react for beginner',
        "cost": 12000,
        "author": "ram kumar"
    },
    {
        "isbn": 1000007,
        "name": 'react for beginner',
        "cost": 12000,
        "author": "ram kumar"
    },
    {
        "isbn": 1000008,
        "name": 'react for beginner',
        "cost": 12000,
        "author": "ram kumar"
    }
]