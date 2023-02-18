import React from 'react'
import { useTable } from 'react-table'

export default function Table1() {
    const data = React.useMemo(
        () => [
            {
                name: 'ram kumar',
                age: 22,
                salary: 20000
            },

            {
                name: 'suresh kumar',
                age: 24,
                salary: 45000
            },

            {
                name: 'amit kumar',
                age: 28,
                salary: 45000
            },

            {
                name: 'pawan kumar',
                age: 29,
                salary: 70000
            },

            {
                name: 'pankaj kumar',
                age: 32,
                salary: 60000
            },

            {
                name: 'kamlesh kumar',
                age: 25,
                salary: 89000
            },

            {
                name: 'parvej alam',
                age: 45,
                salary: 62000
            },
        ],
        []
    )

    const columns = React.useMemo(
        () => [
            {
                Header: 'Name',
                accessor: 'name', // accessor is the "key" in the data
            },
            {
                Header: 'Age',
                accessor: 'age',
            },
            {
                Header: 'Salary',
                accessor: 'salary'
            },

        ],
        []
    )

    const {
        getTableProps,
        getTableBodyProps,
        headerGroups,
        rows,
        prepareRow,
    } = useTable({ columns, data })

    return (
        <table {...getTableProps()} style={{ border: 'solid 5px blue',width:'50%',marginLeft:'300px',marginTop:'100px' }}>
            <thead>
                {headerGroups.map(headerGroup => (
                    <tr {...headerGroup.getHeaderGroupProps()}>
                        {headerGroup.headers.map(column => (
                            <th
                                {...column.getHeaderProps()}
                                style={{
                                    borderBottom: 'solid 3px red',
                                    background: 'aliceblue',
                                    color: 'black',
                                    fontWeight: 'bold',
                                }}
                            >
                                {column.render('Header')}
                            </th>
                        ))}
                    </tr>
                ))}
            </thead>
            <tbody {...getTableBodyProps()}>
                {rows.map(row => {
                    prepareRow(row)
                    return (
                        <tr {...row.getRowProps()}>
                            {row.cells.map(cell => {
                                return (
                                    <td
                                        {...cell.getCellProps()}
                                        style={{
                                            padding: '10px',
                                            border: 'solid 1px gray',
                                            background: 'papayawhip',
                                        }}
                                    >
                                        {cell.render('Cell')}
                                    </td>
                                )
                            })}
                        </tr>
                    )
                })}
            </tbody>
        </table>
    )
}
