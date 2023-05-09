import React, { useState } from "react";
import ReactDOM from "react-dom";

import FadeInOut from "./FadeInOut";

export default function AnimationExample3() {
  const [show, setShow] = useState(false);
  const toggleShow = () => setShow(!show);
  const extraStyles = {
    // position: "fixed",
    // top: "30px",
    // left: 0,
    // right: 0,
    // bottom: 0,
    // background: "rgba(0, 0, 0, 0.4)",
    // color: "#FFF"
  };
  return (
    <div className="App">
      <button onClick={toggleShow}>{show ? "hide" : "show"}</button>
      <FadeInOut show={show} duration={500} style={extraStyles}>
        I'm in a fade in AND out transition and I am only mounted when visible
        and automatically unmounted when my fade out ends!
      </FadeInOut>
    </div>
  );
}

