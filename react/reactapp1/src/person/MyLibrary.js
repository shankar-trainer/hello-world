const MyLibrary = (props) => {

    return (
        <div className="container">
            <table className="table table-bordered table-striped p-5 m-5">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Member</th>
                </tr>
                {
                    props.data.map(a =>
                        <tr>
                            <td>{a.library_id}</td>
                            <td>{a.library_name}</td>
                            <td>{a.member}</td>
                        </tr>
                    )
                }
            </table>
        </div>
    );
}

export default MyLibrary;