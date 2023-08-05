import Author from "./Book/author";
import Publisher from "./Book/publisher";
import Reader from "./Book/reader";

export default function BookMain() {
    return (
        <div>
            <h1>Book Information</h1>
            <table>
                <tr>
                    <table>
                        <tr>
                            <td>
                                ISBN {book.isbn} </td>
                        </tr><tr>
                            <td>Name {book.bname} </td>
                        </tr>
                    </table>

                </tr>
                <tr>
                    <td><Author></Author></td>
                </tr>
                <tr>
                    <td><Publisher></Publisher></td>
                </tr>
                <tr>
                    <td><Reader></Reader></td>
                </tr>

            </table>
        </div >
    )
}
var book = {
    isbn: 655665,
    bname: 'two states',
}