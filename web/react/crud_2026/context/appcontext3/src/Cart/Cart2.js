import { useReducer, useState } from "react"
/*
coders gyan react
https://github.com/codersgyan/react-shopping-cart
https://www.youtube.com/watch?v=iyresihBdO8&t=981s
using useReducer 
*/
const reducer = (state, action) => {
    console.log('state', state)
    console.log('action', action)
    switch (action.type) {
        case 'ADD_ITEM':
            {
                const newItem = `Item ${state.length + 1}`
                return [...state, newItem];
            }
        case 'REMOVE_ITEM':
            return  state.filter((_, i) => i != action.index)
            
        case 'CLEAR_ITEM':
            return []


    }
}

export const Cart2 = () => {
    const [cart,dispatch]=useReducer(reducer,[])
    return (
        <>
            <h2>Cart using useState </h2>
            <ul>
                {
                    cart.map((item, index) => (
                        <li>
                            {item}
                            <button onClick={() => dispatch({ 'type': 'REMOVE_ITEM', index: index })}>Remove Item</button>
                            {/* <button onClick={removeItem(index)}>Remove Item1</button> */}
                        </li>
                    ))
                }
            </ul>
            <button onClick={() => dispatch({ 'type': 'ADD_ITEM' })}>Add Item</button>
            <button onClick={() => dispatch({ 'type': 'CLEAR_ITEM' })}>Clear Cart</button>
            <p>Total Items :{cart.length}</p>
        </>
    )

}


/*
 below second not work

   <button onClick={()=>removeItem(index)}>Remove Item</button>
    <button onClick={removeItem(index)}>Remove Item1</button>

    I see exactly what's happening here. It’s a classic React "gotcha" that almost everyone hits at least once.The reason your second button isn't working—or rather, why it's probably causing an infinite loop or firing immediately on page load—is because of how functions are executed in JavaScript.
    
    The Breakdown Code             What it does                                                                                    Result
    () => removeItem(index)         This is a callback function. It tells React: "Wait until the user clicks, then run this.   "Works perfectly
     
    .removeItem(index)             This invokes the function immediately. 
                                   It tells React: "Run this code right now while the component is rendering."    Fails. It runs before the click even happens.


Why "Remove Item1" fails
When you write onClick={removeItem(index)}, you aren't passing the function to the button; you are passing the result of the function.

React starts rendering the component.

It sees removeItem(index) and executes it instantly to see what it returns.

If removeItem updates your state (which it usually does), it triggers a re-render.

The re-render hits that line again, executes the function again, and triggers another re-render.

Boom: You get an "Infinite Loop" error or a "Too many re-renders" warning.

The Correct Way
If you need to pass an argument (like index) to a function in an onClick, you must wrap it in an anonymous arrow function so it stays "primed" but not "fired."

JavaScript
// Do this:
<button onClick={() => removeItem(index)}>Remove Item</button>

// Never this (unless removeItem returns another function):

<button onClick={removeItem(index)}>Remove Item1</button>
Pro Tip: If your function didn't need any arguments (e.g., removeItem()), you could just pass the reference like this: onClick={removeItem}. But since you need that index, the arrow function is your best friend.

Would you like me to take a look at your removeItem logic to make sure the state is being updated immutably?

*/