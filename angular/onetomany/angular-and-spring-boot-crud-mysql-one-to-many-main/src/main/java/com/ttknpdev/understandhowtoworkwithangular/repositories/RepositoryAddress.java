package com.ttknpdev.understandhowtoworkwithangular.repositories;

import com.ttknpdev.understandhowtoworkwithangular.entities.many.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryAddress extends JpaRepository<Address,Long> {
    @Query(value = "select * from addresses where eid = :eid",nativeQuery = true)
    Iterable<Address> readsAddressesByFK(@Param("eid") Long eid);
}
