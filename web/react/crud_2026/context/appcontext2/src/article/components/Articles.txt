import { useContext } from "react"
import { ArticleContext } from "./ArticleProvider"
import { Article } from "./Article";

export const Articles=()=>{
 const {articles}=useContext(ArticleContext);
    return(
        <>
        {
            articles.map(a=>(
                        <Article key={a.id} article={a} />
            ))
        }
        </>
    )
}