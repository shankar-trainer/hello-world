import React from "react";

export default function CheckBoxApp() {
    const [state, setState] = React.useState({
      gender: false,
      love: false
    });
  
    const handleToggle = ({ target }) =>
      setState(s => ({ ...s, [target.name]: !s[target.name] }));
  
    return (
      <div>
        {Object.keys(state).map(key => (
          <input
            type="checkbox"
            onChange={handleToggle}
            key={key}
            name={key}
            checked={state[key]}
          />
        ))}
      </div>
    );
  }
  