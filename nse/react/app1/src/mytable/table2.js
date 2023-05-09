import ReactTable from "react-table";
//not working
export default function Table2(props) {
    const data = [
        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        },

        {
            name: 'ram kumar',
            age: 22,
            salary: 20000
        }
    ]
    const columns = [
        {
            Header: 'Name',
            accessor: 'name'
        },

        {
            Header: 'Age',
            accessor: 'age'
        },
        {
            Header: 'Salary',
            accessor: 'salary'
        }

    ]
    return (
        <div style={{ color: 'blue', 'marginTop': '50px' }}>

            <h1 > React Table </h1>

         <ReactTable
          data={data}
          columns={columns}
          
         />

        </div>
    )
} 