import Cart from "./cart";
import Clock from '../clock';
import Product from "./product";
import Department from "../clock1";
export default function Shopping(){
  return(
    <div className="bg-dark text-white">
    
   <span style={{'text-align':'right'}}> <Clock></Clock></span>
    
   <Department></Department>
    
    <h1>Shopping Kart</h1>
    <Product></Product>
    </div>
  )
}