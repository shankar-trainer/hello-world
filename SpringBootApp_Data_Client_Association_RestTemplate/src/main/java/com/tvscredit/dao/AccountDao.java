package com.tvscredit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvscredit.model.Account;
import com.tvscredit.model.Customer;
import com.tvscredit.model.Product;

@Repository
public interface AccountDao  extends JpaRepository<Account, Integer> {

}
