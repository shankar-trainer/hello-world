package org.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.capg.model.Address;

@Repository
public interface AddressRepository extends  JpaRepository<Address, Integer>{

}
