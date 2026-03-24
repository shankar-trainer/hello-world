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

// https://github.com/rafacdomin/Auth-React-ContextAPI/tree/master
// https://github.com/ibrahima92/react-context-hooks-example/tree/master