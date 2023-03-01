import ReactCSSTransitionGroup, { TransitionGroup } from 'react-transition-group'; // ES6
import { CSSTransition } from 'react-transition-group';
//var ReactCSSTransitionGroup = require('react-addons-css-transition-group');
import { CSSTransitionGroup } from 'react-transition-group'
import './animation.css';


import React from "react";

export default class AnimationExample1 extends React.Component {
 
  constructor(props) {
    super(props);
    this.state = { items: ['hello', 'world', 'click', 'me'] };
   // this.handleAdd = this.handleAdd.bind(this);
  }

  handleAdd=()=> {
    const newItems = this.state.items.concat([
      prompt('Enter some text')
    ]);
    this.setState({ items: newItems });
  }

  handleRemove=(i)=> {
    let newItems = this.state.items.slice();
    newItems.splice(i, 1);
    this.setState({ items: newItems });
  }

  render() {
    const items = this.state.items.map((item, i) => (
      <div key={i} onClick={() => this.handleRemove(i)}>
        {item}
      </div>
    ));

    return (
      <div className='style1'>
        <h1>Fading at Initial Mount</h1>
        <button onClick={this.handleAdd}>Add Item</button>
        <button onClick={this.handleRemove(0)}>Remove Item</button>
        <TransitionGroup
          transitionName="example"
          transitionAppear={true}
          transitionAppearTimeout={500}
          transitionEnter={false}
          transitionLeave={false}>
          {items}
        </TransitionGroup>
      </div>
    );
  }
}
