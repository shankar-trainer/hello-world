// export const Test2=()=> <div>hello world</div>
export const Conditional = () => {
    // var x = "abc"
    var x = ""
    return (
        <div>

            {/* if x=="" then hello world
if x="abc"  not blank then welcome world */}

            {x && <p>hello world </p>}
            {!x && <p>welcome world </p>}

            {/* . In JavaScript, an empty string is false and  a non-empty string is truthy, 
            x="abc"
               !x.trim()
            so !"abc" evaluates to false.

            Therefore, the result of !x.trim() is:
            false */}

            {x.trim() && <p>greeting </p>}
            {!x.trim() && <p>welcome </p>}


        </div>
    )
}