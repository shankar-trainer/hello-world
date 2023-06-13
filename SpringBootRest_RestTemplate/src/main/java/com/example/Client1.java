package com.example;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Client1 {
    public static void main(String[] args) {
        RestTemplate template=new RestTemplate();
        try {
            ResponseEntity<Product> forEntity = template.getForEntity("http://localhost:9090/product/searchProduct/22", Product.class);
            if (forEntity != null) {
                Product product = forEntity.getBody();
                System.out.println(product);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

        try{
            //template.postForEntity("http://localhost:9090/product/addProduct");
            template.delete("http://localhost:9090/product/deleteProduct/52");
        }
        catch (Exception e){

        }

    }
}
