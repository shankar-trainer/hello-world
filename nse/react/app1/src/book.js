import Clock from "./clock"

export default function Book(props) {

    return (
        <div className=" m-auto mt-5 bg-dark text-light w-75 p-5">
                            <Clock></Clock>

            <h1>Book Page</h1>
              <div>ISBN is {props.isbn}</div>
              <div>Name of Book  is {props.bname}</div>
              <div>Author is {props.author}</div>
              <div>Cost is {props.cost}</div>
        </div>

    )

}
Book.defaultProps={
    isbn:'87787899',
    bname:'learning react',
    author:'piyush sharma',
    cost:6700

}