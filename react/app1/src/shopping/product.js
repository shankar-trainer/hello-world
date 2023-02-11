import Cart from "./cart";

export default function Product(){

    const items=[
        {id:'56454546','prdname':'shirt',cost:1200,'mfd':'12-01-2022'},
        {id:'56454547','prdname':'pant',cost:1500,'mfd':'12-02-2021'},
        {id:'56454548','prdname':'jeans',cost:2000,'mfd':'11-02-2022'},
        {id:'56454549','prdname':'mobile',cost:11000,'mfd':'15-04-2022'},
        {id:'56454550','prdname':'book',cost:500,'mfd':'16-05-2022'},
        {id:'56454551','prdname':'tv',cost:34000,'mfd':'17-08-2022'},
        {id:'56454552','prdname':'washing machine',cost:24000,'mfd':'18-01-2022'},
        {id:'56454553','prdname':'freeze',cost:2000,'mfd':'22-06-2022'},
        {id:'56454588','prdname':'laptop',cost:35000,'mfd':'23-07-2022'},
        {id:'56454589','prdname':'clock',cost:600,'mfd':'24-09-2022'},
        {id:'56454522','prdname':'watch',cost:4000,'mfd':'25-10-2022'},
        {id:'56454523','prdname':'bike',cost:175000,'mfd':'07-01-2022'},
        {id:'56454524','prdname':'car',cost:250000,'mfd':'08-01-2022'}
    ];
    return(
        <div className="bg-dark text-info w-75 p-5 m-auto">
        <Cart itemList={items}></Cart>
        </div>
    )
}