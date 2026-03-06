const Item = (props) => {

    return (
        <div>
            <h1>Item page</h1>
            <ol>
                {
                    props.item.map(i =>
                        <li>{i.id}--{i.name}--{i.cost}</li>
                    )
                }
            </ol>
            <table>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                </tr>
                {
                    props.item.map(i =>
                        <tr>
                            <td>{i.id}</td>
                            <td>{i.name}</td>
                            <td>{i.cost}</td>
                        </tr>
                    )
                }
            </table>
            
            <table>
                <tr><th>Sorted By Id</th></tr>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                </tr>
                {
                    props.item.sort((a,b)=>a.id-b.id).map(i =>
                        <tr>
                            <td>{i.id}</td>
                            <td>{i.name}</td>
                            <td>{i.cost}</td>
                        </tr>
                    )
                }
            </table>
            
            <table>
                <tr><th>Sorted By Cost filter cost>=50</th></tr>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                </tr>
                {
                    props.item.filter(a=>a.cost>=50).sort((a,b)=>a.cost-b.cost).map(i =>
                        <tr>
                            <td>{i.id}</td>
                            <td>{i.name}</td>
                            <td>{i.cost}</td>
                        </tr>
                    )
                }
            </table>
        </div>
    )
}
export default Item;