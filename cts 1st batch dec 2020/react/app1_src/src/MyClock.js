import React, {Component} from 'react';


class MyClock extends Component{
    constructor(props){
        super(props);
        this.lauchMyClock();
        this.state={
            date1:new Date().toLocaleDateString()
        };
    }

    lauchMyClock(){
      setInterval(function(){
                this.setState({date1:new Date().toLocaleString()})
      }.bind(this),1000);
      
    }

    render(){
        return(
            React.createElement('div',null,this.state.date1)
         );
    }
}

export default MyClock;
