https://dev.to/thesanjeevsharma/just-redux-the-complete-guide-44d5#:~:text=const%20reducer%20=%20(state%2C%20action,get%20called%20anytime%20state%20changes.

Just Redux: The Complete Guide

If you're a Front-end developer or aspiring to become one, I am sure you might have come across Redux by now.

Maybe you probably know what Redux is, maybe you don't. Maybe you have been using it for quite a while but you don't fully understand it. You start a new project and then just copy a bunch of stuff from somewhere and just get it set up. TBH, I've done this before. I had slight idea of everything and what should be in place for Redux to work. That has worked for me until now, but sometimes I'd run into issues that would require a little more knowledge.

🙇‍♂️ Therefore, I decided to study the Redux API. I watched a bunch of videos online and read the docs. Along with that I wrote this article.

🤯 To my surprise, I found that 80-90% of the things we do in Redux is just plain JS. It's just objects and functions. If it feels complicated, you might wanna go back to JS basics. But if you're confident on the JS part, Redux won't be tough.

⚠️ Before starting I would like to mention that this article covers Redux only. It does not talk about React or any other framework or their interactions with Redux.

👨‍💻 To make the most out of this article, you can code along. I have added snippets for everything we're going to discuss.

🤨 What is Redux?
Well, if you clicked on this article, I am pretty sure you already know the answer. But just for the sake of answering the question, let's do it.

Redux is a state management library. It stores the state of your app and provides methods to interact with that state. It can be used with any framework like React, Angular, Vue etc.

Installation

npm install redux
For this article we'd only need to install redux, nothing else.

Redux API surface comes with only 5 methods.

Screenshot 2021-09-22 at 4.55.33 PM

We'll study each one of these in detail.

👉 compose
This method doesn't even have anything to do with Redux. The purpose of this method is to bundle multiple functions into one.

Let's say we have 3 mathematical functions: half, square and double.

If we want to apply all three operations in order we'd need to do something like this:

const double = (num) => num * 2;
const square = (num) => num * num;
const half = (num) => num / 2;

const halfSquareDouble = (num) => half(square(double(num)));

console.log(halfSquareDouble(2)); // 8
But we can achieve the same thing in a much cleaner way using compose:

import { compose } from "redux";

const double = (num) => num * 2;
const square = (num) => num * num;
const half = (num) => num / 2;

const halfSquareDouble = compose(half, square, double);

console.log(halfSquareDouble(2)); // 8
compose will combine all our functions into a single function.

🧪 Note: compose will start picking up functions from the right end. That means if the order was compose(half, double, square) then the result for the same call would have been 4.

👉 createStore
This methods creates the Redux store. It takes one mandatory argument reducer, and two optional arguments - preloadedState(also know as initialState) and enhancer.

So, what is a Reducer? In simple terms, Reducer is just a pure function which takes two arguments - state and action and returns one value which is the new state.

Screenshot 2021-09-23 at 6.34.49 PM

Understand it like this, there is a perfect world/simulation which is in some state X. Something happens; some action is taken. We don't care where the action took place or who was responsible for it. All we know that something happened and that might change the state of our world. It is the reducers' job to figure out the new state Y.

const reducer = (state, action) => {
  return state
}
This is the simplest reducer you can create.

When we call createStore method, it returns an object.

import { createStore } from 'redux'

const reducer = (state, action) => {
  return state
}

const initialState = { value: 0 }

const store = createStore(reducer, initialState)
That object has 4 methods:

1️⃣ getState: This method is used to get the state of your app.

console.log(store.getState()) // { value: 0 } 
2️⃣ subscribe: This method is used for subscribing to the changes on our store. Pass a function to this method and it will get called anytime state changes.

store.subscribe(() => console.log("State changed!"))
3️⃣ dispatch: This method is used for dispatching actions. Actions go inside reducers with the current state of your app and might update the state.

🏌️‍♂️ We've introduced one more term here - action, so let's talk about it.

If you remember reducer takes action to update the state. It's the action that tells the reducer that something just happened. It can be user clicking on a button, user logging in, user adding a product, etc. Anything that is meant to change the state of our app is an action.

Of course we've full control over them. We're the ones defining them. How do create them? Well, there's a specific style you should follow.

const incrementAction = {
  type: 'INCREMENT'
}
Actions are basically objects, that have a type key. That's it. It can have additional keys too, but type is mandatory.

Let's refactor our reducer now to make use of this action.

