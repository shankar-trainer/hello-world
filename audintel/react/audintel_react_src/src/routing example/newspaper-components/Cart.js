function Cart(props){
    const item=getItemList();

      function getItemList(){
         return props.itemList.map(a=>
              <tr>
                <td>{a.id}</td>
                <td>{a.prdname}</td>
                <td>{a.cost}</td>
                <td>{a.mfd}</td>
              </tr>           
         )
      }
    return(
        <div>
            <table className="table table-striped  table-bordered bg-light text-dark m-5 p-5" style={{'text-align':'left','width':'80%'}}>
                <tr>
                    <th>Id</th>
                    <th>Product Name</th>
                    <th>Cost</th>
                    <th>Manufacturing Date</th>
                </tr>
                {item}
            </table>
        </div>

    )


}
export default Cart;