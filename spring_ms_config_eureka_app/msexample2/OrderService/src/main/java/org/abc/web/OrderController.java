package org.abc.web;


import java.util.List;
import org.abc.dto.TransactionResponse;
import org.abc.dto.TransactionRequest;
import org.abc.entity.Order;
import org.abc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@RequestMapping("/all")
     public List<Order> getAllOrder() {
       return   orderService.getOrderList();  	 
     }	
	
	@PostMapping("/add")
	public TransactionResponse saveOrder(@RequestBody TransactionRequest request) {
		return   orderService.saveOrder(request);  	 
	}	
	
}
/* 
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


*/