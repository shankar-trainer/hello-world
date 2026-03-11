import { useEffect, useState } from "react"

export const AllBook = () => {

    const [data, setData] = useState(null)
    const [error, setError] = useState(null)
    const [loading, setLoading] = useState(true)

    useEffect(() => {

        const bookData = async () => {
            try {
                var response = await fetch('http://localhost:8082/book')
                if (!response.ok) {
                    throw new Error('some error ')
                }

                const result = await response.json()
                setData(result)
                console.log(JSON.stringify(result))
            }
            catch (e) {
                setError(e)
            }
            finally {
                setLoading(false)
            }
        }
        bookData();
    }, [])

    if (loading) return <p>Loading</p>
     if (error) return <p>{error.message}</p>

    return (
        <div>
            <table>
                <tr><th>isbn</th><th>name</th><th>publish</th><th>cost</th></tr>
            {data && data.map(b => (
                        <tr key={b.isbn}>
                            <td>{b.isbn}</td>
                            <td>{b.name}</td>
                            <td>{b.publishDate}</td>
                            <td>{b.cost}</td>
                        </tr>
                    ))}
            </table>
        </div>
    )
}