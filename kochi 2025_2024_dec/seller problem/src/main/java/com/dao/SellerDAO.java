package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Seller;
import com.bean.Car;
import com.repository.SellerRepository;
import com.repository.CarRepository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class SellerDAO {

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private CarRepository carRepository;

    // Add Seller
    public void addSeller(Seller seller) {
        
       List<Car> list1=seller.getCarList();
        List<Car> list2=new java.util.ArrayList<>();
        for(Car c:list1){
           c.setSeller(seller);
           list2.add(c);
        }
        seller.setCarList(list2);
        sellerRepository.save(seller);
        //System.out.println(list2.size()+"............... list 2 size  "+seller.getCarList().size()+".......");

      //  System.out.println(seller.getCarList().size()+" seller car  size as parameter ");
       // System.out.println(sellerRepository.findAll().size()+" seller size");

        sellerRepository.findAll().forEach(a-> System.out.println(a.getCarList().size()+" car list size ....."));
    }

    // Allocate Car to Seller
    public void buyCar(String sellerId, Car car) {
        Seller seller = sellerRepository.findById(sellerId).orElseThrow(() -> new RuntimeException("Seller not found"));
        car.setSeller(seller);
        seller.getCarList().add(car);
        carRepository.save(car);
    }

    // Find Seller with Maximum Sales Count
    public List<Seller> sellerWithMaximumSalesCount() {
        List<Seller> sellers = sellerRepository.findAll();
        Optional<Seller> max = sellers.stream().
                sorted(
                        (a, b) -> (Integer.valueOf(a.getCarList().size()).compareTo(Integer.valueOf(a.getCarList().size())))).max(
                        (a, b) -> (Integer.valueOf(a.getCarList().size()).compareTo(Integer.valueOf(a.getCarList().size())))
                );
        //System.out.println( max.stream().collect(Collectors.toList())+" final ....");
        List<Seller> collect = max.stream().collect(Collectors.toList());
        return max.stream().collect(Collectors.toList());
    }
    /* public List<Seller> sellerWithMaximumSalesCount() {
        List<Seller> sellers = sellerRepository.findAll();
        List<Seller> list1 = new ArrayList<>();
        int max = 0;

        List<Integer> list2=new ArrayList<>();
        for (Seller s : sellers) {
            int size = s.getCarList().size();
            System.out.println("size is.. "+size);
            list2.add(size);
        }

        max= Collections.max(list2);
        System.out.println("max car sold is "+max);
        for(int x=0;x<list2.size();x++){
            if(list2.get(x)==max){
                System.out.println("list add operation ");
                list1.add(sellers.get(x));
            }
        }
        System.out.println(list1.size()+"      final list size ");
        return list1;
    }*/

}


