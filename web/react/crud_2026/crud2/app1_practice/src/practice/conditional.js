export const Conditional=()=>{

    var x=""

    return(
        <>
         {x && <b>hello world </b>}
         {!x && <b>welcome world </b>}
         {x.trim && <i>trimmed</i>}
         {!x.trim && <i>nottrimmed</i>}
        </>
    )
}