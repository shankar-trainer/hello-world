import { useContext, useState } from "react"
import { ArticleContext } from "./ArticleProvider"

export const AddArticle = () => {

    const {dispatch} = useContext(ArticleContext);
    const [article,setArticle]=useState()

    const handleArticlesData = (e) => {
        setArticle({
            ...article,
            [e.target.id]: e.target.value
        })
    }
    const addNewArticle = e => {
        e.preventDefault();
        dispatch({ type: "ADD_ARTICLE", article })
    }

    return (
        <form onSubmit={addNewArticle}>
            <input id="title" placeholder="Title" onChange={handleArticlesData}></input>
            <input id="body" placeholder="Body" onChange={handleArticlesData}></input>
            <button>Add Artilce</button>
        </form>
    )

}