package com.example.SpringEx1.service;

import com.example.SpringEx1.dao.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloImpl implements Hello{
 
 @Override
 public void hi(){
     System.out.println("    hi spring ..................");
  }    
}