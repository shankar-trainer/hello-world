package org.abc.service;

import org.abc.entity.Order;
import org.abc.dto.Payment;
import org.abc.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Lazy;
import org.abc.dto.TransactionResponse;
import org.abc.dto.TransactionRequest;
import java.util.List;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

	@Autowired
	@Lazy
	RestTemplate template;

    public  TransactionResponse saveOrder(TransactionRequest request){
      Order order = request.getOrder();
      Payment payment = request.getPayment();
      payment.setOrderId(order.getId());
      payment.setAmount(order.getPrice());

      Payment paymentResponse = template.postForObject("http://localhost:9091/payment/add", payment, Payment.class);

      orderRepository.save(order);
       return new TransactionResponse(order,paymentResponse.getAmount());  
    }

    public List<Order> getOrderList(){
        return  orderRepository.findAll();
    }

    
	@Bean 
	public RestTemplate restTemplate(RestTemplateBuilder builder){
	return builder.build();
	}
}
/*
http://localhost:9090/order/add
/bookorder in postman 
   
   "order":{
	"id":103,
    "name":"Mobile",
    "qty":1,
    "price":8000
   },

   "payment":{
	
   }
 result in h2 database 
		order 
		   id,name,price,qty
		   103,mobile,8000,1

		 payment     
		   payment_id, amount, order_id, payment_status,transaction_status
		   1         ,8000,103,        success, "random no tr id "

*/