const reducer = (state = initialState, action) => {
  if (action.type === 'INCREMENT') {
    return { value: state.value + 1 }
  }

  return state
} 
On line 1, we've added intialState as a default argument. By doing this we can remove it from the createStore() call. This is actually a best practice.

On line 2, we're checking if the action that we received is of type INCREMENT.

On line 3, we're preparing our new state. This is important. Never modify your state directly. Always return a newly created object. If you don't do so, the reference to the state object won't change, and your app wouldn't get notified of the changes.

state.value++ // 🙅‍♂️ DON'T DO THIS
return { value: state.value + 1 } // 👍 WORKS FINE
On line 4, we finally return our old state, in case we didn't find a matching action. This is important too. Your reducer should always return a state.

Now, that our reducer is updated, let's dispatch an action.

import { createStore } from "redux";

const initialState = { value: 0 };

const incrementAction = {
  type: "INCREMENT"
};

const reducer = (state = initialState, action) => {
  if (action.type === "INCREMENT") {
    return { value: state.value + 1 };
  }

  return state;
};

const store = createStore(reducer);

console.log(store.getState()); // { value: 0 }

store.dispatch(incrementAction);

console.log(store.getState()); // { value: 1 }
What if we want to increment by 5? I cannot do that right now. But if we see carefully, all we have written up until now is basic JavaScript. Stuff that you probably know. We can extend our code a bit and achieve our goal.

Remember action can have additional keys? We'll create one more action.

import { createStore } from "redux";

const initialState = { value: 0 };

const incrementAction = {
  type: "INCREMENT"
};

const addAction = {
  type: "ADD",
  payload: 5,
}

const reducer = (state = initialState, action) => {
  if (action.type === "INCREMENT") {
    return { value: state.value + 1 };
  }

  if (action.type === "ADD") {
    return { value: state.value + action.payload }
  }

  return state;
};

const store = createStore(reducer);

store.dispatch(addAction)

console.log(store.getState()) // { value: 5 }
Okay! So far so good. But 5 is not enough, let's create one for 10 too, and then one for 100 too? Feels stupid! We cannot cover every number out there.

Okay! What if we do something like this?

store.dispatch({ type: "ADD", payload: 5 })
store.dispatch({ type: "ADD", payload: 10 })
store.dispatch({ type: "ADD", payload: 100 })
Yes! this gets the job done but this is not scalable. If later we decide to call it INCREASE_BY instead of ADD, then we'll have to update it everywhere. Also, there's a chance that we might make a type and end up writing INCRAESE_BY. Good luck finding that typo! 😬

There's an elegant way to solve this using Action Creators.

🤖 Action Creators are just functions that create actions for you.

const add = (number) => {
  return {
    type: "ADD",
    payload: number
  }
}

store.dispatch(add(5))
store.dispatch(add(10))
store.dispatch(add(100))
We created a function add that returns action object. We can call it anywhere and it will create an action object for us.

This solution is much cleaner and it is widely used.

Our updated code now looks like this:

import { createStore } from "redux";

const initialState = { value: 0 };

// constants
const INCREMENT = "INCREMENT";
const ADD = "ADD";

// action creators
const increment = () => ({ type: INCREMENT });
const add = (number) => ({ type: ADD, payload: number });

const reducer = (state = initialState, action) => {
  if (action.type === INCREMENT) {
    return { value: state.value + 1 };
  }
  if (action.type === ADD) {
    return { value: state.value + action.payload };
  }
  return state;
};

const store = createStore(reducer);

console.log(store.getState()); // { value: 0 }

store.dispatch(increment());
store.dispatch(add(2));

console.log(store.getState()); // { value: 3 }
Notice that, we've stored "INCREMENT" and "ADD" as constants. That's because we were repeating them in our reducers, and there was a chance for typo. It's a good practice to store action types as constants in one place.

🎉 If you've made it this far, congratulations. With all the knowledge you have right now, you can start creating apps with Redux. Of course there's more left, but you've covered a significant part of the API. Well done!

4️⃣ replaceReducer: This method is used for replacing the current root reducer function with a new one. Calling this method will change the internal reducer function reference. This comes into play, when you're splitting your code for performance.

const newRootReducer = combineReducers({
  existingSlice: existingSliceReducer,  
  newSlice: newSliceReducer
});

store.replaceReducer(newRootReducer);
👉 bindActionCreators
Now that we have some idea about action creators and dispatch, we can talk about this method.

