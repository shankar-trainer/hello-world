import React, { useState } from "react";
function ReactonSubmit() {
    const [value, setValue] = useState("");
    const [result, setResult] = useState("");
    function handleSubmit(e) {
        e.preventDefault();
        setResult(
            "Form has been submitted with with Input: " +
                value
        );
    }

    function handleChange(e) {
        setValue(e.target.value);
        setResult("");
    }
    return (
        <div
            style={{ textAlign: "center", margin: "auto" }}
        >
            <h1 style={{ color: "Green" }}>
                Hello world
            </h1>
            <h3>
                Exemple for React onSubmit Event Handler
            </h3>
            <form onSubmit={handleSubmit}>
                <label>Add input here: </label>
                <input
                    value={value}
                    onInput={handleChange}
                    required
                />
                <br />
                <br />
                <button type="submit">Submit</button>
            </form>
            <br />
            <div>
                <h4>{result}</h4>
            </div>
        </div>
    );
}

export default ReactonSubmit;