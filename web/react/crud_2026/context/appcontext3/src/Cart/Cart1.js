import { useState } from "react"
/*
coders gyan react
https://github.com/codersgyan/react-shopping-cart
https://www.youtube.com/watch?v=iyresihBdO8&t=981s

*/


export const Cart1 = () => {
    // const [cart, setCart] = useState(["laptop","phone","car"])
    const [cart, setCart] = useState([])
    const addItem = () => {
        const newItem = `Item ${cart.length + 1}`
        setCart((cart) => [...cart, newItem]);
    }
    const removeItem = (index) => {
        setCart((cart) => cart.filter((_, i) => i != index))
    }
    
    const clearCart = () => {
        setCart([])
    }

    return (
        <>
            <h2>Cart using useState </h2>
            <ul>
                {
                    cart.map((item, index) => (
                        <li>
                            {item}
                            <button onClick={()=>removeItem(index)}>Remove Item</button>
                            {/* <button onClick={removeItem(index)}>Remove Item1</button> */}
                        </li>
                    ))
                }
            </ul>
            <button onClick={addItem}>Add Item</button>
            <button onClick={clearCart}>Clear Cart</button>
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

-------------------------------------------
        setCart((cart) => cart.filter((_, i) => i != index))

what it does

This line of code is a common pattern in React used to remove a specific item from a list (state) based on its position (index).

To break it down, here is exactly what each part of that logic is doing:

The Breakdown
setCart((cart) => ...): This uses a "functional update." Instead of just passing a new value, it takes the current state (called cart here) as an argument. This ensures you are working with the most up-to-date version of the list.

.filter(): This is a standard JavaScript array method that creates a new array. It keeps every item that passes a specific "test" and tosses out the ones that don't.

(_, i):

The underscore _ is a convention used when you don't actually need the value of the item (like the name or price of the product).

The i represents the index (the numerical position) of the current item being checked.

i != index: This is the "test." It tells React: "Keep this item if its position (i) is not equal to the one I want to delete (index)."

In Plain English
Imagine you have a shopping list:

Apples

Milk

Bread

If you call this function with index = 1 (Milk), the filter looks at the list and says:

"Is 0 equal to 1? No. Keep Apples."

"Is 1 equal to 1? Yes. Remove Milk."

"Is 2 equal to 1? No. Keep Bread."

The result is a brand-new list: ['Apples', 'Bread'].

Why do it this way?
In React, you should never "mutate" (change) the state directly (e.g., you can't just use cart.splice()). 
You must always provide a new copy of the array. The .filter() method is perfect for this because it doesn't change the original array; 
it returns a fresh one with the item missing.


*/

