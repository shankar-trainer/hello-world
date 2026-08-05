with combineReducer 
 
 
	create mainReducer.js 

		import { combineReducers } from "redux";
		import CountReducer from "./CountReducer";

		const mainReducer=combineReducers({

			c:CountReducer,

		})
		export default  mainReducer;

		combineReducer-- method combines multiple reducer in one 
		

		in index.js 
		  add 
			const store=createStore(mainReducer) 

		in counterApp.js add 
			const counter = useSelector(state => state.c)
			
	
without combineReducer

   no need to make 	mainReducer.js 
   
   in index.js   add 
	      const store=createStore(CountReducer) 
	
	in counterApp.js   add 
	      const counter = useSelector(state => state)
