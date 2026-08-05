function User() {
    return (
        <div className="container bg-success text-light p-5  w-50"
            style={{ 'margin-left': '250pt', 'margin-top': '20pt', 'border-radius': '20pt' }}>
            <h1>Hello User</h1>
            <div>
                <div>Id  : {user.id}</div>
                <div>Name  : {user.name}</div>
                <div>Salary  : {user.salary}</div>
            </div>
            <div>
                <h2>BooK</h2>
                <div>
                    BooK length  is {book.length}
                </div>
                <div className="border p-2 m-2 w-50">
                    Book First
                    <div>isbn :{book[0].isbn}</div>
                    <div>name :{book[0].bname}</div>
                    <div>cost :{book[0].cost}</div>
                </div>

                <div>
                    <div>All Books </div>
                    <ul>
                        <li>isbn - bname - cost</li>
                        {
                            book.map(a =>
                                <li>{a.isbn} - {a.bname} - {a.cost}</li>
                            )
                        }
                    </ul>
                </div>
                <div>
                    <table className="table table-bordered table-striped">
                      <h3>Book table</h3>
                        <tr><th>Id</th><th>name</th><th>cost</th></tr>
                        {
                            book.map(a => <tr>
                             <td>{a.isbn}</td>
                             <td>{a.bname}</td>
                             <td>{a.cost}</td>
                             </tr>
                            )
                        }
                        
                    </table>
                    <table className="table table-bordered table-striped">
                      <h4>Book table with cost >=1200</h4>
                        <tr><th>Id</th><th>name</th><th>cost</th></tr>
                        {
                            book.filter(a=>a.cost>=1200).map(a => <tr>
                             <td>{a.isbn}</td>
                             <td>{a.bname}</td>
                             <td>{a.cost}</td>
                             </tr>
                            )
                        }
                    </table>
                    
                    <table className="table table-bordered table-striped">
                      <h4>First Book  with cost 1200</h4>
                        <tr><th>Id</th><th>name</th><th>cost</th></tr>
                        {
                             
                             <tr>
                             <td>{book.find(a=>a.cost==1200).isbn}</td>
                             <td>{book.find(a=>a.cost==1200).bname}</td>
                             <td>{book.find(a=>a.cost==1200).cost}</td>
                             </tr>
                            
                        }
                    </table>
                </div>
            </div>
        </div>
    )
}
export default User;

var user = {
    "id": 10001,
    "name": "suman kumar",
    "salary": 20000
}
var book = [
    {
        "isbn": 6766776,
        "bname": "react for beginner",
        "cost": 1200
    },

    {
        "isbn": 6766771,
        "bname": "java for beginner",
        "cost": 1100
    },
    {
        "isbn": 6766779,
        "bname": "react for pro",
        "cost": 1500
    },
    {
        "isbn": 6766770,
        "bname": "react for fullstack",
        "cost": 1200
    },

]