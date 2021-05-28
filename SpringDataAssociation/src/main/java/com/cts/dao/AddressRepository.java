package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Address;
import com.cts.model.Customer;
@Repository
public interface AddressRepository  extends JpaRepository<Address, Integer> {

}
