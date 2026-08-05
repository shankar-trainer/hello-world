import React, { useReducer } from "react";

const initialState = {
  name: "",
  email: "",
  password: "",
  agreeToTerms: false,
  error: null,
  status:false
};

const reducer = (state, action) => {
  switch (action.type) {
    case "field":
      return {
        ...state,
        [action.field]: action.value,
      };
    case "submit":
      if (!state.name || !state.email || !state.password || !state.agreeToTerms) {
        return { ...state, error: "All fields must be filled out" };
      }
      return { ...state, error: null };
    case "reset":
      return initialState;
    default:
      throw new Error();
  }
};

const SignupForm = () => {
  const [state, dispatch] = useReducer(reducer, initialState);

  const handleSubmit = (e) => {
    e.preventDefault();
    dispatch({ type: "submit" });
    if (!state.error) {
      alert("Form submitted!");
      dispatch({ type: "reset" });
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        placeholder="Name"
        value={state.name}
        onChange={(e) => dispatch({ type: "field", field: "name", value: e.target.value })}
      />
      <input
        type="email"
        placeholder="Email"
        value={state.email}
        onChange={(e) => dispatch({ type: "field", field: "email", value: e.target.value })}
      />
      <input
        type="password"
        placeholder="Password"
        value={state.password}
        onChange={(e) => dispatch({ type: "field", field: "password", value: e.target.value })}
      />
      <label>
        <input
          type="checkbox"
          checked={state.agreeToTerms}
          onChange={(e) => dispatch({ type: "field", field: "agreeToTerms", value: e.target.checked })}
        />
        Agree to terms
      </label>
      {state.error && <p style={{ color: "red" }}>{state.error}</p>}
      <button type="submit">Sign Up</button>
      <button type="button" onClick={() => dispatch({ type: "reset" })}>Reset</button>
    </form>
  );
};

export default SignupForm;
