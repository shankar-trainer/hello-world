// src/js/components/App.js
import React from "react";
import List from "./List";
import Form from "./Form";
const App = () => (
  <div className="border primary bg-info w-50 p-5 m-5">
    <h2>Example5</h2>

    <div className="col-md-4 offset-md-1">
      <h2>Articles</h2>
      <List />
    </div>
    <div className="col-md-4 offset-md-1">
      <h2>Add a new article</h2>
      <Form />
    </div>
  </div>
);
export default App;