package com.capgemini.collection;

import java.util.ArrayList;
import java.util.List;

class Employee1 {
}

class Manager extends Employee1 {
}

class Director extends Manager {
}
class User{
	
}
public class GenericEx1 {

	public static void main(String[] args) {
     List<Director> list1=new ArrayList<>();
     list1.add(new Director());     
     //list1.add(new Manager());
     
     List<? super Manager> list2=new ArrayList<>();
     list2.add(new Manager());
     list2.add(new Director());
     
     List<? extends  Manager> list3=new ArrayList<>();
     
    
     
     
	}
}
