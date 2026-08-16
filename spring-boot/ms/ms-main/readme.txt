http://localhost:9090/product
post
{
"prdName":"shirt",
"prdCost":1400
}

http://localhost:7070/order
post
{
"orderDate":"2025-11-22",
"qty":10,
"prdId":52
}

get
http://localhost:7070/order

