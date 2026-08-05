import { useItems } from "./ItemProvider";

export const ItemList = () => {
  const { state, dispatch } = useItems();

  return (
    <ul>
      {state.items.map(item => (
        <li key={item.id}>
          {item.text} 
          <button onClick={() => dispatch({ type: 'REMOVE_ITEM', payload: item.id })} className="btn btn-info" style={{'marginLeft':'10pt','marginTop':"5pt"}}>
           Remove Item ❌
          </button>
        </li>
      ))}
    </ul>
  );
};