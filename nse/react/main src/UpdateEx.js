import React from 'react';


class UpdateEx extends React.Component {
   
    forceUpdateState=()=> {
         this.forceUpdate();
    }
    render() {

        return (
            <div>
                <h2>Update Example</h2>
                 Random Number   {Math.random()}
                <button onClick={this.forceUpdateState}>Update </button>

            </div>
        )
    }
}

export default UpdateEx

