import React from "react";
import { useItems } from "./ItemProvider";

export const ItemInput = () => {
  const [text, setText] = React.useState('');
  const { dispatch } = useItems();

  const handleAdd = () => {
    if (text.trim()) {
      dispatch({ type: 'ADD_ITEM', payload: text });
      setText('');
    }
  };

  return (
    <div>
      <input value={text} onChange={(e) => setText(e.target.value)} placeholder="add item"/>
      <button onClick={handleAdd} className="btn btn-info" style={{'marginLeft':'10pt'}}>Add Item</button>
    </div>
  );
};