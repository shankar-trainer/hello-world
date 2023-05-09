package com.tvscredit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvscredit.model.Customer;
import com.tvscredit.model.Product;
import com.tvscredit.model.User;

@Repository
public interface UserDao  extends JpaRepository<User, Integer> {

}