dispatch(increment())
dispatch(add(5))
This is how we've dispatched actions until now. But there's a simpler way to do this.

const actions = bindActionCreators({ add, increment }, store.dispatch)

actions.increment()
actions.add(4)
bindActionCreators takes two arguments:

An object with all the action creators inside it.
The method we want to bind our action creators to.
It returns an object, which looks identical to the first argument we passed in. The only difference is, now we can call those methods directly, without calling dispatch explicitly.

What's the benefit of doing this?

The only use case for bindActionCreators is when you want to pass some action creators down to a component that isn't aware of Redux, and you don't want to pass dispatch or the Redux store to it. - Redux Docs

Also, note that what we did is just plain JS, we could've achieved the same result by writing our own function that binds action creators to dispatch; without calling bindActionCreators.

👉 combineReducers
When you're developing a huge app where you can segregate data, it makes sense to have multiple reducers to reduce complexity. This method will combine all those multiple small reducers and return one reducer, generally called as root reducer, that our createStore method can use.

First, let's see why do we wanna have multiple reducers. Consider the following code.

import { createStore } from "redux";

// constants
const CHANGE_USER_EMAIL = "CHANGE_USER_EMAIL";
const ADD_PRODUCT = "ADD_PRODUCT";

// action creators
const changeUserEmail = (email) => ({
  type: CHANGE_USER_EMAIL,
  payload: { email }
});
const addProduct = (product) => ({
  type: ADD_PRODUCT,
  payload: { product }
});

const initialState = {
  user: {
    name: "Mark",
    email: "mark@facebook.com"
  },
  cart: {
    products: []
  }
};

const reducer = (state = initialState, action) => {
  if (action.type === CHANGE_USER_EMAIL) {
    return {
      ...state,
      user: {
        ...state.user,
        email: action.payload.email
      }
    };
  }
  if (action.type === ADD_PRODUCT) {
    return {
      ...state,
      cart: {
        ...state.cart,
        products: [...state.cart.products, action.payload.product]
      } 
    };
  }
  return state;
};

const store = createStore(reducer);

console.log(store.getState()); 
// { user: { name: 'Mark', email: 'mark@facebook.com' }, cart: { products: [] } }

store.dispatch(changeUserEmail("mark@instagram.com"));

console.log(store.getState()); 
// { user: { name: 'Mark', email: 'mark@instagram.com' }, cart: { products: [] } }
As we can see this reducer is already looking a bit complex. As our app grows, data will be nested to deeper levels and size of the reducer will grow as well.

If we think about it, user and cart are two entirely different data points. We can split them into two different reducers. Let's do it.

const initialState = {
  user: {
    name: "Mark",
    email: "mark@facebook.com"
  },
  cart: {
    products: []
  }
};

const userReducer = (user = initialState.user, action) => {
  if (action.type === CHANGE_USER_EMAIL) {
    return {
      ...user,
      email: action.payload.email
    };
  }
  return user;
}

const cartReducer = (cart = initialState.cart, action) => {
  if (action.type === ADD_PRODUCT) {
    return {
      ...cart,
      products: [...cart.products, action.payload.product]
    };
  }
  return cart;
}
Now we have two simple reducers and even the code looks clean. But createStore only takes a single reducer, which one should we pass?

Both. Using combineReducers.

const rootReducer = combineReducers({
  user: userReducer,
  cart: cartReducer
});

const store = createStore(rootReducer);
This method takes an object, where keys can be anything but values should be our reducers. It will return a single reducer that can be passed to createStore.

Our complete code looks like this now.

import { combineReducers, createStore } from "redux";

// constants
const CHANGE_USER_EMAIL = "CHANGE_USER_EMAIL";
const ADD_PRODUCT = "ADD_PRODUCT";

// action creators
const changeUserEmail = (email) => ({
  type: CHANGE_USER_EMAIL,
  payload: { email }
});
const addProduct = (product) => ({
  type: ADD_PRODUCT,
  payload: { product }
});

const initialState = {
  user: {
    name: "Mark",
    email: "mark@facebook.com"
  },
  cart: {
    products: []
  }
};

const userReducer = (user = initialState.user, action) => {
  if (action.type === CHANGE_USER_EMAIL) {
    return {
      ...user,
      email: action.payload.email
    };
  }
  return user;
};

