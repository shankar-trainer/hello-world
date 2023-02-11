import React, { Component } from "react";
import PropTypes from 'prop-types';

export default class ValidateProps extends Component {
    constructor(props) {
        super(props);
    }
    render() {
        return (
            <div>
                <h1>Validating Props </h1>
                <h3>Array:{this.props.propArray}</h3>
                <h3>Bool:{this.props.propBool}</h3>
                <h3>Func:{this.props.propFunc(3)}</h3>
                <h3>String:{this.props.propString}</h3>
                <h3>Object:{this.props.propObject.ObjectName1}</h3>
                <h3>Object:{this.props.propObject.ObjectName2}</h3>
                <h3>Object:{this.props.propObject.ObjectName3}</h3>
            </div>
        );
    }
}
ValidateProps.propTypes = {
    propArray: PropTypes.array.isRequired,
    propBool: PropTypes.bool.isRequired,
    propFunc: PropTypes.func,
    propNumber: PropTypes.number,
    propString: PropTypes.string,
    propObject: PropTypes.object
}

ValidateProps.defaultProps={
  propArray:[1,2,3,4,5,6],
  propBool:true,
  propFunc:function(e){return e},
  propNumber:1,
  propString:'String Value',
  propObject:{
  ObjectName1:"Object Value1",
  ObjectName2:"Object Value2",
  ObjectName3:"Object Value3",

  }
}


