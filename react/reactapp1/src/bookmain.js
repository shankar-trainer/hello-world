import Author from "./Book/author";
import Publisher from "./Book/publisher";
import Reader from "./Book/reader";

export default function BookMain(){
    return(
        <div>
            <div style={{'margin-left':'400px'}}>
                <h1 style={{'margin-left':'0px'}} >Book Information</h1>
                  <div>ISBN {book.isbn} </div> 
                  <div>Name {book.bname} </div> 
            </div>
            <Author></Author>
            <Publisher></Publisher>
            <Reader></Reader>
        </div>
    )
}
var book={
    isbn:655665,
    bname:'two states',
}