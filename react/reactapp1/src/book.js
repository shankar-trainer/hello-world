// export default function Book() {
//     return (
//         <div>
//             <h1> book component </h1>
//         </div>)
// }


const Book1 = () =>
//function Book1()
{
    return (
        <>
            <h2>book component2 </h2>
            {mybook}
        </>
    )
}
const book1 = [
    { isbn: 1001, 'bname': 'react for beginner', cost: 350 }
]

const mybook = <div>
    <table className="table table-bordered w-50 ">
        <tr>
            <th>isbn</th>
            <th>book name</th>
            <th>cost</th>
        </tr>
        <tr>
            <td>
                {book1[0].isbn}
            </td>
            <td>
                {book1[0].bname}
            </td>
            <td>
                {book1[0].cost}
            </td>
        </tr>
    </table>
</div>


export default Book1;