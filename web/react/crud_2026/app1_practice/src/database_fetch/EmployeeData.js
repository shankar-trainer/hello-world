import { useEffect, useState } from "react"

export const EmployeeData = () => {
    const [data, setData] = useState(null);
    const [error, setError] = useState(null);
    const [loading, setLoading] = useState(true);

// using fetchdata

    useEffect(() => {
        const fetchData = async () => {
            try {
                var response = await fetch('http://localhost:2000/employee')
                if (!response.ok)
                    throw new Error('some error ')
                     const result = await response.json();
                    // setData(await response.json())
                    setData(result);
            }
            catch (e) {
              setError(e)
            }
            finally {
                setLoading(false);
            }
        };
        fetchData();
    }, [])
         if (loading) return <p>Loading...</p>;
         if (error) return <p>Error: {error}</p>;
    return (
        <div>
            <table>
                <tr><th>id</th><th>name</th><th>salary</th></tr>
                {
                    data.map(a =>
                        <tr key={a.id}>
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