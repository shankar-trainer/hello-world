package org.com.dao;
//package org.com.pl;

import org.com.model.Item;
//import org.com.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
//@Repository
  //      ("itemDao")
public interface ItemDao extends JpaRepository<Item,Integer> {


}
