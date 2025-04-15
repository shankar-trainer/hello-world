package com.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, String> {
}