const cartReducer = (cart = initialState.cart, action) => {
  if (action.type === ADD_PRODUCT) {
    return {
      ...cart,
      products: [...cart.products, action.payload.product]
    };
  }
  return cart;
};

const rootReducer = combineReducers({
  user: userReducer,
  cart: cartReducer
});

const store = createStore(rootReducer);

console.log(store.getState()); 
// { user: { name: 'Mark', email: 'mark@facebook.com' }, cart: { products: [] } }

store.dispatch(changeUserEmail("mark@instagram.com"));

console.log(store.getState()); 
// { user: { name: 'Mark', email: 'mark@instagram.com' }, cart: { products: [] } }
🌸 Store Enhancers
If you remember, createStore takes an optional argument - enhancers.
Enhancers are nothing but higher order functions. They add some extra functionality to our store. For example, Redux dev tools is an enhancer.

We won't talk much about enhancers here, because we will rarely create any new enhancers. Let's discuss this in detail in a separate article.

⛓ Middlewares
Middlewares provide us with the ability to intercept actions and do something we want to before that action reaches the reducers. We can log actions, log store state, log crash reports, etc.

Let's create a middleware for logging actions when they get dispatched.

const logger = (store) => (next) => (action) => {
  console.log("DISPATCHED ACTION: ", action);
  next(action);
}
This is one of the simplest middlewares you can create. It logs the actions and then forwards the call to the rest of the middlewares and reducers that are in the pipeline.

But how do we use our new created middleware?

👉 applyMiddleware
This method will take a bunch of middlewares and return an enhancer. And enhancers go into the createStore function call.

import { applyMiddleware, createStore } from 'redux'

const logger = (store) => (next) => (action) => {
  console.log("DISPATCHED ACTION: ", action);
  next(action);
}

const store = createStore(rootReducer, applyMiddleware(logger));
Now, every time we dispatch an action we'll have a log in our console.

🎉 With this we've covered out final method from Redux. That's all there is in the Redux API.

✨ It wouldn't be fair to not let you guys know that the modern Redux is different from what's discussed in this article. The basic concepts still apply but you'll have to write lesser code. Thanks to the Redux team. 🙏 Want to learn about it? Click here.

💡 I understand you won't get 100% of the things right now but it's good to be aware of all the tools you have under your belt.

💾 This article can act as guide for you when you want to revise something just before an interview or when you're implementing something. Save it!

🤝 If you'd like to read more of my upcoming articles, you can connect with me on LinkedIn or Twitter.

🙏 Thank you for reading!

Top comments (25)
 
markerikson profile image
Mark Erikson
•
24 Sept 21

Hi, I'm a Redux maintainer. The good news is this post does a good job of covering some of the basics of Redux. However, "modern Redux" is very different from what's shown in this tutorial. Today we teach using our official Redux Toolkit package to write your Redux logic. It includes utilities to simplify several common Redux use cases, including store setup, defining reducers, immutable update logic, and even creating entire "slices" of state at once. Unfortunately, most tutorials online are out of date and show practices that result in a lot of extra code being written.

For details on using Redux Toolkit (and the React-Redux hooks API), see our official Redux docs pages:

redux.js.org/tutorials/essentials/...
redux.js.org/tutorials/fundamental...
redux-toolkit.js.org

80
 likes
Like

Reply
 
 
thesanjeevsharma profile image
Sanjeev Sharma Subscriber 
•
24 Sept 21

Hey Mark!
Yes, I am aware of it. I will write a detailed explanation on Redux toolkit as well. Infact. that's what I use for my side projects now a days. :)

The intention of this post was to help people know that a lot of stuff is not that hard. And some jobs like mine still use the old way, so it will help.

This article is more for me than others, actually. By writing I can remember concepts, which might be helpful in some other areas. Also, reading and exploring satisfies my hunger to learn more.

Apart from this, I deep dived into Redux after interacting with you on Reddit. We had a short chat about ContextAPI vs Redux. :)


7
 likes
Like

Reply
 
 
markerikson profile image
Mark Erikson
•
24 Sept 21

Gotcha :) This is a well-written article, btw - just want to make sure others are aware that RTK exists since the article didn't mention it


9
 likes
Like
Thread
 
thesanjeevsharma profile image
Sanjeev Sharma Subscriber 
•
24 Sept 21

Fair point! Added a link to the Redux toolkit in the end.


4
 likes
Like

Reply
 
 
spiropoulos94 profile image
NikosSp
•
24 Sept 21

