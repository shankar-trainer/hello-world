import React, { Component } from 'react';
import {connect} from 'react-redux';

class App extends Component {
  render() {
        let {number, increase, decrease} = this.props
        return(
                <div>
              <div>{number}</div>
              <button onClick={e=>increase()}>+</button>
              <button onClick={e=>decrease()}> - </button>
            </div>
            );
     }
}

let mapStateToProps = state => ({
  number: state
})

let mapDispatchToProps = dispatch => ({
  increase: () => dispatch({type: 'INCREASE'}),
  decrease: () => dispatch({type: 'DECREASE'})
});

export default connect(mapStateToProps, mapDispatchToProps)(App);

//export default App;
