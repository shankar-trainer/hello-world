import React, { Component } from 'react';
import PropTypes from 'prop-types';

class Validation extends Component{

    render()
    {
        return(
          <div>
          <h1>Props Validation </h1>
             <span>
                 propNumber
                 {this.props.propNumber?"true":"false"}
             </span>
             <br></br>
             <span>
                 propString-->{this.props.propString}-->
                 {this.props.propString?"true":"false"}
             </span>
          
          </div>

        )
    }

}

Validation.propTypes={
 propString:PropTypes.string,
 propNumber:PropTypes.number,
}

Validation.defaultProps={
    propString:"hello react",
    propNumber:676,
}


export default Validation
