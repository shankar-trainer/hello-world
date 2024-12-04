package com.ukg.repository;

import com.ukg.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {

    Customer findByName(String name);
    Customer findByNameAndSsn(String name,String ssn);

    @Modifying
    @Query("update Customer c set c.name=?1, c.ssn=?2 where c.id=?3")
    void   updateCustomer( String name, String ssn,long id);

}
