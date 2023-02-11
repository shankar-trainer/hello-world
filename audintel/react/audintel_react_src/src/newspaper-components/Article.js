import { Component } from "react";

class Article extends Component {
    constructor(props) {
        super(props);
        this.state = {
            article: [
                { "id": 10001, "name": "political", value: "election in telengana" },
                { "id": 10002, "name": "music", value: "telugu music launch" },
                { "id": 10003, "name": "entertainment", value: "avatar2 release" },
                { "id": 10004, "name": "sports", value: "cricket match" }
            ]
        }
    }
    render() {
        return (
            <div>
                <table className="table table-striped  table-bordered bg-light text-dark m-5 p-5" style={{'text-align':'left','width':'80%'}}>
                    <tr><th>Id</th><th>Name</th><th>value</th></tr>
                    {this.state.article.map(a => 
                        <tr>
                            <td>{a.id}</td>
                            <td>{a.name}</td>
                            <td>{a.value}</td>
                        </tr>
                    )}
                </table>
            </div>
        )
    }
}
export default Article;