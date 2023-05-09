import Clock from "../clock";
import '../css/car.css';
export default function Cart(props) {
    return (
        <>
            <h1 style={{ border: 'transparent', width: 'auto' }}>Shopping Products</h1>
            <table className="table table-bordered table-striped bg-dark text-white" >
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>MFD</th>
                </tr>
                {
                    props.itemList.map(i => (
                        <tr>
                            <td>{i.id}</td>
                            <td>{i.prdname}</td>
                            <td>{i.cost}</td>
                            <td>{i.mfd}</td>
                        </tr>
                    )
                    )
                }
            </table>
            <h1 style={{ border: 'transparent', width: 'auto' }}>Using Filter<br></br>Data with odd Id</h1>
            <table className="table table-bordered table-striped bg-dark text-white" >
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>MFD</th>
                </tr>
                {
                    props.itemList.filter(
                        (a) => a.id % 2 !== 0
                    ).map(i => (
                        <tr style={{ background: 'lightyellow', 'color': 'black' }}>
                            <td>{i.id}</td>
                            <td>{i.prdname}</td>
                            <td>{i.cost}</td>
                            <td>{i.mfd}</td>
                        </tr>
                    )
                    )
                }
            </table>

            <h1 style={{ border: 'transparent', width: 'auto' }}>Using Filter<br></br>Data with cost >=5000</h1>
            <table className="table table-bordered table-striped bg-dark text-white" >
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>MFD</th>
                </tr>
                {
                    props.itemList.filter(
                        (a) => a.cost >= 5000
                    ).map(i => (
                        <tr style={{ background: 'lightyellow', 'color': 'black' }}>
                            <td>{i.id}</td>
                            <td>{i.prdname}</td>
                            <td>{i.cost}</td>
                            <td>{i.mfd}</td>
                        </tr>
                    )
                    )
                }
            </table>

            <h1 style={{ border: 'transparent', width: 'auto' }}>Data with Sort by  Id</h1>
            <table className="table table-bordered table-striped bg-dark text-white" >
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>MFD</th>
                </tr>

                {
                    props.itemList.sort(
                        (a, b) => a.id - b.id
                    ).map(i => (
                        <tr style={{ background: 'yellow', 'color': 'black' }}>
                            <td>{i.id}</td>
                            <td>{i.prdname}</td>
                            <td>{i.cost}</td>
                            <td>{i.mfd}</td>
                        </tr>
                    )
                    )
                }
            </table>

            <h1 style={{ border: 'transparent', width: 'auto' }}>Product Data  Sort by  Cost</h1>
            <table className="table table-bordered table-striped bg-dark text-white" >
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>MFD</th>
                </tr>

                {
                    props.itemList.sort(
                        (a, b) => a.cost - b.cost
                    ).map(i => (
                        <tr style={{ background: 'yellow', 'color': 'black' }}>
                            <td>{i.id}</td>
                            <td>{i.prdname}</td>
                            <td>{i.cost}</td>
                            <td>{i.mfd}</td>
                        </tr>
                    )
                    )
                }
            </table>
            <h1 style={{ border: 'transparent', width: 'auto' }}>Product Data  Sort by  Product Name</h1>
            <table className="table table-bordered table-striped bg-dark text-white" >
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>MFD</th>
                </tr>
                
                {
                    props.itemList.sort(
                        (a, b) =>    a.prdname.localeCompare(b.name)
                    ).map(i => (
                        <tr style={{ background: 'yellow', 'color': 'black' }}>
                            <td>{i.id}</td>
                            <td>{i.prdname}</td>
                            <td>{i.cost}</td>
                            <td>{i.mfd}</td>
                        </tr>
                    )
                    )
                }
            </table>
        </>
    )
}