I have to admit redux toolkit is amazing, as it adresses redux's biggest problem : BOILERPLATE

But, in my opinion, it would be very useful for someone to work on redux before toolkit, in order to better understand the underlying technology.

This way she/he will appreciate redux toolkit's offerings even more!


3
 likes
Like

Reply
 
 
mliakos profile image
Emmanouil Liakos
•
28 Oct 21 • Edited on 28 Oct

Totally agree on this! When I first started to learn Redux, I decided to begin a series on this having exactly that in mind: Looking under the hood before using any abstractions.

For anyone interested it's here: Real-time app using React, Redux, Tailwind CSS & Firebase - Part 1


1
 like
Like

Reply
 
 
thesanjeevsharma profile image
Sanjeev Sharma Subscriber 
•
24 Sept 21 • Edited on 24 Sept

Yes! Totally in favour of this.

RTK would be appreciated more if people know about old way doing things in Redux.


2
 likes
Like
Thread
 
markerikson profile image
Mark Erikson
•
25 Sept 21

FWIW, that's why we have two different tutorials in our docs:

"Essentials": jumps straight into RTK as the default Redux syntax, for people who just want to know "how to use Redux the right way" without worrying about how it works inside
"Fundamentals": teaches how Redux works from the ground up, so that you understand all the principles and mechanics first

4
 likes
Like

Reply
 
 
raibtoffoletto profile image
Raí B. Toffoletto
•
24 Sept 21

I want to take the opportunity to thank you guys for the toolkit!! I love using it with react. Cheers to you all!!


2
 likes
Like

Reply
 
 
krtirtho profile image
Kingkor Roy Tirtho
•
26 Sept 21

Here's the zustand version of the counter

import create from "zustand";

const counterStore = (set, get)=>{
  return {
     value: 0,
    increment(){
      set(({value})=>({value: value+1}))
    }
    decrement(){
      set(({value})=>({value: value-1}))
    }
  }
}

export const useCounterStore = create(counterStore);



// inside a component access the state as follows
const CounterComponent = ()=>{
  const value = useCounterStore(s=>s.value)
  const increment = useCounterStore(s=>s.increment)
  const decrement = useCounterStore(s=>s.decrement)

  return (/*...React JSX*/)
}
Why go hard on yourself when life can be so easy!


2
 likes
Like

Reply
 
 
phryneas profile image
Lenz Weber
•
16 Oct 21

About the same amount of code as modern Redux. This article just shows the internals, not how it is really used nowadays. For modern Redux, I'd recommend
redux.js.org/tutorials/essentials/...


1
 like
Like

Reply
 
 
raibtoffoletto profile image
Raí B. Toffoletto
•
24 Sept 21

Nice and complete cover of pure redux!! 🎉 Congrats.
I think it's essential to understand this way of using redux before going to use the toolkit, it lets you understand better what the toolkit will do (and lets you create a deep appreciation for how it makes things simple 😁😁).

Btw, i just didn't understand your statement of ""I found that 80-90% of the things we do in Redux is just plain JS.""... it is 100% pure JS in this form. You can implement it anywhere.😉


3
 likes
Like

Reply
 
 
thesanjeevsharma profile image
Sanjeev Sharma Subscriber 
•
24 Sept 21

Agreed! 🙌 and I'm glad you liked it.

Haha! yeah. It's all JS anyway. 😁


1
 like
Like

Reply
 
 
yukoliesh profile image
yukoliesh
•
26 Sept 21

Thanks for this article. It makes easier to understand what the redux is about. I tried Redux 3 or 4 years ago and it was a horrible experience. I was super new to React/Redux and JavaScript and I had to deal with A LOT of boilerplates. I was pretty much traumatized by it. But after gaining more experiences with React and JS and with the latest Redux, I think I can try again. It makes more sense now.


2
 likes
Like

Reply
 
 
thesanjeevsharma profile image
Sanjeev Sharma Subscriber 
•
26 Sept 21

Wow! Feels good to hear that.

I'm glad I could help. 😇


1
 like
Like

Reply
 
 
fcolombo profile image
Freddy Colombo
•
27 Sept 21

Hola Sanjeev!
Están bastante didácticas las explicaciones de esta guía.
Se entiende y se sigue sin dificultad.
He leído muchos Tutoriales de Redux y este es el más entendible.
Muchas gracias.
Saludos.
PD: Quedo atento a tu POST sobre React Toolkit.


