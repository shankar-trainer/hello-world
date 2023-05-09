package com.tvscredit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvscredit.model.Address;
import com.tvscredit.model.Customer;

@Repository
public interface AddressDao  extends JpaRepository<Address, Integer> {

}
