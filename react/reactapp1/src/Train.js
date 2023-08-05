import React from "react";

function Train(){
    const element= React.createElement('h2',{style:{'color':'yellow'}},'welcome program');
    return(
        <div>
          {element}
          <h2>Welcome to train</h2>         
          </div>
        )
}
export default Train;