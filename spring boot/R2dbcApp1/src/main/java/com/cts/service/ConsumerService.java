package com.cts.service;

import com.cts.model.Consumer;
import com.cts.respository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public void  addConsumer(Consumer consumer){
        consumerRepository.save(consumer).doOnNext(a-> System.out.println("saved "+a)).subscribe();
    }

    public void  getAllConsumer(){
         consumerRepository.findAll().doOnNext(consumer -> System.out.println(consumer)).subscribe();
    }

    public void  searchConsumerById(int id){
         consumerRepository.findById(id).doOnNext(consumer -> System.out.println(consumer)).subscribe();
    }

    public void  deleteConsumerById(int id){
         consumerRepository.deleteById(id).doOnNext(consumer-> System.out.println(consumer)).subscribe();
    }


}
