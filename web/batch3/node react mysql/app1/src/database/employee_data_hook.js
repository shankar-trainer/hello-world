import { useEffect, useState } from "react"

export const Customer_data = () => {

    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await fetch('http://localhost:2000/employee');
                if (!response.ok) throw new Error('Network response was not ok');
                const result = await response.json();
                setData(result);
            } catch (err) {
                setError(err.message);
            } finally {
                setLoading(false);
            }
        };
        fetchData();
    }, []); // Empty dependency array ensures this runs only on mount

    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error: {error}</p>;
    return (
        <div>
            {/* {JSON.stringify(data)} */}

            <table className='table table-stripped table-bordered'>
                <thead><tr><th>Id</th><th>Name</th><th>Salary</th></tr></thead>
                {

                    data.map(a =>
                        <tr>
                            <td>{a.id}</td>
                            <td>{a.name}</td>
                            <td>{a.salary}</td>
                        </tr>
                    )
                }
            </table>

        </div>

    )
}