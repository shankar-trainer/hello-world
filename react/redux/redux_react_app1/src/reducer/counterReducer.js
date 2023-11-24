const counter = (state = 0, action) => {
      if (action.type === 'INCREMENT') {
            console.log('increment called ' + state)
            return state + 1;
      }
      else if (action.type === 'DECREMENT') {
            console.log('decrement called ' + state)
            return state - 1;
      }
      return state;
}
export default counter; 