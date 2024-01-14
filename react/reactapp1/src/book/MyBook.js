import { Component } from "react";
import { Book } from "./book";
import { Author } from "./author";
import Cars from "./data/car";

export class MyBook extends Component{
    constructor(props){
       super(props);
    }
    render(){
        return(
            <div className="container">
            <Book  book_publisher={publisher} ></Book>
            <Author car={Cars}></Author>
            </div>
        )
    }
}

const publisher={
    'id':6767576,
    'name':'india publication',
    'location':'chennai'
}