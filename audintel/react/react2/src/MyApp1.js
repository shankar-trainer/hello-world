import React from 'react';
import './App.css';
function MyApp1() {
    const greeting = "greeting";
    return (
        <div className="container">
            <ul>
                <li>
                    <button
                        onClick={event => alert(event.target.id)}>my button1</button>
                </li>
                <li>
                    <button onClick={event => alert(event.target.id)}>mybutton2</button>
                </li>
            </ul>
        </div>
    )
}
export default MyApp1;