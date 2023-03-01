import Cart from "./Cart";

  function Shopping(props){
     const items=[
                            {id:10001,'prdname':'shirt','cost':1200,'mfd':'12-12-2021'},
                            {id:10002,'prdname':'pant','cost':2000,'mfd':'12-11-2021'},
                            {id:10003,'prdname':'mobile','cost':12000,'mfd':'30-12-2021'},
                            {id:10004,'prdname':'water bottle','cost':200,'mfd':'20-01-2021'},
                            {id:10005,'prdname':'bag','cost':600,'mfd':'15-06-2022'}

     ];
    return(
        <div>
         <h1>Shopping App</h1>
         <Cart itemList={items}></Cart>
        </div>
    )
 }
 export default Shopping;