run all service-registry,OrderService,PaymentService

 
  http://localhost:9090/order/add   
    in postman 
   
  {
    "order":{
      "id":103,
      "name":"Mobile",
      "qty":1,
      "price":8000
},
  "payment":{
      
  }
}

output in postman

{
    "order": {
        "id": 103,
        "name": "Mobile",
        "qty": 1,
        "price": 8000.0
    },
    "amount": 8000.0
}
  


result in h2 database 
http://localhost:9090/h2-console

select * from order_table;
ID  	NAME  	PRICE  	QTY  
103	Mobile	8000.0	1

SELECT * FROM PAYMENT_TABLE;
PAYMENT_ID  	AMOUNT  	ORDER_ID  
1	8000.0	103
2	8000.0	103


