const Item = (props) => {
    const listItems = [];

    // 2. Use a for loop to populate the array
    for (let i = 0; i < props.item.length; i++) {
        const item = props.item[i];
        
        // Push the JSX into our array. 
        // Note: Always include a 'key' prop when rendering lists!
        listItems.push(
            <li key={item.id}>
                {item.id}--{item.name}--{item.cost}
            </li>
        );
    }

    return (
        <div>
            <h1>Item page</h1>
            <ol>
                {/* 3. Render the array of JSX elements */}
                {listItems}
            </ol>

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
                    props.item.sort((a, b) => a.id - b.id).map(i =>
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
            </table>
        </div>
    )
}
export default Item;